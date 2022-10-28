import java.util.ArrayList;

/**
 * Creating a class to document and organize cheese according to quality
 *
 * @author Samuelt
 * @version Oct 20, 2022
 *
 */
public class Cheese {
    private int qualityCheck;
    private String name;
    ArrayList<Integer> cheeseArray = new ArrayList<Integer>();
    
    
    public Cheese(String cheeseName, int grade) {
        qualityCheck = grade;  
        name = cheeseName;
    }
    
    public int getCheeseQuality() {
        return this.qualityCheck;
    }
    
    public void printCheeseQuality() {
        System.out.println(name + " expected quality -> " + qualityCheck);
    }
    
    public String getName() {
        System.out.print(name);
        return name;
    }
    
    
    public boolean qualityCheck(int cheeseinQuestion) {
        if (cheeseinQuestion != qualityCheck) {  //better way of doing this
            return true;
        }
        return false;
    }
    public void qualityManagement() {
        //sort through list and delete
        int returnCheck = cheeseArray.size();
        for (int i = 0; i < cheeseArray.size(); i++) {
            if(qualityCheck(cheeseArray.get(i))) {
                cheeseArray.remove(i);
                i--;
            }
        }
        if (returnCheck != cheeseArray.size()) {
            System.out.println(name + " Quality Managed");
        }
    }
    
    public int returnCheeseArray() {
        getName();
        System.out.print("{");
        for (int i = 0; i < cheeseArray.size(); i++) {
            System.out.print(cheeseArray.get(i));
        }
        System.out.println("}");
        return 0;
    }
    
    public void setCheese(int setQuality) {
        this.qualityCheck = setQuality;
    }
    
    public void addCheese(int cheeseQuality) {
        cheeseArray.add(cheeseQuality);
    }
    
    public static void main(String []args) {
        Cheese Cheddar = new Cheese("Cheddar", 5);
        Cheese Swiss = new Cheese("Swiss",6);
        Cheese Gouda = new Cheese("Gouda",8);
        Cheddar.printCheeseQuality();
        Swiss.printCheeseQuality();
        Gouda.printCheeseQuality();
        
        Cheddar.addCheese(8);
        Cheddar.addCheese(5);
        Cheddar.addCheese(4);
        Cheddar.addCheese(5);
        Cheddar.addCheese(5);
        Cheddar.returnCheeseArray();
        Cheddar.qualityManagement();
        Cheddar.returnCheeseArray();
        Swiss.addCheese(4);
        Swiss.addCheese(6);
        Swiss.addCheese(6);
        Swiss.addCheese(8);
        Swiss.returnCheeseArray();
        Swiss.qualityManagement();
        Swiss.returnCheeseArray();
        Gouda.addCheese(8);
        Gouda.returnCheeseArray();  
    } 
}

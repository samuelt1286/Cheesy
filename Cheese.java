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
    ArrayList<Integer> cheeseArray = new ArrayList<Integer>();
    
    public Cheese(int grade) {
        qualityCheck = grade;    
    }
    
    public int getCheeseQuality() {
        return this.qualityCheck;
    }
    
    public boolean qualityCheck(int cheeseinQuestion) {
        if (cheeseinQuestion != qualityCheck) {  //better way of doing this
            return true;
        }
        return false;
    }
    public void qualityManagement() {
        //sort through list and delete
        for (int i = 0; i < cheeseArray.size(); i++) {
            if(qualityCheck(cheeseArray.get(i))) {
                cheeseArray.remove(i);
                i--;
            }
        }
    }
    
    public int returnCheeseArray() {
        for (int i = 0; i < cheeseArray.size(); i++) {
            System.out.println(cheeseArray.get(i));
        }
        return 0;
    }
    
    public void setCheese(int setQuality) {
        this.qualityCheck = setQuality;
    }
    
    public void addCheese(int cheeseQuality) {
        cheeseArray.add(cheeseQuality);
    }
    
    public static void main(String []args) {
        Cheese Cheddar = new Cheese(5);
        Cheese Swiss = new Cheese(6);
        Cheese Gouda = new Cheese(8);
       // System.out.println(Cheddar.getCheese());
        Cheddar.addCheese(8);
        Cheddar.addCheese(5);
        Cheddar.addCheese(4);
        Cheddar.addCheese(5);
        Cheddar.addCheese(5);
        Cheddar.qualityManagement();
        Cheddar.returnCheeseArray();
        Swiss.addCheese(4);
        Gouda.addCheese(8);
        
       System.out.println(Cheddar.getCheeseQuality());
       System.out.println(Swiss.getCheeseQuality());
       System.out.println(Gouda.getCheeseQuality());
        
    }
}

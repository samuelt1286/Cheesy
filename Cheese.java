import java.util.ArrayList;

/**
 * Creating a class to document and organize cheese according to quality
 *
 * @author Samuelt
 * @version Nov 20, 2022
 *
 */
public class Cheese {
    private int qualityCheck;
    public int bounds = qualityCheck;
    private String name;
    ArrayList<Integer> cheeseArray = new ArrayList<Integer>();
    
    
    /**
     * Construct a new Cheese object.
     *
     * @param cheeseName - name of cheese
     * @param grade - expected quality of cheese
     */
    public Cheese(String cheeseName, int grade) {
        qualityCheck = grade;  
        name = cheeseName;
    }
    
    /**
     * This function returns the quality of the cheese/object.
     *
     * @return this.qualityCheck
     */
    public int getCheeseQuality() {
        return this.qualityCheck;
    }
    
    /**
     * This function shows the expected quality of the cheese.
     *
     */
    public void printCheeseQuality() {
        System.out.println(name + " expected quality -> " + qualityCheck);
    }
    
    /**
     * This function returns the name of the cheese/object.
     *
     * @return name
     */
    public String getName() {
        System.out.print(name);
        return name;
    }
    
    
    /**
     * This function checks the quality of the cheese and returns false if not to standard.
     *
     * @param cheeseinQuestion - quality of current cheese/object
     * @return - whether good or not
     */
    public boolean qualityCheck(int cheeseinQuestion) {
        if (cheeseinQuestion != qualityCheck) {  //better way of doing this
            return true;
        }
        return false;
    }
    /**
     * This function checks the quality of the cheeses in the system and deletes
     * what is not to standard.
     *
     */
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
    
    /**
     * This function returns the current amount of cheese with Recursion
     *
     * @param arraySize the amount of cheese of that type
     */
    public void returnCheeseArray(int arraySize) {
        System.out.print("{");
        getName();
        if ((arraySize) < 0) {
            return;
        }
        System.out.println(" " + cheeseArray.get(arraySize) + "}");
        returnCheeseArray(arraySize - 1);
    }
    
    
    /**
     * This function sets the quality of the cheese if needed to change
     *
     * @param setQuality - quality of cheese
     */
    public void setCheese(int setQuality) {
        this.qualityCheck = setQuality;
    }
    
    /**
     * This function adds a new cheese/object to the type of cheese
     *
     * @param cheeseQuality - current quality of new cheese
     */
    public void addCheese(int cheeseQuality) {
        cheeseArray.add(cheeseQuality);
    }
    
    /**
     * Main method, executing the class 
     *
     */
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
        Cheddar.returnCheeseArray(Cheddar.cheeseArray.size()-1);
        Cheddar.qualityManagement();
        Cheddar.returnCheeseArray(Cheddar.cheeseArray.size()-1);
        Swiss.addCheese(4);
        Swiss.addCheese(6);
        Swiss.addCheese(6);
        Swiss.addCheese(8);
        Swiss.returnCheeseArray(Swiss.cheeseArray.size()-1);
        Swiss.qualityManagement();
        Swiss.returnCheeseArray(Swiss.cheeseArray.size()-1);
        Gouda.addCheese(8);
        Gouda.returnCheeseArray(Gouda.cheeseArray.size()-1);
        
        
    }

  
}

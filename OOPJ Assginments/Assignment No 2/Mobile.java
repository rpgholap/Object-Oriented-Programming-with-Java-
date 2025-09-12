/*
Problem 2: Simple Mobile Tracker
Scenario: A shop wants to count how many mobiles are added to their inventory.
Requirements:
1. Create a class Mobile with instance variable: model (String).
2. Create a static variable totalMobiles to count total mobiles added.
3. Constructor should initialize model and increment totalMobiles.
4. Create a getter for model.
5. Create a static method showTotalMobiles() to print total mobiles.
Input Example:
Mobile1: model = "Samsung Galaxy M32"
Mobile2: model = "Redmi Note 12"
Expected Output:
Mobile1 model: Samsung Galaxy M32
Mobile2 model: Redmi Note 12
Total mobiles in stock: 2
*/



/**
 * Represents a single mobile phone with a model.
 * It also keeps a static count of all mobile phones created.
 */
public class Mobile {

    // An instance variable to store the model name for each specific mobile object.
    private String model;

    // A static variable that belongs to the Mobile class, not to any object.
    // It is used to keep a count of all Mobile objects created.
    private static int totalMobiles = 0;

    /**
     * Constructor for the Mobile class.
     * Initializes the mobile model and increments the static totalMobiles counter.
     * @param model The model name of the mobile.
     */
    public Mobile(String model) {
        this.model = model;
        // Increment the static counter every time a new Mobile object is created.
        totalMobiles++;
    }

    /**
     * Getter method to retrieve the model name of this specific mobile.
     * @return The mobile model.
     */
    public String getModel() {
        return model;
    }

    /**
     * A static method to display the total number of mobiles in stock.
     * This method can be called directly from the class (e.g., Mobile.showTotalMobiles())
     * without needing an object instance.
     */
    public static void showTotalMobiles() {
        System.out.println("Total mobiles in stock: " + totalMobiles);
    }

    /**
     * The main method to demonstrate the functionality of the Mobile class.
     */
    public static void main(String[] args) {
        // Create two Mobile objects.
        Mobile mobile1 = new Mobile("Samsung Galaxy M32");
        Mobile mobile2 = new Mobile("Redmi Note 12");

        // Print the model for each individual mobile.
        System.out.println("Mobile1 model: " + mobile1.getModel());
        System.out.println("Mobile2 model: " + mobile2.getModel());

        // Call the static method to show the total count.
        // Note that we call this method using the class name, not an object.
        Mobile.showTotalMobiles();
    }
}

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


public class Mobile {

    // An instance variable to store the model name for each specific mobile object.
    private String model;

    // A static variable that belongs to the Mobile class, not to any object.
    // It is used to keep a count of all Mobile objects created.
    private static int totalMobiles = 0;

    public Mobile(String model) {
        this.model = model;
        // Increment the static counter every time a new Mobile object is created.
        totalMobiles++;
    }

    public String getModel() {
        return model;
    }

    public static void showTotalMobiles() {
        System.out.println("Total mobiles in stock: " + totalMobiles);
    }

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

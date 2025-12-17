/*
Problem 1: Counter for Cups
Scenario: You are keeping track of how many cups of tea are prepared in your home.
Requirements:
1. Create a class TeaCup with instance variable: teaType (String).
2. Create a static variable totalCups to count all cups created.
3. Constructor should initialize teaType and increment totalCups.
4. Create getter for teaType.
5. Create a static method showTotalCups() to print total cups.
Input Example:
Cup1: teaType = "Masala Tea"
Cup2: teaType = "Green Tea"
Cup3: teaType = "Ginger Tea"
Expected Output:
Cup1 type: Masala Tea
Cup2 type: Green Tea
Cup3 type: Ginger Tea
Total cups made: 3
*/

/**
 * Represents a single tea cup with a specific tea type.
 * It also keeps a static count of all tea cups created.
 */
public class TeaCup {

    // An instance variable to store the type of tea for each specific cup object.
    private String teaType;

    // A static variable that belongs to the TeaCup class, not to any object.
    // It is used to keep a count of all TeaCup objects created.
    private static int totalCups = 0;

    /**
     * Constructor for the TeaCup class.
     * Initializes the teaType and increments the static totalCups counter.
     * @param teaType The type of tea (e.g., "Masala Tea", "Green Tea").
     */
    public TeaCup(String teaType) {
        this.teaType = teaType;
        // Increment the static counter every time a new TeaCup object is created.
        totalCups++;
    }

    /**
     * Getter method to retrieve the tea type of this specific cup.
     * @return The tea type.
     */
    public String getTeaType() {
        return teaType;
    }

    /**
     * A static method to display the total number of cups created.
     * This method can be called directly from the class (e.g., TeaCup.showTotalCups())
     * without needing an object instance.
     */
    public static void showTotalCups() {
        System.out.println("Total cups made: " + totalCups);
    }

    /**
     * The main method to demonstrate the functionality of the TeaCup class.
     */
    public static void main(String[] args) {
        // Create three TeaCup objects.
        TeaCup cup1 = new TeaCup("Masala Tea");
        TeaCup cup2 = new TeaCup("Green Tea");
        TeaCup cup3 = new TeaCup("Ginger Tea");

        // Print the tea type for each individual cup.
        System.out.println("Cup1 type: " + cup1.getTeaType());
        System.out.println("Cup2 type: " + cup2.getTeaType());
        System.out.println("Cup3 type: " + cup3.getTeaType());

        // Call the static method to show the total count.
        // Note that we call this method using the class name, not an object.
        TeaCup.showTotalCups();
    }
}

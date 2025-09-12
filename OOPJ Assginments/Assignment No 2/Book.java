/*
Problem 3: Library Book Tracker
Scenario: A library in Delhi wants to track how many books are issued in total and details of each book.
Requirements:
1. Create a Book class with instance variables: title (String), author (String), issued (boolean).
2. Create static variable totalIssuedBooks to keep track of the total number of books issued.
3. Create a constructor to initialize the book details.
4. Create getters and setters for all instance variables.
5. Create a static method showTotalIssued() to print total issued books.
6. Write a main class to create 3 books, issue some of them (issued = true), and show total issued
books.
Input Example:
Book1: "Harry Potter", Author: "J.K. Rowling", Issued: true
Book2: "Five Point Someone", Author: "Chetan Bhagat", Issued: false
Book3: "Rich Dad Poor Dad", Author: "Robert Kiyosaki", Issued: true
Expected Output:
Book1 issued? true
Book2 issued? false
Book3 issued? true
Total books issued: 2
*/


/**
 * Represents a single library book with a title and author.
 * It also tracks whether the book has been issued and keeps a static count
 * of all issued books.
 */
public class Book {

    // Instance variables to hold the details for each book object.
    private String title;
    private String author;
    private boolean issued;

    // A static variable to count the total number of books that have been issued.
    private static int totalIssuedBooks = 0;

    /**
     * Constructor for the Book class.
     * Initializes the book's title, author, and issued status.
     * @param title The title of the book.
     * @param author The author of the book.
     * @param issued The initial issued status of the book.
     */
    public Book(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        // When a new book is created, check if it's issued and update the static counter.
        if (issued) {
            totalIssuedBooks++;
        }
    }

    /**
     * Setter method to change the issued status of the book.
     * This method correctly updates the static counter.
     * @param issued The new issued status.
     */
    public void setIssued(boolean issued) {
        if (this.issued != issued) { // Check if the status is actually changing
            this.issued = issued;
            if (issued) {
                totalIssuedBooks++;
            } else {
                totalIssuedBooks--;
            }
        }
    }

    /**
     * Getter method to retrieve the title of the book.
     * @return The book's title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * A static method to display the total number of books that have been issued.
     * This method can be called directly from the class.
     */
    public static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }

    /**
     * The main method to demonstrate the functionality of the Book class.
     */
    public static void main(String[] args) {
        // Create three Book objects.
        // The counter is incremented directly in the constructor based on the initial issued status.
        Book book1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book book2 = new Book("Five Point Someone", "Chetan Bhagat", false);
        Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);

        // Display the titles of the books for context.
        System.out.println("Book 1 Title: " + book1.getTitle());
        System.out.println("Book 2 Title: " + book2.getTitle());
        System.out.println("Book 3 Title: " + book3.getTitle());

        // Call the static method to show the total count of issued books.
        Book.showTotalIssued();

        // Example of updating a book's issued status and seeing the counter change.
        System.out.println("\n--- Updating Status ---");
        book2.setIssued(true); // Now book2 is issued
        System.out.println("Book 2 issued status changed to true.");
        Book.showTotalIssued();

        book1.setIssued(false); // Book1 is returned
        System.out.println("Book 1 issued status changed to false.");
        Book.showTotalIssued();
    }
}

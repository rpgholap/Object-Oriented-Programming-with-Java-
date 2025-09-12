/*
Problem 17: Library Book Addition
Scenario:
Create Book class with bookId, title, author.
● Constructor + Getters/Setters
● Create Library class with libraryName and static totalBooks
● Method addBook(Book b) → increments totalBooks
● Method displayTotalBooks() → prints totalBooks
● Add 2 books to library and display total books
*/


/**
 * The Book class represents a single book with an ID, title, and author.
 */
class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

/**
 * The BookTracker class manages the library's name and tracks the total number of books added.
 * It uses a static variable for the total book count.
 */
public class BookTracker {
    private String libraryName;
    private static int totalBooks = 0;

    public BookTracker(String libraryName) {
        this.libraryName = libraryName;
    }

    /**
     * Increments the static counter for total books whenever a new book is added.
     * @param b The Book object to be added.
     */
    public void addBook(Book b) {
        totalBooks++;
        System.out.println("Book '" + b.getTitle() + "' has been added to the library.");
    }

    /**
     * A static method to display the total number of books across all library instances.
     */
    public static void displayTotalBooks() {
        System.out.println("Total books in the library system: " + totalBooks);
    }

    public static void main(String[] args) {
        // Create a new library instance
        BookTracker myLibrary = new BookTracker("City Central Library");

        // Create two book objects
        Book book1 = new Book(101, "The Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book(102, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams");

        // Add the books to the library, which increments the static counter
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        System.out.println();

        // Display the total number of books using the static method
        BookTracker.displayTotalBooks();
    }
}

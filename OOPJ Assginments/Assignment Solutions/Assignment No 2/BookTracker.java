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
class Book1 {
    private int bookId;
    private String title;
    private String author;

    public Book1(int bookId, String title, String author) {
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

public class BookTracker {
    private String libraryName;
    private static int totalBooks = 0;

    public BookTracker(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book1 b) {
        totalBooks++;
        System.out.println("Book '" + b.getTitle() + "' has been added to the library.");
    }


    public static void displayTotalBooks() {
        System.out.println("Total books in the library system: " + totalBooks);
    }

    public static void main(String[] args) {
        // Create a new library instance
        BookTracker myLibrary = new BookTracker("City Central Library");

        // Create two book objects
        Book1 book1 = new Book1(101, "The Lord of the Rings", "J.R.R. Tolkien");
        Book1 book2 = new Book1(102, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams");

        // Add the books to the library, which increments the static counter
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        System.out.println();

        // Display the total number of books using the static method
        BookTracker.displayTotalBooks();
    }
}

/*
30. Library Management System
Scenario: Manage books and library members with borrowing functionality.
Problem Statement:
● Class Book → private variables: bookId, title, author (Encapsulation)
● Abstract Class LibraryMember → instance variables: memberId, name
○ Abstract method borrowBook(Book book)
● Class StudentMember extends LibraryMember → limit 3 books
● Class FacultyMember extends LibraryMember → limit 5 books
● Interface Notifyable → method sendNotification(String message) → notify members about
overdue books
● In main(), create 1 student and 1 faculty, borrow books, send notifications
Sample Input:
Student → borrow 2 books
Faculty → borrow 4 books
Sample Output:
StudentMember Amit borrowed 2 books
FacultyMember Prof. Singh borrowed 4 books
Notification sent to Amit: Return books within 7 days
Notification sent to Prof. Singh: Return books within 14 days
*/

// Book class with encapsulation
class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Getters for accessing private fields if needed
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

// Abstract LibraryMember class
abstract class LibraryMember {
    int memberId;
    String name;

    public LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Abstract method to borrow books
    abstract void borrowBook(Book[] books);
}

// Interface Notifyable
interface Notifyable {
    void sendNotification(String message);
}

// StudentMember class
class StudentMember extends LibraryMember implements Notifyable {
    private final int bookLimit = 3;
    private int borrowedBooks = 0;

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(Book[] books) {
        int canBorrow = Math.min(bookLimit - borrowedBooks, books.length);
        borrowedBooks += canBorrow;
        System.out.println("StudentMember " + name + " borrowed " + canBorrow + " books");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

// FacultyMember class
class FacultyMember extends LibraryMember implements Notifyable {
    private final int bookLimit = 5;
    private int borrowedBooks = 0;

    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(Book[] books) {
        int canBorrow = Math.min(bookLimit - borrowedBooks, books.length);
        borrowedBooks += canBorrow;
        System.out.println("FacultyMember " + name + " borrowed " + canBorrow + " books");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book(1, "Java Programming", "Author A");
        Book book2 = new Book(2, "Data Structures", "Author B");
        Book book3 = new Book(3, "Algorithms", "Author C");
        Book book4 = new Book(4, "Database Systems", "Author D");
        Book book5 = new Book(5, "Operating Systems", "Author E");

        // Creating members
        StudentMember student = new StudentMember(101, "Amit");
        FacultyMember faculty = new FacultyMember(201, "Prof. Singh");

        // Student borrows 2 books
        Book[] studentBooks = {book1, book2};
        student.borrowBook(studentBooks);

        // Faculty borrows 4 books
        Book[] facultyBooks = {book1, book2, book3, book4};
        faculty.borrowBook(facultyBooks);

        // Sending notifications
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}

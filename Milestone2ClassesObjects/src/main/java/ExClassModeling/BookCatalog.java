/*
Model a book as if the class were to be part of a library cataloging system.
 */
package ExClassModeling;

public class BookCatalog {

    /*fields*/
    private String title;
    private String author;
    private String publisher;
    private int pageCount;
    private String genre;
    private double deweyDecimal;
    private int inventoryID;
    private static String[] members;
    private static double[] memberFines;
    private boolean borrowed;
    private String borrowedBy;
    private String borrowedUntil;

    /*ctors*/
    public BookCatalog() {
        //default
    }

    public BookCatalog(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed=false;
    }

    public BookCatalog(String title, String author, String publisher, int pageCount, String genre) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
        this.genre = genre;
        this.borrowed=false;
    }

    /*get/set*/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getDeweyDecimal() {
        return deweyDecimal;
    }

    public void setDeweyDecimal(double deweyDecimal) {
        this.deweyDecimal = deweyDecimal;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    public static String[] getMembers() {
        return members;
    }

    public static void setMembers(String[] members) {
        BookCatalog.members = members;
    }

    public static double[] getMemberFines() {
        return memberFines;
    }

    public static void setMemberFines(double[] memberFines) {
        BookCatalog.memberFines = memberFines;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(String borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    public String getBorrowedUntil() {
        return borrowedUntil;
    }

    public void setBorrowedUntil(String borrowedUntil) {
        this.borrowedUntil = borrowedUntil;
    }
    
    /*behaviors*/
    //generates inventory ID
    //allows a user to borrow a book, stops a user if they have too many fines
    //calculates fines if a book isn't returned on time
}

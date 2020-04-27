/*
Model a book as if the class were to be part of a publishing system that the author uses to write the book.
 */
package ExClassModeling;

public class BookPublishing {

    /*fields*/
    private String title;
    private int pageCount;
    private String genre;
    private double deweyDecimal;
    private String[] storesSellingBook;
    private double totalProfit;
    private static double genreAverageRevenue; //how much do books make in this genre

    /*ctors*/
    public BookPublishing() {
        //default
    }

    public BookPublishing(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public BookPublishing(String title, int pageCount, String genre) {
        this.title = title;
        this.pageCount = pageCount;
        this.genre = genre;
    }

    /*get/set*/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String[] getStoresSellingBook() {
        return storesSellingBook;
    }

    public void setStoresSellingBook(String[] storesSellingBook) {
        this.storesSellingBook = storesSellingBook;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    public static double getGenreAverageRevenue() {
        return genreAverageRevenue;
    }

    public static void setGenreAverageRevenue(double genreAverageRevenue) {
        BookPublishing.genreAverageRevenue = genreAverageRevenue;
    }

    /*behaviors*/
    //find dewey decimal classification for book
    //add or remove stores to the the storesSellingBook array
    //calculate and store profit
}

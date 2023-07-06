package BookSort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.pageCount, otherBook.pageCount);
    }
}

public class BookSort {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        // Create book instances and add them to the list
        Book book1 = new Book("Java Programming", 400);
        bookList.add(book1);

        Book book2 = new Book("Introduction to Algorithms", 900);
        bookList.add(book2);

        Book book3 = new Book("Clean Code", 200);
        bookList.add(book3);

        // Sort the books by page count
        Collections.sort(bookList);

        // Print the sorted book list
        System.out.println("Sorted Book List:");
        for (Book book : bookList) {
            System.out.println(book.getTitle() + " - " + book.getPageCount() + " pages");
        }
    }
}

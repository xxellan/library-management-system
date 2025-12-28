package library;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private OperationLog operationLog;

    public Library() {
        books = new ArrayList<>();
        operationLog = new OperationLog();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookById(int id) {
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        return new ArrayList<>();
    }

    public void borrowBook(int id) {
    }

    public void returnBook(int id) {
    }

    public List<Book> getAvailableBooks() {
        return new ArrayList<>();
    }

    public void printOperationLog() {
    }
}
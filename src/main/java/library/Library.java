package library;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Library {

    private List<Book> books;
    private OperationLog operationLog;

    public Library() {
        books = new ArrayList<>();
        operationLog = new OperationLog();
    }

    // ===== ВЛОЖЕННЫЙ СТАТИЧЕСКИЙ КЛАСС =====
    public static class OperationLog {

        private List<LogEntry> entries = new ArrayList<>();

        public void addEntry(OperationType type, String description) {
            entries.add(new LogEntry(type, description));
        }

        public List<LogEntry> getEntries() {
            return entries;
        }

        public void printLog() {
            for (LogEntry entry : entries) {
                System.out.println(entry);
            }
        }

        // ===== ВНУТРЕННИЙ КЛАСС =====
        public class LogEntry {
            private OperationType type;
            private LocalDateTime timestamp;
            private String description;

            public LogEntry(OperationType type, String description) {
                this.type = type;
                this.description = description;
                this.timestamp = LocalDateTime.now();
            }

            public OperationType getType() {
                return type;
            }

            public LocalDateTime getTimestamp() {
                return timestamp;
            }

            public String getDescription() {
                return description;
            }

            @Override
            public String toString() {
                return "[" + timestamp + "] " + type + ": " + description;
            }
        }

        public enum OperationType {
            ADD_BOOK, BORROW, RETURN
        }
    }
}
public String getStatistics() {
    int total = books.size();
    long availableCount = books.stream().filter(Book::isAvailable).count();
    long borrowedCount = total - availableCount;
    return "Total books: " + total + ", Available: " + availableCount + ", Borrowed: " + borrowedCount;
}
public void removeBook(int id) {
    books.removeIf(book -> book.getId() == id);
    operationLog.addEntry(OperationLog.OperationType.RETURN, "Removed book with ID " + id);
}
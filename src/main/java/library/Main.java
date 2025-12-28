package library;

public class Main {
    public static void main(String[] args) {
        // Создаём библиотеку
        Library library = new Library();

        // Добавляем книги
        library.addBook(new Book(1, "Война и мир", "Л.Н. Толстой", 1869, "978-5-17-090335-2"));
        library.addBook(new Book(2, "Преступление и наказание", "Ф.М. Достоевский", 1866, "978-5-17-090336-9"));
        library.addBook(new Book(3, "Анна Каренина", "Л.Н. Толстой", 1877, "978-5-17-090337-6"));

        // Демонстрация методов
        System.out.println("=== Все книги ===");
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book);
        }

        // Выдача книги
        System.out.println("\nВыдаём книгу ID 2...");
        library.borrowBook(2);

        // Состояние библиотеки после выдачи
        System.out.println("\n=== Книги после выдачи ===");
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book);
        }

        // Возврат книги
        System.out.println("\nВозвращаем книгу ID 2...");
        library.returnBook(2);

        // Состояние библиотеки после возврата
        System.out.println("\n=== Книги после возврата ===");
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book);
        }

        // Вывод журнала операций
        System.out.println("\n=== Журнал операций ===");
        library.operationLog.printLog();
    }
}
package library;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Создаём библиотеку
        Library library = new Library();

        // ===== Добавляем книги =====
        library.addBook(new Book(1, "Война и мир", "Л.Н. Толстой", 1869, "978-5-17-090335-2"));
        library.addBook(new Book(2, "Преступление и наказание", "Ф.М. Достоевский", 1866, "978-5-17-090336-9"));
        library.addBook(new Book(3, "Анна Каренина", "Л.Н. Толстой", 1877, "978-5-17-090337-6"));

        // ===== Показываем все книги =====
        System.out.println("=== Все книги ===");
        List<Book> allBooks = library.getAvailableBooks();
        for (Book book : allBooks) {
            System.out.println(book);
        }

        // ===== Выдаём книгу =====
        System.out.println("\nВыдаём книгу ID 2...");
        library.borrowBook(2);

        // ===== Книги после выдачи =====
        System.out.println("\n=== Книги после выдачи ===");
        allBooks = library.getAvailableBooks();
        for (Book book : allBooks) {
            System.out.println(book);
        }

        // ===== Возвращаем книгу =====
        System.out.println("\nВозвращаем книгу ID 2...");
        library.returnBook(2);

        // ===== Книги после возврата =====
        System.out.println("\n=== Книги после возврата ===");
        allBooks = library.getAvailableBooks();
        for (Book book : allBooks) {
            System.out.println(book);
        }

        // ===== Выводим журнал операций =====
        System.out.println("\n=== Журнал операций ===");
        library.operationLog.printLog();
    
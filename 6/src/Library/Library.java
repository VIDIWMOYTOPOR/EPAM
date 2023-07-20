package Library;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void loadBooks(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String title = data[0].trim();
                String author = data[1].trim();
                String format = data[2].trim();
                Book book = new Book(title, author, format);
                books.add(book);
            }
            System.out.println("Каталог книг успешно загружен.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл каталога книг не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла каталога книг.");
        }
    }

    public void loadUsers(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String username = data[0].trim();
                String email = data[1].trim();
                User user = new User(username, email);
                users.add(user);
            }
            System.out.println("Данные пользователей успешно загружены.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл данных пользователей не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла данных пользователей.");
        }
    }

    public void saveBooks(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Book book : books) {
                writer.println(book.getTitle() + "," + book.getAuthor() + "," + book.getFormat());
            }
            System.out.println("Каталог книг успешно сохранен.");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла каталога книг.");
        }
    }

    public void saveUsers(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (User user : users) {
                writer.println(user.getUsername() + "," + user.getEmail());
            }
            System.out.println("Данные пользователей успешно сохранены.");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла данных пользователей.");
        }
    }

    public void viewCatalog() {
        System.out.println("\n===== Каталог книг =====");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== Добавление пользователя =====");
        System.out.print("Введите имя пользователя: ");
        String username = scanner.nextLine();

        System.out.print("Введите адрес электронной почты: ");
        String email = scanner.nextLine();

        User user = new User(username, email);
        users.add(user);

        System.out.println("Пользователь успешно добавлен.");
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== Добавление книги =====");
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();

        System.out.print("Введите формат книги (электронный или бумажный): ");
        String format = scanner.nextLine();

        Book book = new Book(title, author, format);
        books.add(book);

        System.out.println("Книга успешно добавлена.");

        notifyUsers(book);
    }

    private void notifyUsers(Book book) {
        System.out.println("\n===== Оповещение пользователям =====");
        for (User user : users) {
            System.out.println("Отправка оповещения на электронную почту " + user.getEmail() + " о новой книге: " + book.getTitle());
        }
    }
}

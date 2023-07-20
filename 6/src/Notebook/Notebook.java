package Notebook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook {
    private List<Note> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }

    public void loadNotes(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String theme = data[0].trim();
                String date = data[1].trim();
                String email = data[2].trim();
                String message = data[3].trim();
                Note note = new Note(theme, date, email, message);
                notes.add(note);
            }
            System.out.println("Заметки успешно загружены.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл заметок не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла заметок.");
        }
    }

    public void saveNotes(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Note note : notes) {
                writer.println(note.getTheme() + "," + note.getDate() + "," + note.getEmail() + "," + note.getMessage());
            }
            System.out.println("Заметки успешно сохранены.");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла заметок.");
        }
    }

    public void addNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== Добавление заметки =====");
        System.out.print("Введите тему заметки: ");
        String theme = scanner.nextLine();

        System.out.print("Введите дату создания заметки: ");
        String date = scanner.nextLine();

        System.out.print("Введите электронную почту: ");
        String email = scanner.nextLine();
        if (!isValidEmail(email)) {
            System.out.println("Некорректный формат электронной почты. Заметка не будет добавлена.");
            return;
        }

        System.out.print("Введите сообщение заметки: ");
        String message = scanner.nextLine();

        Note note = new Note(theme, date, email, message);
        notes.add(note);

        System.out.println("Заметка успешно добавлена.");
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void searchByTheme(String theme) {
        System.out.println("\n===== Поиск по теме =====");
        for (Note note : notes) {
            if (note.getTheme().equalsIgnoreCase(theme)) {
                System.out.println(note);
            }
        }
    }

    public void searchByDate(String date) {
        System.out.println("\n===== Поиск по дате =====");
        for (Note note : notes) {
            if (note.getDate().equals(date)) {
                System.out.println(note);
            }
        }
    }

    public void searchByMessage(String keyword) {
        System.out.println("\n===== Поиск по сообщению =====");
        for (Note note : notes) {
            if (note.getMessage().contains(keyword)) {
                System.out.println(note);
            }
        }
    }

    public void sortByTheme() {
        notes.sort((note1, note2) -> note1.getTheme().compareToIgnoreCase(note2.getTheme()));
        System.out.println("\n===== Заметки отсортированы по теме =====");
        for (Note note : notes) {
            System.out.println(note);
        }
    }
}
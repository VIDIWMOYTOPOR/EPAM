package Archive;

import java.io.*;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 10010;

    private Socket clientSocket;
    private ObjectInputStream inputStream;
    private ObjectOutputStream outputStream;
    private Scanner scanner;

    public Client() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        try {
            clientSocket = new Socket(SERVER_HOST, SERVER_PORT);
            inputStream = new ObjectInputStream(clientSocket.getInputStream());
            outputStream = new ObjectOutputStream(clientSocket.getOutputStream());

            System.out.println("Connected to the server.");

            while (true) {
                showMenu();
                int choice = scanner.nextInt();
                scanner.nextLine();
                handleChoice(choice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showMenu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1. View Students");
        System.out.println("2. Add Student");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private void handleChoice(int choice) throws IOException, ClassNotFoundException {
        switch (choice) {
            case 1:
                viewStudents();
                break;
            case 2:
                addStudent();
                break;
            case 0:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void viewStudents() throws IOException, ClassNotFoundException {
        Request request = new Request(RequestType.VIEW);
        outputStream.writeObject(request);

        Response response = (Response) inputStream.readObject();
        if (response.getType() == ResponseType.SUCCESS) {
            List<Student> students = (List<Student>) response.getData();
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("Error: " + response.getMessage());
        }
    }

    private void addStudent() throws IOException, ClassNotFoundException {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Student newStudent = new Student(name, age);
        Request request = new Request(RequestType.ADD, newStudent);
        outputStream.writeObject(request);

        Response response = (Response) inputStream.readObject();
        System.out.println(response.getMessage());
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}

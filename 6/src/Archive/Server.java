package Archive;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final int PORT = 10010;
    private static final String FILE_NAME = "C:\\Education\\practice\\Tasks\\src\\Archive\\archive.xml";
    private List<Student> students;
    private StudentArchive studentArchive;

    public Server() {
        this.studentArchive = new StudentArchive(FILE_NAME);
        this.students = studentArchive.loadStudents();
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started. Listening on port " + PORT);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private synchronized void saveStudents() {
        studentArchive.saveStudents(students);
    }

    private class ClientHandler extends Thread {
        private final Socket clientSocket;
        private ObjectInputStream inputStream;
        private ObjectOutputStream outputStream;

        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try {
                inputStream = new ObjectInputStream(clientSocket.getInputStream());
                outputStream = new ObjectOutputStream(clientSocket.getOutputStream());

                while (true) {
                    Request request = (Request) inputStream.readObject();
                    if (request == null) {
                        break;
                    }

                    Response response = processRequest(request);
                    outputStream.writeObject(response);
                    outputStream.flush();
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private Response processRequest(Request request) {
            Response response;
            switch (request.getType()) {
                case VIEW:
                    response = new Response(ResponseType.SUCCESS, new ArrayList<>(students));
                    break;
                case ADD:
                    Student newStudent = (Student) request.getData();
                    students.add(newStudent);
                    saveStudents();
                    response = new Response(ResponseType.SUCCESS, "Student added successfully.");
                    break;
                default:
                    response = new Response(ResponseType.ERROR, "Invalid request type.");
            }
            return response;
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
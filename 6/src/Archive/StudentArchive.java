package Archive;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import Archive.Student;

public class StudentArchive {
    private String fileName;

    public StudentArchive(String fileName) {
        this.fileName = fileName;
    }

    public List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (List<Student>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public void saveStudents(List<Student> students) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package Exercises.File;

import java.util.ArrayList;
import java.util.List;

public class ex_1 {
    public static void main(String[] args) {
        class File {
            private String name;
            private String content;

            public File(String name, String content) {
                this.name = name;
                this.content = content;
            }

            public String getName() {
                return name;
            }

            public String getContent() {
                return content;
            }

            public void rename(String newName) {
                this.name = newName;
            }

            public void add(String content) {
                this.content += content;
            }

            public void delete() {
                this.content = "";
            }

            @Override
            public String toString() {
                return "File{" +
                        "name='" + name + '\'' +
                        ", content='" + content + '\'' +
                        '}';
            }
        }

        class Directory {
            private String name;
            private List<File> files;

            public Directory(String name) {
                this.name = name;
                this.files = new ArrayList<>();
            }

            public String getName() {
                return name;
            }

            public void createFile(String fileName, String fileContent) {
                File file = new File(fileName, fileContent);
                files.add(file);
            }

            public void renameFile(String fileName, String newName) {
                for (File file : files) {
                    if (file.getName().equals(fileName)) {
                        file.rename(newName);
                        break;
                    }
                }
            }

            public void addToFile(String fileName, String content) {
                for (File file : files) {
                    if (file.getName().equals(fileName)) {
                        file.add(content);
                        break;
                    }
                }
            }

            public void deleteOfFile(String fileName) {
                for (File file : files) {
                    if (file.getName().equals(fileName)) {
                        file.delete();
                        break;
                    }
                }
            }

            public void print() {
                for (File file : files) {
                    System.out.println(file);
                }
            }
        }

        Directory directory = new Directory("Text Files");

        directory.createFile("file1.txt", "This is the content of file 1.");
        directory.createFile("file2.txt", "This is the content of file 2.");

        directory.addToFile("file1.txt", " Additional content for file 1.");
        directory.addToFile("file2.txt", " Additional content for file 2.");

        System.out.println("Files in the directory:");
        directory.print();

        directory.renameFile("file1.txt", "new_file1.txt");

        System.out.println("\nFiles after renaming:");
        directory.print();

        directory.deleteOfFile("file2.txt");

        System.out.println("\nFiles after deleting content:");
        directory.print();
    }
}

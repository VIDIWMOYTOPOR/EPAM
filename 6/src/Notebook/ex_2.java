package Notebook;

public class ex_2 {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();

        notebook.loadNotes("notes.txt");

        notebook.addNote();

        notebook.searchByTheme("Покупки");

        notebook.searchByDate("2021-04-12");

        notebook.searchByMessage("важно");

        notebook.sortByTheme();

        notebook.saveNotes("notes.txt");
    }
}

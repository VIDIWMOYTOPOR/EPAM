package Library;

public class ex_1 {
    public static void main(String[] args) {
        Library library = new Library();

        library.loadBooks("books.txt");

        library.loadUsers("users.txt");

        library.addUser();

        library.addBook();

        library.saveBooks("books.txt");

        library.saveUsers("users.txt");

        library.viewCatalog();
    }
}

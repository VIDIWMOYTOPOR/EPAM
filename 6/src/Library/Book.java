package Library;

public class Book {
    private String title;
    private String author;
    private String format;

    public Book(String title, String author, String format) {
        this.title = title;
        this.author = author;
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}

package SimpleClassesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class ex_9 {
    public static void main(String[] args) {
        class Book {
            private int id;
            private String title;
            private List<String> authors;
            private String publisher;
            private int year;
            private int pageCount;
            private double price;
            private String bindingType;

            public Book(int id,
                        String title,
                        List<String> authors,
                        String publisher,
                        int year,
                        int pageCount,
                        double price,
                        String bindingType) {
                this.id = id;
                this.title = title;
                this.authors = authors;
                this.publisher = publisher;
                this.year = year;
                this.pageCount = pageCount;
                this.price = price;
                this.bindingType = bindingType;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<String> getAuthors() {
                return authors;
            }

            public void setAuthors(List<String> authors) {
                this.authors = authors;
            }

            public String getPublisher() {
                return publisher;
            }

            public void setPublisher(String publisher) {
                this.publisher = publisher;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public int getPageCount() {
                return pageCount;
            }

            public void setPageCount(int pageCount) {
                this.pageCount = pageCount;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public String getBindingType() {
                return bindingType;
            }

            public void setBindingType(String bindingType) {
                this.bindingType = bindingType;
            }

            @Override
            public String toString() {
                return "Book{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", authors=" + authors +
                        ", publisher='" + publisher + '\'' +
                        ", year=" + year +
                        ", pageCount=" + pageCount +
                        ", price=" + price +
                        ", bindingType='" + bindingType + '\'' +
                        '}';
            }
        }

        class Bookstore {
            private List<Book> books;

            public Bookstore() {
                books = new ArrayList<>();
            }

            public void addBook(Book book) {
                books.add(book);
            }

            public List<Book> getBooksByAuthor(String author) {
                List<Book> result = new ArrayList<>();
                for (Book book : books) {
                    List<String> authors = book.getAuthors();
                    if (authors.contains(author)) {
                        result.add(book);
                    }
                }
                return result;
            }

            public List<Book> getBooksByPublisher(String publisher) {
                List<Book> result = new ArrayList<>();
                for (Book book : books) {
                    if (book.getPublisher().equals(publisher)) {
                        result.add(book);
                    }
                }
                return result;
            }

            public List<Book> getBooksPublishedAfterYear(int year) {
                List<Book> result = new ArrayList<>();
                for (Book book : books) {
                    if (book.getYear() > year) {
                        result.add(book);
                    }
                }
                return result;
            }
        }

        Bookstore bookstore = new Bookstore();

        List<String> authors1 = new ArrayList<>();
        authors1.add("Автор1");
        authors1.add("Автор2");
        Book book1 = new Book(1,
                "Название1",
                authors1,
                "Издательство1",
                2020,
                200,
                10.99,
                "Твердый переплет");
        bookstore.addBook(book1);

        List<String> authors2 = new ArrayList<>();
        authors2.add("Автор2");
        authors2.add("Автор3");
        Book book2 = new Book(2,
                "Название2",
                authors2,
                "Издательство2",
                2018, 150,
                8.99,
                "Мягкий переплет");
        bookstore.addBook(book2);

        List<String> authors3 = new ArrayList<>();
        authors3.add("Автор1");
        authors3.add("Автор3");
        Book book3 = new Book(3,
                "Название3",
                authors3,
                "Издательство1",
                2021,
                180,
                12.99,
                "Твердый переплет");
        bookstore.addBook(book3);

        System.out.println("Список книг автора 'Автор2':");
        List<Book> booksByAuthor = bookstore.getBooksByAuthor("Автор2");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }

        System.out.println("\nСписок книг издательства 'Издательство1':");
        List<Book> booksByPublisher = bookstore.getBooksByPublisher("Издательство1");
        for (Book book : booksByPublisher) {
            System.out.println(book);
        }

        System.out.println("\nСписок книг, выпущенных после 2019 года:");
        List<Book> booksPublishedAfterYear = bookstore.getBooksPublishedAfterYear(2019);
        for (Book book : booksPublishedAfterYear) {
            System.out.println(book);
        }
    }
}

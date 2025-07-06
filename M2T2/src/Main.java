import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collector;

class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int pages;

    public Book(String title, String author, int publicationYear, int pages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }
    public int getPages(){
        return this.pages;
    }

    @Override
    public String toString() {
        return title + " by " + author + "(" + publicationYear + ", " + pages + "pages)";
    }

    public static Comparator<Book> compareByPages() {
        return Comparator.comparing(Book::getPages);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }  else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}

class Student {
    private String name;
    private List<Book> bookList;

    public Student(String name, List<Book> bookList) {
        this.name = name;
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

public  class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", Arrays.asList(
                new Book("Book A", "Author 1", 1999, 300),
                new Book("Book B", "Author 1", 2001, 150),
                new Book("Book C", "Author 2", 2005, 200),
                new Book("Book D", "Author 3", 2010, 320),
                new Book("Book E", "Author 4", 2003, 400)
        )));
        students.add(new Student("Bob", Arrays.asList(
                new Book("Book F", "Author 5", 2001, 250),
                new Book("Book G", "Author 6", 1995, 100),
                new Book("Book B", "Author 1", 2001, 150),
                new Book("Book H", "Author 7", 2018, 180),
                new Book("Book I", "Author 8", 2008, 300)
        )));
        students.add(new Student("Charlie", Arrays.asList(
                new Book("Book J", "Author 9", 2000, 350),
                new Book("Book A", "Author 1", 1999, 300),
                new Book("Book K", "Author 10", 2015, 500),
                new Book("Book L", "Author 11", 2021, 200),
                new Book("Book M", "Author 12", 2010, 250)
        )));

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBookList().stream())
                .sorted(Book.compareByPages())
                .distinct()
                .filter(book -> book.getPublicationYear() > 2000)
                .limit(3)
                .map(Book::getPublicationYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Year of publication: " + year),
                        () -> System.out.println("No book found")
                );
    }
}
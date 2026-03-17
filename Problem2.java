// Design a Book class (title, author, ISBN) and a Library class that manages a
// collection (e.g., an ArrayList) of Book objects. Implement methods in Library to
// add a new book, remove a book by ISBN, and display all available books.

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}

class Library {
    ArrayList<Book> list = new ArrayList<>();

    void addBook(Book b) {
        list.add(b);
    }

    void removeBook(String isbn) {
        for (Book b : list) {
            if (b.isbn.equals(isbn)) {
                list.remove(b);
                break;
            }
        }
    }

    void displayBooks() {
        for (Book b : list) {
            System.out.println(b.title + " - " + b.author + " - " + b.isbn);
        }
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Library l = new Library();

        Book b1 = new Book("Java", "James", "101");
        Book b2 = new Book("C++", "Bjarne", "102");

        l.addBook(b1);
        l.addBook(b2);

        l.displayBooks();

        l.removeBook("101");

        System.out.println("After removing:");

        l.displayBooks();
    }
}
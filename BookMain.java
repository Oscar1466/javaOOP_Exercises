import java.util.ArrayList;


class BookMain {
    String title;
    String author;
    String isbn;

     public BookMain(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBook() {
        System.out.println(title + " by " + author + " | ISBN: " + isbn);
    }
}


class Library {
    ArrayList<BookMain> books = new ArrayList<>();

  
     void addBook(BookMain book) {
        books.add(book);
        System.out.println("✔ Book added: " + book.title);
    }

  
     void removeBook(String isbn) {
        boolean removed = books.removeIf(book -> book.isbn.equals(isbn));
        if (removed) {
            System.out.println("❌ Book with ISBN " + isbn + " removed.");
        } else {
            System.out.println("⚠ Book not found!");
        }
    }

    
     void showBooks() {
        System.out.println("\n📚 Library Book Collection:");
        for (BookMain book : books) {
            book.displayBook();
        }
    }

   
    public static void main(String[] args) {
        Library lib = new Library();

        BookMain b1 = new BookMain("Java Programming", "James Brown", "111-ABC");
        BookMain b2 = new BookMain("Object Oriented Programming", "Mark Allen", "222-DEF");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.showBooks();

        lib.removeBook("111-ABC");
        lib.showBooks();
    }
}
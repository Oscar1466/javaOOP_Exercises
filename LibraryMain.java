import java.util.ArrayList;
import java.util.Scanner;


class Library {
    private ArrayList<String> books;

    
    public Library() {
        books = new ArrayList<>();
    }

    
    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println("Book \"" + bookName + "\" added to the library.");
    }

    
    public void removeBook(String bookName) {
        if (books.remove(bookName)) {
            System.out.println("Book \"" + bookName + "\" removed from the library.");
        } else {
            System.out.println("Book \"" + bookName + "\" not found in the library.");
        }
    }

    public void displayBooks() {
        System.out.println("\nBooks in the Library:");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }
}


public class LibraryMain extends Library {
    public static void main(String[] args) {
        LibraryMain library = new LibraryMain();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book name to add: ");
                    String addBook = scanner.nextLine();
                    library.addBook(addBook);
                    break;
                case 2:
                    System.out.print("Enter book name to remove: ");
                    String removeBook = scanner.nextLine();
                    library.removeBook(removeBook);
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting the library system.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}




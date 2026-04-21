import java.util.Scanner;

public class Library {
    Book[] booklist; // multiple books haru ko value store garxa/ declaring the array variable.
    static Scanner sc;
    private static Book[] bookList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            System.out.println("Press 1: To add books.");
            System.out.println("Press 2: To delete the books.");
            System.out.println("Press 3: To display the books.");
            System.out.println("Enter your choice: ");
            int n = sc.nextInt();
            choice = sc.nextInt(); // method of scanner class.

            switch (choice) { // based on choice value.
                case 1:
                    addBooks();
                    // call the method to add the books
                    break;
                case 2:
                    deleteBooks();
                    // call the method to delete the booksdcews21
                    break;
                case 3:
                    displayBooks();
                    // call the method to display the book.
                    break;
                case 0:
                    System.out.println("Thankyou.");
                default:
                    System.out.println("Invalid Input!");

            }
        } while (choice != 0);

    } // main close

    // method to add the books

    public static void addBooks() {
        System.out.println("book adding...");
        System.out.println("Enter the number of books to be added: ");
        int n = sc.nextInt();
        bookList = new Book[n]; // array construction.
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Book Id: ");
            String bookId = sc.nextLine();

            System.out.println("Enter Book name:");
            String bookName = sc.nextLine();

            System.out.println("Enter Author: ");
            String author = sc.nextLine();

            Book b = new Book(bookId, bookName, author);
            bookList[i] = b;

        }
    }

    // method to delete the book
    public static void deleteBooks() {
        System.out.println("Deleteing book...");

    }

    // method to display the book
    public static void displayBooks() {
        System.out.println("Displaying book...");
    }
}

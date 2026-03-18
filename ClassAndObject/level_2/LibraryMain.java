class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    void displayStatus() {
        System.out.println(title + " | Available: " + isAvailable);
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        LibraryBook libBook = new LibraryBook("Data Structures", "Mark", 450);
        libBook.displayStatus();
        libBook.borrowBook();
        libBook.borrowBook();
    }
}
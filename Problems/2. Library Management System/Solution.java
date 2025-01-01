
enum Status {
    AVAILABLE, BORROWED
}

enum FileFormat {
    PDF, DOC
}

class Book {

    String title;
    String author;
    Status status;

    boolean isBookAvailable() {
        return status == Status.AVAILABLE;
    }

    void borrowBook() {
        if (isBookAvailable()) {
            this.status = Status.BORROWED;
            System.out.println("Book borrowed Successfully");
        } else {
            System.out.println("Book is not available now.");
        }
    }

    void returnBook() {
        if (isBookAvailable()) {
            System.out.println("You cannot return a book that was not borrowed.");
        } else {
            this.status = Status.AVAILABLE;
            System.out.println("Book has been returned and is available for others to borrow.");
        }
    }
}

class PrintedBook extends Book {

    String shelfLocation;
}

class E_Book extends Book {

    double fileSize;
    FileFormat fileFormat;
}

class AudioBook extends Book {

    int duration;
}

// Factory class to create books
class BookFactory {

    // Factory method to create books based on type
    public static Book createBook(String bookType) {
        switch (bookType) {
            case "PrintedBook":
                return new PrintedBook();
            case "E_Book":
                return new E_Book();
            case "AudioBook":
                return new AudioBook();
            default:
                throw new IllegalArgumentException("Unknown book type: " + bookType);
        }
    }
}

public class Solution {

    public static void main(String[] args) {

        Book ramayana = BookFactory.createBook("PrintedBook");
        ((PrintedBook) ramayana).shelfLocation = "A1";

        Book systemDesign = BookFactory.createBook("E_Book");
        ((E_Book) systemDesign).fileSize = 10.5;
        ((E_Book) systemDesign).fileFormat = FileFormat.PDF;

        Book motivationalStory = BookFactory.createBook("AudioBook");
        ((AudioBook) motivationalStory).duration = 60;
    }
}

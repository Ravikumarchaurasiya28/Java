class LibraryClass {
    String[] books;
    int noBooks;
    LibraryClass() {
        books = new String[100];
        noBooks = 0;
    }
    void addBook(String book) {
        books[noBooks++] = book;
        System.out.println("Book Added SuccessFully!");
    }
    void issueBook(String book) {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == book) {
                books[i] = null;
                System.out.println("Book Issued Successfully");
                return;
            }
        }
        System.out.println("Book Is Not Available");
    }
    void showBooks() {
        System.out.println("Books Available: ");
        for(String s : books) {
            if(s == null) continue;
            System.out.println("* " + s);
        }
    }
    void returnBook(String book) {
        books[noBooks++] = book;
        System.out.println("Book Returned Successfully!");
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryClass l = new LibraryClass();
        l.addBook("C");
        l.addBook("C++");
        l.addBook("Python");
        l.addBook("Java");
        l.showBooks();
        l.issueBook("C");
        l.showBooks();
        l.returnBook("C");
        l.showBooks();
    }
}

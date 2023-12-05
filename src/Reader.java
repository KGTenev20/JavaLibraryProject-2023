import java.util.ArrayList;
import java.util.List;

class Reader{
    String name;
    List<Book> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Library library, Book book){
        if (library != null && library.books.contains(book))
        {
            borrowedBooks.add(book);
            library.removeBook(book);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        }
        else
        {
            System.out.println("The book is not available in the library.");
        }
    }

    public void returnBook(Library library, Book book) {
        borrowedBooks.remove(book);
        library.addBook(book);
        System.out.println(name + " returned the book: " + book.getTitle());
    }

    public void listBorrowedBooks(){
        for(Book book : borrowedBooks)
        {
            System.out.println(book.getTitle());
        }
    }
}
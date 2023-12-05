import java.util.ArrayList;
import java.util.List;
class Library{
    List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void listBooks(){
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
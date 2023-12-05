public class Book {
    private String title;
    private String author;
    private int dataOfPublishing;
    public Book(String title, String author, int dataOfPublishing) {
        this.title = title;
        this.author = author;
        this.dataOfPublishing = dataOfPublishing;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getDataOfPublishing() {
        return dataOfPublishing;
    }
    public void setDataOfPublishing(int dataOfPublishing) {
        this.dataOfPublishing = dataOfPublishing;
    }
    public String printData() {
        return "Book: " + this.title + " " + this.author + " " + this.dataOfPublishing;
    }
}
 
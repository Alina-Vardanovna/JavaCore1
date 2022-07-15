package homework.books.model;

public class Book {

    private String title;
    private Author author;
    private int count;
    private double price;
    private String genre;
    private User registeredUser;

    public Book(String title, Author author, int count, double price, String genre, User registeredUser) {
        this.title = title;
        this.author = author;
        this.count = count;
        this.price = price;
        this.genre = genre;
        this.registeredUser = registeredUser;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthorName(Author author) {
        this.author = author;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", count=" + count +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", registeredUser=" + registeredUser +
                '}';
    }

}

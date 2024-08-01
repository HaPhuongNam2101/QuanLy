package model;

public class Book extends Document {
    private String author;
    private int numberOfPages;

    public Book(String publisherName, int releaseNumber) {
        super(publisherName, releaseNumber);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return " Tên tác giả: " + author + " Số trang: " + numberOfPages;
    }
}

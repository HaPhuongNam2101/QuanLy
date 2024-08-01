package manager;

import model.Book;

import java.util.ArrayList;

public class BookManager implements IManager<Book> {
    ArrayList<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public void remove(int id) {
        int index = findIndexById(id);
        books.remove(index);
    }

    @Override
    public void update(Book book, int id) {
        int index = findIndexById(id);
        books.set(index, book);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<Book> getAll() {
        return books;
    }
    public Book findById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

}

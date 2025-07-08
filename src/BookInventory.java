import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BookInventory {
    private Map<String, Book> booksByIsbn;

    public BookInventory() {
        booksByIsbn = new HashMap<>();
    }

    public void addBook(Book book) {
        booksByIsbn.put(book.getIsbn(), book);
    }

    public Book removeBook(String isbn) {
        return booksByIsbn.remove(isbn);
    }

    public List<Book> removeOutdatedBooks(int years) {
        int currentYear = Year.now().getValue();
        List<Book> removedBooks = new ArrayList<>();

        for (Iterator<Map.Entry<String, Book>> it = booksByIsbn.entrySet().iterator(); it.hasNext();) {
            Book book = it.next().getValue();
            if (currentYear - book.getYear() > years) {
                removedBooks.add(book);
                it.remove();
            }
        }

        return removedBooks;
    }

    public double buyBook(String isbn, int quantity, String email, String address){
        Book book = booksByIsbn.get(isbn);
        if (book == null){
            throw new IllegalArgumentException("Book with ISBN " + isbn + " not found.");
        }
        
        return book.buy(quantity, email, address);
    }

    public boolean contains(String isbn) {
        return booksByIsbn.containsKey(isbn);
    }

    public Book get(String isbn) {
        return booksByIsbn.get(isbn);
    }
}

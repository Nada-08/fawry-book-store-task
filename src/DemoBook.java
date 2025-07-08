public class DemoBook extends Book {

    public DemoBook(String isbn, String title, int year, double price) {
        super(isbn, title, year, price);
    }

    public double buy(int quantity, String email, String address) {
        throw new UnsupportedOperationException("This demo book is not for sale.");
    }
}
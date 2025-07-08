public class PaperBook extends Book {
    private int stock;
    private DeliveryStrategy deliveryStrategy;

    public PaperBook(String isbn, String title, int year, double price, int stock, DeliveryStrategy deliveryStrategy) {
        super(isbn, title, year, price);
        this.stock = stock;
        this.deliveryStrategy = deliveryStrategy;
    }

    public double buy(int quantity, String email, String address) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0.");
        }

        if (this.stock <= quantity) {
            throw new IllegalArgumentException("Not enough stock available.");
        }

        this.stock -= quantity;

        return quantity * this.getPrice();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
}

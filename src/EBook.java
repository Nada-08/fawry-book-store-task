public class EBook extends Book {
    private String filetype;
    private DeliveryStrategy deliveryStrategy;

    public EBook(String isbn, String title, int year, double price, String filetype,
            DeliveryStrategy deliveryStrategy) {
        super(isbn, title, year, price);
        this.filetype = filetype;
        this.deliveryStrategy = deliveryStrategy;
    }

    public double buy(int quantity, String email, String address) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0.");
        }

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email required.");
        }

        return quantity * this.getPrice();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
}

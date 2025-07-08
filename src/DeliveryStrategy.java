public interface DeliveryStrategy {
    void deliver(Book book, String email, String address);
}

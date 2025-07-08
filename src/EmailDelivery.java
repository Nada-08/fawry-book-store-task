public class EmailDelivery implements DeliveryStrategy {
    public void deliver(Book book, String email, String address) {
        MailService.send(book, email);
    }
}

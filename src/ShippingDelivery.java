public class ShippingDelivery implements DeliveryStrategy {
    public void deliver(Book book, String email, String address) {
        ShippingService.send(book, address);
    }

}
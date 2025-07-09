public class BookstoreTest {
    public static void main(String[] args) {
        BookInventory inventory = new BookInventory();

        DeliveryStrategy shipping = new ShippingDelivery();
        DeliveryStrategy emailDelivery = new EmailDelivery();

        Book paperBook = new PaperBook("ID01", "Effective Java", 2018, 45.99, 10, shipping);
        Book ebook = new EBook("ID02", "Clean Code", 2008, 30.00, "PDF", emailDelivery);
        Book demoBook = new DemoBook("ID03", "Design Patterns", 2020, 0.00);
        Book oldBook = new PaperBook("ID04", "Object-Oriented Programming", 1990, 15.99, 2, shipping);

        inventory.addBook(paperBook);
        inventory.addBook(ebook);
        inventory.addBook(demoBook);
        inventory.addBook(oldBook);

        System.out.println("--- Removing outdated books (20 years) ---");
        for (Book book : inventory.removeOutdatedBooks(20)) {
            System.out.println("Removed - " + book.getTitle());
        }

        System.out.println("\n--- Buying available books ---");
        try {
            double total = inventory.buyBook("ID01", 2, "buyer@gamail.com", "Cairo, Egypt");
            System.out.println("Total paid for Paperbook: " + total);

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

        try {
            double total = inventory.buyBook("ID02", 1, "reader@example.com", "N/A");
            System.out.println("Total paid for EBook: " + total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Trying to buy a demo book ---");
        try {
            inventory.buyBook("ID03", 1, "demo@example.com", "N/A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Buying more than available stock ---");
        try {
            inventory.buyBook("ID01", 20, "overflow@example.com", "Giza");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Buying a book not in inventory ---");
        try {
            inventory.buyBook("ID999", 1, "ghost@example.com", "Alexandria");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

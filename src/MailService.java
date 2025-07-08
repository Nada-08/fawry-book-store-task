public class MailService {
    public static void send(Book book, String email) {
        System.out.println("Shipping " + book.getTitle() + " to email: " + email);
    }
}

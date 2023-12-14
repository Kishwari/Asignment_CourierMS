
import java.time.LocalDate;

public class OrderConfirmationEmail {

    public static void main(String[] args) {
        // Sample order details
        String customerName = "John Doe";
        int orderNumber = 12345;
        String deliveryAddress = "1234 Main St, Anytown";
        LocalDate expectedDeliveryDate = LocalDate.now().plusDays(3); // Assuming delivery in 3 days

        // Generate order confirmation email content
        String emailContent = generateOrderConfirmationEmail(customerName, orderNumber, deliveryAddress, expectedDeliveryDate);

        // Display the generated email content
        System.out.println("Order Confirmation Email:\n" + emailContent);
    }

    public static String generateOrderConfirmationEmail(String customerName, int orderNumber, String deliveryAddress, LocalDate expectedDeliveryDate) {
        // Construct the email content
        String emailContent = "Dear " + customerName + ",\n\n"
                            + "Thank you for your order (Order #" + orderNumber + ").\n"
                            + "Delivery Address: " + deliveryAddress + "\n"
                            + "Expected Delivery Date: " + expectedDeliveryDate.toString() + "\n\n"
                            + "We appreciate your business.\n\n"
                            + "Sincerely,\nThe Store";

        return emailContent;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourierManagementApp {

    private static List<String> orders = new ArrayList<>();
    private static int destination = 100; // Example destination distance in kilometers
    private static int currentLocation = 0;
    private static int courierSpeed = 10; // Example speed in kilometers per hour

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulate orders for different customers
        simulateOrders();

        // Display orders for a specific customer using a for loop
        System.out.print("Enter customer name to display orders: ");
        String customerName = scanner.nextLine();
        displayOrdersForCustomer(customerName);

        // Track the real-time location of a courier until it reaches its destination using a while loop
        trackCourierLocation();

        scanner.close();
    }

    private static void simulateOrders() {
        orders.add("Customer1: Order#1 - Processing");
        orders.add("Customer2: Order#2 - Delivered");
        orders.add("Customer1: Order#3 - Processing");
        orders.add("Customer3: Order#4 - Cancelled");
    }

    private static void displayOrdersForCustomer(String customerName) {
        System.out.println("Orders for " + customerName + ":");
        for (String order : orders) {
            if (order.contains(customerName)) {
                System.out.println(order);
            }
        }
    }

    private static void trackCourierLocation() {
        System.out.println("Courier is en route to the destination:");

        while (currentLocation < destination) {
            int randomDistance = (int) (Math.random() * courierSpeed + 1);
            currentLocation += randomDistance;

            if (currentLocation > destination) {
                currentLocation = destination; // Ensure the courier doesn't pass the destination
            }

            System.out.println("Current Location: " + currentLocation + " km");

            try {
                // Simulate delay for real-time tracking
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Courier has reached the destination!");
    }
}
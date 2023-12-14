import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CourierManagementSystem {

    // Array to store tracking history of a parcel
    private static List<String> parcelTrackingHistory = new ArrayList<>();

    // Array of couriers
    private static String[] availableCouriers = {"Courier1", "Courier2", "Courier3", "Courier4"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulate parcel tracking history updates
        updateParcelLocation("Location 1");
        updateParcelLocation("Location 2");
        updateParcelLocation("Location 3");

        // Display parcel tracking history
        System.out.println("Parcel Tracking History:");
        for (String location : parcelTrackingHistory) {
            System.out.println(location);
        }

        // Find the nearest available courier for a new order
        String nearestCourier = findNearestCourier();
        System.out.println("Nearest Available Courier: " + nearestCourier);

        // Simulate a new order for a specific customer using a for loop
        System.out.print("Enter customer name for new order: ");
        String customerName = scanner.nextLine();
        simulateNewOrderForCustomer(customerName);

        scanner.close();
    }

    private static void updateParcelLocation(String locationUpdate) {
        // Add location update to the parcel tracking history
        parcelTrackingHistory.add(locationUpdate);
    }

    private static String findNearestCourier() {
        // Simulate some criteria for finding the nearest courier
        // In this example, simply return the first available courier
        if (availableCouriers.length > 0) {
            return availableCouriers[0];
        } else {
            return "No available couriers";
        }
    }

    private static void simulateNewOrderForCustomer(String customerName) {
        // Simulate a new order for a specific customer using a for loop
        System.out.println("Orders for " + customerName + ":");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Order#" + i + ": Processing");
        }
    }
}
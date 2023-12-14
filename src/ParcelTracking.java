import java.util.Scanner;

public class ParcelTracking {
    public static void main(String[] args) {
        // Initialize 2D String array for tracking numbers and statuses
        String[][] trackingInfo = {
            {"123456", "Parcel in transit"},
            {"789012", "Parcel out for delivery"},
            {"345678", "Parcel delivered"},
            // Add more tracking numbers and statuses as needed...
        };

        // Input a parcel tracking number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter parcel tracking number: ");
        String inputTrackingNumber = scanner.nextLine();
        scanner.close();

        // Check the status of the input tracking number in the array
        boolean found = false;
        for (String[] info : trackingInfo) {
            if (info[0].equals(inputTrackingNumber)) {
                found = true;
                System.out.println("Status for Tracking Number " + inputTrackingNumber + ": " + info[1]);
                simulateTrackingProcess(info[1]);
                break;
            }
        }

        if (!found) {
            System.out.println("Tracking number not found.");
        }
    }

    // Simulate the tracking process based on status
    private static void simulateTrackingProcess(String status) {
        // Display messages based on status
        switch (status) {
            case "Parcel in transit":
                System.out.println("Parcel is in transit. Expected delivery soon.");
                break;
            case "Parcel out for delivery":
                System.out.println("Parcel is out for delivery. Expected to arrive today.");
                break;
            case "Parcel delivered":
                System.out.println("Parcel has been delivered. Thank you for using our service.");
                break;
            default:
                System.out.println("Invalid status.");
                break;
        }
    }
}

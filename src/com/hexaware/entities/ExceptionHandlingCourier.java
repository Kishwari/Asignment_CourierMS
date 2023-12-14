package com.hexaware.entities;


/* package com.hexaware.entities;
public class TrackingNumberNotFoundException extends Exception {
    public TrackingNumberNotFoundException(String message) {
        super(message);
    }
}*/


import com.hexaware.entities.Courier;
import java.util.Date;
import java.util.Scanner;

public class ExceptionHandlingCourier {
    private long courierID;
    private String senderName;
    private String senderAddress;
    private String receiverName;
    private String receiverAddress;
    private double weight;
    private String status;
    private long trackingNumber;
    private Date deliveryDate;
    private int userId;

    // Default constructor
    public ExceptionHandlingCourier() {}

    public class TrackingNumberNotFoundException extends RuntimeException {

        public TrackingNumberNotFoundException(String message) {
            super(message);
        }
    }
    // Method to simulate an operation that may throw TrackingNumberNotFoundException
    public void withdrawAmount() throws TrackingNumberNotFoundException {
        // Simulating a scenario where tracking number is not found
        throw new TrackingNumberNotFoundException("Tracking number not found for Courier ID: " + this.courierID);
    }


    // Parameterized constructor
    public ExceptionHandlingCourier(long courierID, String senderName, String senderAddress, String receiverName, String receiverAddress,
                   double weight, String status, long trackingNumber, Date deliveryDate, int userId)
    {
        this.courierID = courierID;
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.weight = weight;
        this.status = status;
        this.trackingNumber = trackingNumber;
        this.deliveryDate = deliveryDate;
        this.userId = userId;
    }

    // This below method is created for using in CourierUserServiceImpl class created in Service_Implementation package
    // As per rules we need to create this class createCourier() here only inside Courier.java file that's why created here
    public static Courier createCourier() {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for Courier details
        System.out.println("Courier Details:");
        System.out.print("Enter Courier ID: ");
        long courierID = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Sender Name: ");
        String senderName = scanner.nextLine();
        System.out.print("Enter Sender Address: ");
        String senderAddress = scanner.nextLine();
        System.out.print("Enter Receiver Name: ");
        String receiverName = scanner.nextLine();
        System.out.print("Enter Receiver Address: ");
        String receiverAddress = scanner.nextLine();
        System.out.print("Enter Weight : ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Status : ");
        String status = scanner.nextLine();
        System.out.print("Enter Tracking Number : ");
        long trackingNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter User ID : ");
        int userID = scanner.nextInt();

        // Creating an instance of Courier with user input
        com.hexaware.entities.Courier courier = new com.hexaware.entities.Courier(courierID, senderName, senderAddress, receiverName, receiverAddress, weight, status, trackingNumber, null, userID);

//        scanner.close();

        return courier;
    }
    // toString method
    @Override
    public String toString() {
        return "Courier{" +
                "courierID=" + courierID +
                ", senderName='" + senderName + '\'' +
                ", senderAddress='" + senderAddress + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", weight=" + weight +
                ", status='" + status + '\'' +
                ", trackingNumber=" + trackingNumber +
                ", deliveryDate=" + deliveryDate +
                ", userId=" + userId +
                '}';
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in); // New scanner instance for user input

        try {
            Courier courier = createCourier();
            courier.withdrawAmount();
        } catch (TrackingNumberNotFoundException e) {
            System.out.println("Handling TrackingNumberNotFoundException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Handling Generic Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        sc.close();
    }
}
    
    
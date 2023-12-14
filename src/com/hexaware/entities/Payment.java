package com.hexaware.entities;
import java.util.*;
import java.util.Date;

public class Payment {
    private long paymentID;
    private long courierID;
    private double amount;
    private String paymentDate;

    public Payment() {
        // Default constructor
    }

    public Payment(long paymentID, long courierID, double amount, String paymentDate) {
        this.paymentID = paymentID;
        this.courierID = courierID;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Getters and Setters
    public long getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(long paymentID) {
        this.paymentID = paymentID;
    }

    public long getCourierID() {
        return courierID;
    }

    public void setCourierID(long courierID) {
        this.courierID = courierID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "PaymentClass{" +
                "paymentID=" + paymentID +
                ", courierID=" + courierID +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                '}';
    }
    public static void main(String[] args) {
    	//inserting values
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Payment Details : ");
    	System.out.println("Enter payment ID: ");
    	long paymentID=sc.nextLong();
    	System.out.println("Enter courier ID: ");
         long courierID=sc.nextLong();
         System.out.println("Enter amount: ");
         double amount=sc.nextDouble();
         System.out.println("Enter payment date: ");
         String paymentDate=sc.nextLine();
        // Create an instance of the Payment class
        Payment payment = new Payment(paymentID, courierID , amount ,paymentDate);
        System.out.println(payment.getPaymentID());
        System.out.println(payment.getCourierID());
        System.out.println(payment.getAmount());
        System.out.println(payment.getPaymentDate());
        // Set values using setters
      /*  payment.setPaymentID(1);
        payment.setCourierID(101);
        payment.setAmount(50.0);
        payment.setPaymentDate(new Date());*/

        // Print details using toString()
        System.out.println(payment.toString());
    }
    }


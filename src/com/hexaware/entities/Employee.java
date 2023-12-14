package com.hexaware.entities;

import java.util.Scanner;

public class Employee {
    private long employeeID;
    private String employeeName;
    private String email;
    private long contactNumber;
    private String role;
    private double salary;

    public Employee() {
        // Default constructor
    }

    public Employee(long employeeID, String employeeName, String email, long contactNumber, String role, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.role = role;
        this.salary = salary;
    }

    // Getters and Setters
    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for User details
        System.out.println("User Details:");
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter User Name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        long contactNumber = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        // Creating an instance of User with user input
        User user = new User(userId, userName, email, password, contactNumber, address);

        // Displaying the details of the User
        System.out.println("\nUser Details are as :");
        System.out.println("User ID: " + user.getUserID());
        System.out.println("User Name: " + user.getUserName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Contact Number: " + user.getContactNumber());
        System.out.println("Address: " + user.getAddress());

        scanner.close();
    }
}

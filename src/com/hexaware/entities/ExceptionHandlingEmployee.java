package com.hexaware.entities;

import com.hexaware.entities.Employee;
import java.util.Scanner;

public class ExceptionHandlingEmployee {
    private long employeeID;
    private String employeeName;
    private String email;
    private long contactNumber;
    private String role;
    private double salary;

    // Custom exception for invalid employee ID
    public static class InvalidEmployeeIdException extends RuntimeException {
        public InvalidEmployeeIdException(String message) {
            super(message);
        }
    }

    // Default constructor
    public ExceptionHandlingEmployee() {}

    // Parameterized constructor
    public ExceptionHandlingEmployee(long employeeID, String employeeName, String email, long contactNumber, String role, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.role = role;
        this.salary = salary;
    }

    // Getters and setters start
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
    // Getters and setters end

    // toString method (same as in your code)
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

    // Method to validate employee ID
    public static void validateEmployeeId(long employeeID) {
        // Simulating a scenario where the employee ID is not found in the system
        if (employeeID <= 0) {
            throw new InvalidEmployeeIdException("Invalid Employee ID: " + employeeID);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Getting user input for Employee details
            System.out.println("Enter Employee Details:");
            System.out.print("Enter Employee ID: ");
            long employeeID = scanner.nextLong();

            // Validate the entered employee ID
            validateEmployeeId(employeeID);

            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            System.out.print("Enter Contact Number: ");
            long contactNumber = scanner.nextLong();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Role: ");
            String role = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();

            // Creating an instance of Employee with user input
            Employee employee = new Employee(employeeID, employeeName, email, contactNumber, role, salary);

            // Displaying the details of the Employee
            System.out.println("\nEmployee Details:");
            System.out.println("Employee ID is as : " + employee.getEmployeeID());
            System.out.println("Employee Name is as : " + employee.getEmployeeName());
            System.out.println("Email is : " + employee.getEmail());
            System.out.println("Contact Number is : " + employee.getContactNumber());
            System.out.println("Role is : " + employee.getRole());
            System.out.println("Salary is : " + employee.getSalary());
        } catch (InvalidEmployeeIdException e) {
            System.out.println("Handling InvalidEmployeeIdException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Handling Generic Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            scanner.close();
        }
    }
}
package com.hexaware.entities;
import java.util.*;
import java.util.Date;

public class CourierCompany {
    private String companyName;
    private Courier[] courierDetails;
    private Employee[] employeeDetails;
    private Location[] locationDetails;

    public CourierCompany() {
        // Default constructor
    }

    public CourierCompany(String companyName, Courier[] courierDetails, Employee[] employeeDetails,
                               Location[] locationDetails) {
        this.companyName = companyName;
        this.courierDetails = courierDetails;
        this.employeeDetails = employeeDetails;
        this.locationDetails = locationDetails;
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Courier[] getCourierDetails() {
        return courierDetails;
    }

    public void setCourierDetails(Courier[] courierDetails) {
        this.courierDetails = courierDetails;
    }

    public Employee[] getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(Employee[] employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    public Location[] getLocationDetails() {
        return locationDetails;
    }

    public void setLocationDetails(Location[] locationDetails) {
        this.locationDetails = locationDetails;
    }

    @Override
    public String toString() {
        return "CourierCompanyClass{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
    public static void main(String[] args) {
    	//inserting values
    	Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter Company Name : ");
    	String companyName=sc.nextLine();
    	 System.out.println("Enter Courier Details : ");
         Courier[] courierDetails=new Courier[5];
    	 System.out.println("Enter Employee Details : ");
         Employee[] employeeDetails=new Employee[5];
    	 System.out.println("Enter Location Details : ");
         Location[] locationDetails=new Location[5];
        // Create an instance of the Payment class
    	CourierCompany cc = new CourierCompany(companyName,courierDetails,employeeDetails, locationDetails);

        // Set values using setters
    	System.out.println(cc.getCompanyName());
    	System.out.println(cc.getCourierDetails());
    	System.out.println(cc.getEmployeeDetails());
    	System.out.println(cc.getLocationDetails());

        // Print details using toString()
        System.out.println(cc.toString());
    }
}

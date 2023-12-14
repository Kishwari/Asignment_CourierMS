package com.hexaware.entities;
import java.util.*;
public class Location {
	private long locationID;
	private String locationName;
	private String address;
	
	//constructor
	public Location(long locationID, String locationName , String address ) {
		this.locationID=locationID ;
		this.locationName=locationName ;
		this.address = address;
	}
	
	//getter & setter
	public long getLocationID() {
		return locationID;
	}
	public void setLocationID(long locationID) {
		this.locationID=locationID;
	}
	public String getLocationName() {
		return locationName;
		
	}
	public void setLocationName(String locationName) {
		this.locationName=locationName;
	}
	public String getAddress () {
		return address;
	}
	public void setAddress (String address) {
		
		this.address=address;
	}
	//toString to display location information
	@Override
	public String toString() {
		return "Location ID: "+locationID+"\nLocation Name: "+locationName+"\nAddress : "+address;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//insert values
		System.out.println("Enter Location ID: ");
		long locationID=sc.nextLong();
		System.out.println("Enter Location Name: ");
		String locationName=sc.nextLine();
		System.out.println("Enter  Address: ");
		String address=sc.nextLine();
		// Creating a sample Location instance
        Location location1 = new Location(locationID, locationName, address);
        System.out.println(location1.getLocationID());
        System.out.println(location1.getLocationName());
        System.out.println(location1.getAddress());
        // Displaying Location information using toString method
        System.out.println(location1.toString());

	}

}

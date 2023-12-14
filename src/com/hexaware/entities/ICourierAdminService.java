package com.hexaware.entities;

import java.util.Date;

//Admin functions
public interface ICourierAdminService{
/** Add a new courier staff member to the system.
* @param name The name of the courier staff member.
* @param contactNumber The contact number of the courier staff member. * @return The ID of the newly added courier staff member.
*/
int addCourierStaff(Employee obj);
/**Remove a courier staff member from the system.
* @param courierStaffId The ID of the courier staff member to be removed.
* @return True if the staff member was successfully removed, false otherwise. */
boolean removeCourierStaff(int courierStaffId);
/**
* Generate a report of orders delivered within a specified date range.
*@param startDate The start date of the date range.
* @param endDate The end date of the date range.
* @return A report containing information about delivered orders within the date range.
*/
String generateDeliveryReport(Date startDate, Date endDate); }
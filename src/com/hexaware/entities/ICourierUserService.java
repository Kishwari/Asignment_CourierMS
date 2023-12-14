package com.hexaware.entities;

import java.util.List;

public interface ICourierUserService { 
	// Customer-related functions
/** Place a new courier order.
* @param courierObj Courier object created using values entered by users * 
* @return The unique tracking number for the courier order.*/

	String placeOrder(Courier Obj);
	 /**Get the status of a courier order.
	*@param trackingNumber The tracking number of the courier order.
	* @return The status of the courier order (e.g., yetToTransit, In Transit, Delivered). */
	String getOrderStatus(String trackingNumber);
        // Process tracking number logic
	/** Cancel a courier order.
	* @param trackingNumber The tracking number of the courier order to be canceled.
	* @return True if the order was successfully canceled, false otherwise.
	 * @throws TrackingNumberNotFoundException */
	boolean cancelOrder(String trackingNumber) ;
	// Courier Staff-related functions
	/** Assign a courier staff member to deliver an order.
	* @param trackingNumber The tracking number of the courier order.
	* @param courierStaffId The ID of the courier staff member.
	* @return True if the assignment was successful, false otherwise. */
	boolean assignCourier(String trackingNumber, int courierStaffId);
	/** Mark an order as delivered.
	* @param trackingNumber The tracking number of the courier order.
	* @return True if the order was successfully marked as delivered, false otherwise. */
       
    boolean markOrderDelivered(String trackingNumber);
    /** Get a list of orders assigned to a specific courier staff member * @param courierStaffId The ID of the courier staff member.
     * @return A list of courier orders assigned to the staff member.*/
    List<String> getAssignedOrders(int courierStaffId); }
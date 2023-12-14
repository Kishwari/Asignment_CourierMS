package com.hexaware.entities;
import java.util.List;
public class CourierUserServiceImpI implements ICourierUserService{
	 protected CourierCompany companyObj;

	    public CourierUserServiceImpI(CourierCompany companyObj) {
	        this.companyObj = companyObj;
	    }

	@Override
	public String placeOrder(Courier Obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOrderStatus(String trackingNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelOrder(String trackingNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean assignCourier(String trackingNumber, int courierStaffId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean markOrderDelivered(String trackingNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getAssignedOrders(int courierStaffId) {
		// TODO Auto-generated method stub
		return null;
	}

}

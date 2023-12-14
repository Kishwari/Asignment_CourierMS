package com.hexaware.entities;

import java.util.Date;

import com.hexaware.entities.CourierCompany;
import com.hexaware.entities.ICourierAdminService;

public class CourierAdminServiceImpI extends CourierUserServiceImpI implements ICourierAdminService {
    public CourierAdminServiceImpI(CourierCompany companyObj) {
        super(companyObj);
    }

	@Override
	public int addCourierStaff(Employee obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean removeCourierStaff(int courierStaffId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String generateDeliveryReport(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}
}
package com.hexaware.dao;

import java.util.Date;

import com.hexaware.dto.CourierCompanyCollection;
import com.hexaware.entities.Employee;
import com.hexaware.entities.ICourierAdminService;

public class CourierAdminServiceCollectionImpl extends CourierUserServiceCollectionImpl implements ICourierAdminService {

    public CourierAdminServiceCollectionImpl(CourierCompanyCollection companyObj) {
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
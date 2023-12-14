package com.hexaware.dto;

import java.util.ArrayList;
import java.util.List;
import com.hexaware.entities.Courier;

public class CourierCompanyCollection {
    private List<Courier> courierList = new ArrayList<>();

    public List<Courier> getCourierList() {
        return courierList;
    }

    public void setCourierList(List<Courier> courierList) {
        this.courierList = courierList;
    }
}
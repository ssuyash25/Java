package com.example.demoMongoDB;

import org.springframework.data.annotation.Id;

public class Vehicle {

    @Id private String _id;

    private String vehicleType;
    private String vehicleNo;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String brandName) {
        this.vehicleNo = brandName;
    }
}

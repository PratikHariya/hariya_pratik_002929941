/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.carApp;

/**
 *
 * @author 18573
 */
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 18573
 */
public class Car {
    
    private String brand;
    private String model;
    private String color;
    private String year;
    private String engineNo;
    private String seatNumber;
    private String licensePlate;
    private String ownerName;
    private String ownerTelNo;
    private String OwnerEmailAdd;
    private String ownerDriverLicense;
    private String ownerSSN;
    private String ownerAddress;
    private String serviceRecords;
    private String warrantyYear;
    private String image;
    private HashMap<String, ArrayList<Car>> carMap = new HashMap<String, ArrayList<Car>>();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerTelNo() {
        return ownerTelNo;
    }

    public void setOwnerTelNo(String ownerTelNo) {
        this.ownerTelNo = ownerTelNo;
    }

    public String getOwnerEmailAdd() {
        return OwnerEmailAdd;
    }

    public void setOwnerEmailAdd(String OwnerEmailAdd) {
        this.OwnerEmailAdd = OwnerEmailAdd;
    }

    public String getOwnerDriverLicense() {
        return ownerDriverLicense;
    }

    public void setOwnerDriverLicense(String ownerDriverLicense) {
        this.ownerDriverLicense = ownerDriverLicense;
    }

    public String getOwnerSSN() {
        return ownerSSN;
    }

    public void setOwnerSSN(String ownerSSN) {
        this.ownerSSN = ownerSSN;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(String serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public String getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(String warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public HashMap<String, ArrayList<Car>> getCarMap() {
        return carMap;
    }

    public void setCarMap(HashMap<String, ArrayList<Car>> carMap) {
        this.carMap = carMap;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.carApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Pratik Hariya
 * 
 * This Class is used to store the Data Structures used in the Applications
 */
public class CarPropertyObjects {
    
    HashMap<Integer, CarProperties> carMap = new HashMap<Integer, CarProperties>();
    ArrayList<Integer> srNoList = new ArrayList<Integer>();
    HashSet<String> manufacturerList = new HashSet<String>();   
    HashSet<Integer> expMntnCertCarList = new HashSet<Integer>();
    HashMap<String, HashSet<Integer>> manufacturerSrNoMap = new HashMap<String, HashSet<Integer>>();
    ArrayList<Integer> availableCars = new ArrayList<Integer>();
    ArrayList<Integer> searchResults = new ArrayList<Integer>();
    
    public ArrayList<Integer> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(ArrayList<Integer> searchResults) {
        this.searchResults = searchResults;
    }

    public ArrayList<Integer> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(ArrayList<Integer> availableCars) {
        this.availableCars = availableCars;
    }
    
    public HashSet<Integer> getExpMntnCertCarList() {
        return expMntnCertCarList;
    }

    public void setExpMntnCertCarList(HashSet<Integer> expMntnCertCarList) {
        this.expMntnCertCarList = expMntnCertCarList;
    }
    
    public HashMap<String, HashSet<Integer>> getManufacturerSrNoMap() {
        return manufacturerSrNoMap;
    }

    public void setManufacturerSrNoMap(HashMap<String, HashSet<Integer>> manufacturerSrNoMap) {
        this.manufacturerSrNoMap = manufacturerSrNoMap;
    }
    
    
    
    public HashSet<String> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(HashSet<String> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }
    
    public ArrayList<Integer> getSrNoList() {
        return srNoList;
    }

    public void setSrNoList(ArrayList<Integer> srNoList) {
        this.srNoList = srNoList;
    }

    public HashMap<Integer, CarProperties> getCarMap() {
        return carMap;
    }

    public void setCarMap(HashMap<Integer, CarProperties> carMap) {
        this.carMap = carMap;
    }
    
    
    
}

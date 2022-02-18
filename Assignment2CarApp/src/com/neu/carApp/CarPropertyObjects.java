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
 * @author 18573
 */
public class CarPropertyObjects {
    
    HashMap<Integer, CarProperties> carMap = new HashMap<Integer, CarProperties>();
    ArrayList<Integer> srNoList = new ArrayList<Integer>();
    HashSet<String> manufacturerList = new HashSet<String>();
    
    
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

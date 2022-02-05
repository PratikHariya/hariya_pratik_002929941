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
public class CarMap {

    public HashMap<String, ArrayList<Car>> getCarMap() {
        return carMap;
    }

    public void setCarMap(HashMap<String, ArrayList<Car>> carMap) {
        this.carMap = carMap;
    }
 
    public HashMap<String, ArrayList<String>> getSerRecMap() {
        return serRecMap;
    }

    public void setSerRecMap(HashMap<String, ArrayList<String>> serRecMap) {
        this.serRecMap = serRecMap;
    }
    
    
    private HashMap<String, ArrayList<Car>> carMap = new HashMap<String, ArrayList<Car>>();
    private HashMap<String, ArrayList<String>> serRecMap = new HashMap<String, ArrayList<String>>();
    
    
    
}


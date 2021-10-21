/*
 * File: MainController.java
 * Created Date: 2021-09-24 22:21:42
 * Original author: Sallai Andras
 * Author: Korcsmáros Kende Andras SZOFTII_I/N
 * Github: https://github.com/andteki
 * -----
 * Last Modified: 2021-10-21
 * Modified By: Korcsmaros Kende Andras
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 */

package controllers;

import java.util.ArrayList;
import models.LoadVehicle;
import models.Vehicle;
import views.MainWindow;

public class MainController {

    MainWindow mainWindow;
    LoadVehicle loadVehicle;

    public MainController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.loadVehicle = new LoadVehicle();

        ArrayList<Vehicle> vehicleList = this.loadVehicle.loadVehicle();
        for(Vehicle vehicle : vehicleList) {
            this.mainWindow.vehicleModel.addRow(
                new Object[] {vehicle.ordinal, vehicle.brand, vehicle.year}
            );}
        }
        
   
    public void AddVehicle(MainWindow addButton){
        this.mainWindow.addButton.addActionListener(event -> {
            System.out.println("Hozzáadás...");
            String ordinal = this.mainWindow.ordinalField.getText();
            String brand = this.mainWindow.brandField.getText();
            String year = this.mainWindow.yearField.getText();
            this.mainWindow.ordinalField.setText("");
            this.mainWindow.brandField.setText("");
            this.mainWindow.yearField.setText("");
            this.mainWindow.vehicleModel.addRow(
                new Object[] {ordinal, brand, year}
            );
        });
    }

    public void SaveVehicle(MainWindow saveButton){
        //TODO: Mentés megvalósítása
        mainWindow.saveButton.addActionListener(event -> {
            System.out.println("Mentés...");
        });
    }

    public void DeleteVehicle(MainWindow delButton){
        //TODO: Törlés megvalósítása
        this.mainWindow.delButton.addActionListener(event -> {
            System.out.println("Törlés...");
        });
    
    }
}

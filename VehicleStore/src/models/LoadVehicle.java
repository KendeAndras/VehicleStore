/*
 * File: LoadVehicle.java
 * Created Date: 2021-09-25 00:46:41
 * Original author: Sallai Andras
 * Author: Korcsmáros Kende Andras SZOFTII_I/N
 * Github: github.com/KendeAndras
 * -----
 * Last Modified: 2021-10-21
 * Modified By: Korcsmaros Kende Andras
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 */

package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadVehicle {
    ArrayList<String> vehicles;
    public LoadVehicle() {
        vehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> loadVehicle(){

    ArrayList<Vehicle> vehicleList = new ArrayList<>();
    try {
        FileReader fileReader = new FileReader("data.txt");
        Scanner scanner = new Scanner(fileReader);

        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lineArray = line.split(":");
            Vehicle vehicle = new Vehicle();
            vehicle.ordinal = lineArray[0];
            vehicle.brand = lineArray[1];
            vehicle.year = lineArray[2];
            vehicleList.add(vehicle);
        }
    scanner.close();

    } catch (FileNotFoundException error) {
    System.err.println("Hiba! A fájl nem található");
    error.printStackTrace();
    }
    return vehicleList;
    }
}

/*
 * File: App.java
 * Created Date: 2021-09-24 22:13:27
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

import controllers.MainController;
import views.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        MainWindow mainWindow = new MainWindow();
        new MainController(mainWindow);
        mainWindow.setVisible(true);
    }
}

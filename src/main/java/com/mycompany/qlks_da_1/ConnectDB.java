/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlks_da_1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class ConnectDB {

    public static Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=QUAN_LY_KHACH_SAN;encrypt=false";
        String user = "sa";
        String password = "123";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, user, password);
    }
}

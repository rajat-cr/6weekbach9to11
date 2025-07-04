/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weekbach9to11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class SingletonClass {
    // Private Instance of Classs
    private static SingletonClass instance = null;
    
    Connection connection = null;
    // private COnstructor
    private SingletonClass(){
        try {
            // Connectivity with Database
            //jdbc:mysql://localhost:3306/6weekbatch9to11?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/6weekbatch9to11","root","");
            if(connection!=null){
                System.out.println("Database Connected!");
              
               String registeredTable ="CREATE TABLE IF NOT EXISTS registeredTable(id INT AUTO_INCREMENT, email VARCHAR(50), password VARCHAR(50), PRIMARY KEY(id))";
                PreparedStatement ps = connection.prepareCall(registeredTable);
                ps.execute();
            }
            
            
        } catch (SQLException ex) {
            System.getLogger(SingletonClass.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    // getter method for use in aother class;
    public static SingletonClass getInstance(){
    if(instance == null){
      instance = new SingletonClass();
    }
    return instance;
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weekbach9to11;

/**
 *
 * @author ASUS
 */
public class StudentModel {
    private String name;
    private String email;
    private String password;
    
    
    StudentModel(String name, String email, String password){
     this.name = name;
     this.email = email;
     this.password = password;
    }
    
    String getName(){
    return name;
    }
    String getEmail(){
    return email;
    }
    String getPass(){
    return password;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String username;
    private String password;
    
    public User() {
        firstName = "";
        lastName = "";
        phoneNumber = "";
        address = "";
        city = "";
        state = "";
        zipCode = "";
        email = "";
        username = "";
        password = "";
    }
    
    public User(String firstName, String lastName, String phoneNumber, String address,
            String city, String state, String zipCode, String email,
            String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
        
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }    
    public String getPhone() {
        return phoneNumber;
    }
    
    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }  
        
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
        
    public String getZipCode() {
        return zipCode;
    }
    
    public void setZipcode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
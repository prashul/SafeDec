/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designPatterns.safedec;

/**
 *
 * @author akshayharyani
 */
public class Customer {
    
    private int customer_id;
    private int service_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String emergency_contact_1;
    private String emergency_contact_2;
    
    Customer(int  service_id, String first_name, String last_name, String email, String phone, String emergency_contact_1, String emergency_contact_2){
        
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmergency_contact_1() {
        return emergency_contact_1;
    }

    public void setEmergency_contact_1(String emergency_contact_1) {
        this.emergency_contact_1 = emergency_contact_1;
    }

    public String getEmergency_contact_2() {
        return emergency_contact_2;
    }

    public void setEmergency_contact_2(String emergency_contact_2) {
        this.emergency_contact_2 = emergency_contact_2;
    }
    
    
    
    
}

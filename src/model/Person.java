/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shshyam
 */
public class Person {

    private String Name;
    private int age;
    private String Address;
    private String Community;
    private String City;
    private Patient patient;
    private String updateDate;
    private String health;

    public String getHealth() {
        
        if(this.patient!=null)
        {return this.patient.getHealth();}
        
        else
        {return "Normal";}
        
        
        
    }
    public void deletePatient()
    {
        this.patient=null;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
    @Override
    public String toString()
    {
        return this.Name;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author shshyam
 */
public class VitalSign {
     private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private float temperature;
    private Date timestamp;
    private String result;

    public String getResult() {
        String abnormals;
        abnormals="";
        if(this.temperature >= 97 && this.temperature<=99 && this.heartRate >=60 && this.heartRate <=100 && this.bloodPressure>=80 && this.bloodPressure<=120 && this.respiratoryRate>=12 && this.respiratoryRate<=16 )
            this.result = "Normal";
        else
        {
        if (this.temperature <= 97 || this.temperature>=99)
            abnormals = abnormals+ " "+"Temperature";
        if (this.heartRate <=60 || this.heartRate >=100)
            abnormals = abnormals+ " "+"Heart Rate";
        if(this.bloodPressure>=120)
            abnormals = abnormals+ " "+"Blood Pressure";
        if(this.respiratoryRate<=12 || this.respiratoryRate>=16)
            abnormals = abnormals+ " "+"Respiratory Rate";
        
        this.result = abnormals + " Abnormal";
        }
        return result;
    }

    public void setResult() {
 
    }
    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }
    
    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }
    
    public int getHeartRate() {
        return heartRate;
    }
    
    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
    
    public int getBloodPressure() {
        return bloodPressure;
    }
    
    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    
    public float getTemperature() {
        return temperature;
    }
    
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    
    public Date getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
    
}

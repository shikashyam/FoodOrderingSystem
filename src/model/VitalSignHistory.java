/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shshyam
 */
public class VitalSignHistory {
     private ArrayList<VitalSign> history;
    
    public VitalSignHistory() {
        history = new ArrayList<>();
    }
    
    public ArrayList<VitalSign> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    
    public VitalSign createAndAddVitalSign() {
        VitalSign vitalSign = new VitalSign();
        history.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSign vitalSign) {
        history.remove(vitalSign);
    }

    public String getHealth() {
        int normal=0;
        for(VitalSign vitals:this.history)
        {
            if("Normal".equals(vitals.getResult()))
                normal=0;
            else
                normal=1;
        }
        if (normal==0)
            return "Normal";
        else
            return "Abnormal";
    }
    
}

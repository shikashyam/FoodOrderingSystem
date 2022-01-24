/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.VitalSign;
/**
 *
 * @author shshyam
 */
public class Patient {
    private String patientID;
    private String doctorName;
    private String preferredHospital;
    private VitalSignHistory vitalSignHistory;
    
    public Patient() {
        this.vitalSignHistory = new VitalSignHistory();
    }
    
    public String getPatientID() {
        return patientID;
    }
    
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public String getDoctorName() {
        return doctorName;
    }
    
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public String getPreferredHospital() {
        return preferredHospital;
    }
    
    public void setPreferredHospital(String preferredHospital) {
        this.preferredHospital = preferredHospital;
    }
    
    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public String getHealth() {
    return vitalSignHistory.getHealth();
    }
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }

    
    
}

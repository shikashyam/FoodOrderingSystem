/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.Person;
import model.PersonDirectory;
import model.VitalSign;
import model.VitalSignHistory;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author shshyam
 */
public class PatientsViewVitals extends javax.swing.JPanel {
    PersonDirectory persondirectory;
    Patient myPatient;
    /**
     * Creates new form PatientsViewVitals
     */
    public PatientsViewVitals(PersonDirectory persondirectory) {
        initComponents();
        this.persondirectory=persondirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFindPatient = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblCarSerNum1 = new javax.swing.JLabel();
        txtFindName = new javax.swing.JTextField();
        lblCarSerNum2 = new javax.swing.JLabel();
        txtFindPatientID = new javax.swing.JTextField();
        lblCarSerNum3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        lblCarNumPlate1 = new javax.swing.JLabel();
        lblModel1 = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        lblModel2 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnFindPatient1 = new javax.swing.JButton();
        btnChart = new javax.swing.JButton();

        btnFindPatient.setBackground(new java.awt.Color(255, 255, 255));
        btnFindPatient.setFont(new java.awt.Font("Optima", 0, 18)); // NOI18N
        btnFindPatient.setForeground(new java.awt.Color(0, 153, 0));
        btnFindPatient.setText("Find Patient");
        btnFindPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPatientActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        lblCarSerNum1.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        lblCarSerNum1.setForeground(new java.awt.Color(0, 102, 102));
        lblCarSerNum1.setText("Name  :");

        txtFindName.setBackground(new java.awt.Color(204, 204, 204));

        lblCarSerNum2.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        lblCarSerNum2.setForeground(new java.awt.Color(0, 102, 102));
        lblCarSerNum2.setText("Patient ID  :");

        txtFindPatientID.setBackground(new java.awt.Color(204, 204, 204));

        lblCarSerNum3.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        lblCarSerNum3.setForeground(new java.awt.Color(0, 178, 202));
        lblCarSerNum3.setText("Search for Patients by Name or Patient ID below :");

        tblPatients.setForeground(new java.awt.Color(0, 102, 102));
        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Timestamp", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Temperature", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatients);

        lblCarNumPlate1.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        lblCarNumPlate1.setForeground(new java.awt.Color(0, 102, 102));
        lblCarNumPlate1.setText("Preferred Hospital :");

        lblModel1.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        lblModel1.setForeground(new java.awt.Color(0, 102, 102));
        lblModel1.setText("Preferred Doctor :");

        txtHospital.setBackground(new java.awt.Color(204, 204, 204));

        txtDoctor.setBackground(new java.awt.Color(204, 204, 204));

        lblModel2.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        lblModel2.setForeground(new java.awt.Color(0, 102, 102));
        lblModel2.setText("Age :");

        txtAge.setBackground(new java.awt.Color(204, 204, 204));

        btnFindPatient1.setBackground(new java.awt.Color(255, 255, 255));
        btnFindPatient1.setFont(new java.awt.Font("Optima", 0, 18)); // NOI18N
        btnFindPatient1.setForeground(new java.awt.Color(0, 178, 202));
        btnFindPatient1.setText("Find Patient");
        btnFindPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPatient1ActionPerformed(evt);
            }
        });

        btnChart.setBackground(new java.awt.Color(255, 255, 255));
        btnChart.setFont(new java.awt.Font("Optima", 0, 18)); // NOI18N
        btnChart.setForeground(new java.awt.Color(0, 178, 202));
        btnChart.setText("View Trends");
        btnChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFindPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(438, 438, 438))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnChart, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(430, 430, 430))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCarSerNum1)
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFindPatientID)
                                    .addComponent(txtFindName)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCarSerNum2)
                                    .addComponent(lblCarSerNum3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarNumPlate1)
                            .addComponent(lblModel1)
                            .addComponent(lblModel2))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoctor)
                            .addComponent(txtHospital)
                            .addComponent(txtAge))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnChart, btnFindPatient1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblCarSerNum3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFindName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarSerNum1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFindPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarSerNum2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFindPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarNumPlate1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModel2)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnChart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnChart, btnFindPatient1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPatientActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnFindPatientActionPerformed

    private void btnFindPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPatient1ActionPerformed
        // TODO add your handling code here:

        String PatientID = txtFindPatientID.getText();
        String Name = txtFindName.getText();
        int found=0;
        //clearFields();
        for(Person person : this.persondirectory.getPersonHistory())
        {
            Patient patient = person.getPatient();
            if((patient!=null) && ((PatientID.trim().equals(patient.getPatientID().trim())) || (Name.trim().equals(person.getName().trim()))))
            {
                txtAge.setText(String.valueOf(person.getAge()));
                txtHospital.setText(patient.getPreferredHospital());
                txtDoctor.setText(patient.getDoctorName());
                if(txtFindName.getText().isEmpty())
                txtFindName.setText(person.getName());
                if(txtFindPatientID.getText().isEmpty())
                txtFindPatientID.setText(patient.getPatientID());
                populateTable(patient);
                found=1;
                myPatient=patient;
                //System.out.print(patient.getPatientID()+" Search success!");
            }
        }
        if(found==0)
        {
            JOptionPane.showMessageDialog(this,"No Patient with the details! Try again!");
            return;
        }
    }//GEN-LAST:event_btnFindPatient1ActionPerformed

    private void btnChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChartActionPerformed
        // TODO add your handling code here:
    
        createChart(myPatient);
    }//GEN-LAST:event_btnChartActionPerformed

    private void populateTable(Patient patient)
    {   int vitalsfound=0;
        DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
        dtm.setRowCount(0);
        VitalSignHistory vitalhistory =  patient.getVitalSignHistory();
        for(VitalSign vitals: vitalhistory.getHistory()){
            
            if(vitalhistory!=null)
            {Object[] row = new Object[6];
            row[0] = vitals;
            row[1]= String.valueOf(vitals.getRespiratoryRate());
            row[2]= String.valueOf(vitals.getHeartRate());
            row[3]= String.valueOf(vitals.getBloodPressure());
            row[4]= String.valueOf(vitals.getTemperature());
            row[5]= String.valueOf(vitals.getResult());
            vitalsfound=1;
            dtm.addRow(row);}
        }  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChart;
    private javax.swing.JButton btnFindPatient;
    private javax.swing.JButton btnFindPatient1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarNumPlate1;
    private javax.swing.JLabel lblCarSerNum1;
    private javax.swing.JLabel lblCarSerNum2;
    private javax.swing.JLabel lblCarSerNum3;
    private javax.swing.JLabel lblModel1;
    private javax.swing.JLabel lblModel2;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtFindName;
    private javax.swing.JTextField txtFindPatientID;
    private javax.swing.JTextField txtHospital;
    // End of variables declaration//GEN-END:variables

    private void createChart(Patient myPatient) {
      DefaultCategoryDataset vitalSignDataset=new DefaultCategoryDataset();
        /*int selectedRow = viewPatientsJTable.getSelectedRow();
        Person person = (Person) viewPatientsJTable.getValueAt(selectedRow, 0);
        Patient patient= person.getPatient();
        if(patient==null)
        {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create "
                    + "Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }*/
        
        ArrayList<VitalSign> vitalSignList = myPatient.getVitalSignHistory().getHistory();
        /*At least 2 vital sign records needed to show chart */
        if (vitalSignList.isEmpty() || vitalSignList.size() == 1) {
            JOptionPane.showMessageDialog(this, "No vital signs or only one vital "
                    + "sign found. At least 2 vital sign records needed to show chart!", 
                    "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (VitalSign vitalSign : vitalSignList) {
            vitalSignDataset.addValue(vitalSign.getRespiratoryRate(),"RR", vitalSign.getTimestamp());
            vitalSignDataset.addValue(vitalSign.getHeartRate(),"HR", vitalSign.getTimestamp());
            vitalSignDataset.addValue(vitalSign.getBloodPressure(),"BP", vitalSign.getTimestamp());
            vitalSignDataset.addValue(vitalSign.getTemperature(),"TMP", vitalSign.getTimestamp());
        }
        
        JFreeChart vitalSignChart= ChartFactory.createBarChart3D("Vital Sign Chart", 
                "Time Stamp", "Rate", vitalSignDataset, PlotOrientation.VERTICAL, true, false, false);
        vitalSignChart.setBackgroundPaint(Color.white);
        CategoryPlot vitalSignChartPlot = vitalSignChart.getCategoryPlot();
        vitalSignChartPlot.setBackgroundPaint(Color.lightGray);
        
        CategoryAxis vitalSignDomainAxis = vitalSignChartPlot.getDomainAxis();
        vitalSignDomainAxis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        
        NumberAxis vitalSignRangeAxis = (NumberAxis) vitalSignChartPlot.getRangeAxis();
        vitalSignRangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        ChartFrame chartFrame = new ChartFrame("Chart", vitalSignChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(500, 500);
    }
}

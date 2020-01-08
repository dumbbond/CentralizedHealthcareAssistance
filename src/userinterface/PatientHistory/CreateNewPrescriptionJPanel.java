/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientHistory;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HospitalDoctorOrganization;
import Business.Patient.MedicalFile;
import Business.Patient.Patient;
import Business.Patient.Prescription;
import Business.Patient.PrescriptionDetails;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rruch
 */
public class CreateNewPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewPrescription
     */
    private JPanel userProcessContainer;
    private HospitalDoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    Patient patient;
    EcoSystem business;
    MedicalFile medFile;
    ArrayList<PrescriptionDetails> prescriptionDetailsList;
    Prescription prescription;

    public CreateNewPrescriptionJPanel(JPanel userProcessContainer, UserAccount doctorAccount, HospitalDoctorOrganization HospOrganization, Enterprise enterprise, Patient patient, MedicalFile medFile, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = HospOrganization;
        this.enterprise = enterprise;
        this.userAccount = doctorAccount;
        this.patient = patient;
        this.medFile = medFile;
        this.business = business;
        this.prescriptionDetailsList = new ArrayList<>();
        prescription = new Prescription(Date.from(Instant.now()), userAccount,business.getPrescriptionSequenceId());

        populatePresTab();
        populate();
    }
    
    public void populate(){
        
        lblPatientName.setText(patient.getName());
        
        
//        if (patient.getPhoto() != null){
//        ImageIcon logoPreview = new ImageIcon(patient.getPhoto());
//        lblPhoto.setIcon(logoPreview);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        tblPrescriptionDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMedicineName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDosage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFrequency = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNoOfDays = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCondition = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNotes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblFormTitle = new javax.swing.JLabel();
        btnAddToList = new javax.swing.JButton();
        btnClearInput = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();

        tblPrescriptionDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Dose", "Frequency", "No. of days", "Condition", "Notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrescriptionDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(tblPrescriptionDetails);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setLabelFor(txtMedicineName);
        jLabel1.setText("Medicine Name: ");

        txtMedicineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineNameActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setLabelFor(txtDosage);
        jLabel2.setText("Dosage :");

        jLabel3.setText("Hint: 20 mg, 50mg");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setLabelFor(txtDosage);
        jLabel4.setText("Frequency :");

        jLabel5.setText("Hint: Morning, Before Lunch, Twice a day etc");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setLabelFor(txtDosage);
        jLabel6.setText("Number Of Days :");

        jLabel7.setText("Hint: Number Only! ( eg: 3 )");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setLabelFor(txtDosage);
        jLabel8.setText("Condition :");

        jLabel9.setText("Hint: Headache, Acidity, Pain");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setLabelFor(txtDosage);
        jLabel10.setText("Notes :");

        txtNotes.setText("Your Message");
        txtNotes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNotesFocusGained(evt);
            }
        });
        txtNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotesActionPerformed(evt);
            }
        });

        jLabel11.setText("Hint: Notes for reference, if any");

        lblFormTitle.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        lblFormTitle.setText("Create New Prescription");

        btnAddToList.setText("Add to List");
        btnAddToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToListActionPerformed(evt);
            }
        });

        btnClearInput.setText("Clear input");
        btnClearInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearInputActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete from List");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel12.setText("Hint: Sorbitate, Myrocin, Gelucine");

        lblPatientName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPatientName.setText("Patient Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPatientName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(lblFormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(215, 215, 215))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNoOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnClearInput, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAddToList, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)))
                                .addGap(41, 41, 41)))))
                .addContainerGap(630, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddToList)
                            .addComponent(btnClearInput))))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addGap(30, 30, 30)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(385, 385, 385))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedicineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicineNameActionPerformed

    private void btnAddToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToListActionPerformed
        // TODO add your handling code here:
        try {
            String medName = txtMedicineName.getText();
            String dosage = txtDosage.getText();
            String freq = txtFrequency.getText();
            int numOfDays = Integer.parseInt(txtNoOfDays.getText());
            String cond = txtCondition.getText();
            String notes = txtNotes.getText();
            if (medName.equals("") || dosage.equals("") || freq.equals("") || cond.equals("") || notes.equals("")) {
                JOptionPane.showMessageDialog(null, "All input fields are mandatory!");
                return;
            }

            PrescriptionDetails presDetail = new PrescriptionDetails(medName, dosage, freq, cond, numOfDays, notes);
            prescriptionDetailsList.add(presDetail);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Number Of Days cannot contain letters, numbers only!");
            return;
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "All input fields are mandatory!");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please check all input fields and try again!");
            return;
        }
        clearInputs();

        populatePresTab();
    }//GEN-LAST:event_btnAddToListActionPerformed

    public void populatePresTab() {
        DefaultTableModel model = (DefaultTableModel) tblPrescriptionDetails.getModel();

        model.setRowCount(0);

        for (PrescriptionDetails pres : prescriptionDetailsList) {

            Object[] row = new Object[6];
            row[0] = pres;
            row[1] = pres.getDose();
            row[2] = pres.getFrequency();
            row[3] = pres.getNoOfDays();
            row[4] = pres.getCondition();
            row[5] = pres.getNotes();

            model.addRow(row);

        }

    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "If you go back without clicking submit, you might loose the changes!", "Confirmation Required", JOptionPane.YES_NO_OPTION)) {

            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            PatientHistoryJPanel dwjp = (PatientHistoryJPanel) component;
            dwjp.populatePrescriptionTableAsPerRecord(medFile);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNotesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNotesFocusGained
        // TODO add your handling code here:
        if (txtNotes.getText().equalsIgnoreCase("Your Message")) {

            txtNotes.setText("");

        }
    }//GEN-LAST:event_txtNotesFocusGained

    private void txtNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotesActionPerformed

    private void btnClearInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearInputActionPerformed
        // TODO add your handling code here:
        clearInputs();
    }//GEN-LAST:event_btnClearInputActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPrescriptionDetails.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table!");
            return;
        }
        PrescriptionDetails presDet = (PrescriptionDetails) tblPrescriptionDetails.getValueAt(selectedRow, 0);

        this.prescriptionDetailsList.remove(presDet);
        populatePresTab();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Are you sure you want to submit this list ? ", "Confirmation Required", JOptionPane.YES_NO_OPTION)) {
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            if (prescriptionDetailsList.size() > 0) {
                prescription.setMedicineDetails(prescriptionDetailsList);
                medFile.addPrescription(prescription);
            }
            PatientHistoryJPanel dwjp = (PatientHistoryJPanel) component;
            dwjp.populatePrescriptionTableAsPerRecord(medFile);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    public void clearInputs() {

        txtMedicineName.setText("");
        txtDosage.setText("");
        txtFrequency.setText("");
        txtNoOfDays.setText("");
        txtCondition.setText("");
        txtNotes.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToList;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearInput;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblFormTitle;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JTable tblPrescriptionDetails;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtDosage;
    private javax.swing.JTextField txtFrequency;
    private javax.swing.JTextField txtMedicineName;
    private javax.swing.JTextField txtNoOfDays;
    private javax.swing.JTextField txtNotes;
    // End of variables declaration//GEN-END:variables
}
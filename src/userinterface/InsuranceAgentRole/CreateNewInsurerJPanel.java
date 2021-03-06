/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAgentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.GeneralTools;
import Business.Insurance.Insurer;
import Business.Insurance.InsurerDirectory;
import Business.Network.Network;
import Business.OTPVerification.OTPVerification;
import Business.Organization.InsuranceAgentOrganization;
import Business.Organization.InsuranceFinanceOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CAFetchPatientRequest;
import Business.WorkQueue.CAOTPAuthorizationWorkRequest;
import Business.WorkQueue.FinanceManagerApprovalForNewInsuranceWorkRequest;
import Business.WorkQueue.InsuranceAgentInsurancePlanProposalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Team NullPointerException <>
 */
public class CreateNewInsurerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private InsuranceAgentOrganization agentOrganization;
    private EcoSystem business;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Patient insurePatient;
    private Insurer hiddenInsurer;

    /**
     * Creates new form CreateNewInsurerJPanel
     */
    public CreateNewInsurerJPanel() {
        initComponents();
    }

    public CreateNewInsurerJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.agentOrganization = (InsuranceAgentOrganization) organization;
        this.business = business;
        this.enterprise = enterprise;
        populateComboBox();
        populateAgentWorkRequest();
//        falsePopulate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPatientId = new javax.swing.JLabel();
        txtInsurerId = new javax.swing.JTextField();
        lblFolioNum = new javax.swing.JLabel();
        txtFolioNum = new javax.swing.JTextField();
        lblInsurerName = new javax.swing.JLabel();
        txtInsurerName = new javax.swing.JTextField();
        lblInsuranceAmount = new javax.swing.JLabel();
        comboInsuranceAmount = new javax.swing.JComboBox<>();
        btnProcessApplication = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPatientPin = new javax.swing.JTextField();
        btnGenaratePin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        btnRetrievePatient = new javax.swing.JButton();
        btnRequestFinanceManagerApproval = new javax.swing.JButton();
        lblInsuranceDuration = new javax.swing.JLabel();
        comboInsuranceDuration = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAgentFinanceManagerProposalWorkRequest = new javax.swing.JTable();
        btnAssignAgentReq = new javax.swing.JButton();
        lblOtpMessage = new javax.swing.JLabel();
        lblFormTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        lblPatientId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPatientId.setText("Insurer Id:");

        txtInsurerId.setEnabled(false);

        lblFolioNum.setText("Folio Number:");

        txtFolioNum.setEnabled(false);

        lblInsurerName.setText("Insurer Name:");

        lblInsuranceAmount.setText("Insurance Amount:");

        comboInsuranceAmount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnProcessApplication.setText("Process Application");
        btnProcessApplication.setEnabled(false);
        btnProcessApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessApplicationActionPerformed(evt);
            }
        });

        jLabel4.setText("PIN : ");

        btnGenaratePin.setText("Generate PIN");
        btnGenaratePin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenaratePinActionPerformed(evt);
            }
        });

        jLabel3.setText("Patient ID : ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Retrieve Patient History");

        btnRetrievePatient.setText("Retrieve Patient");
        btnRetrievePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrievePatientActionPerformed(evt);
            }
        });

        btnRequestFinanceManagerApproval.setText("Request Finance Manager Approval");
        btnRequestFinanceManagerApproval.setEnabled(false);
        btnRequestFinanceManagerApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestFinanceManagerApprovalActionPerformed(evt);
            }
        });

        lblInsuranceDuration.setText("Insurance Duration:");

        comboInsuranceDuration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblAgentFinanceManagerProposalWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Insurance Amount", "Premium Amount", "Date of Insurance", "Date of Expiration", "Status", "Sender", "Receiver"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAgentFinanceManagerProposalWorkRequest);

        btnAssignAgentReq.setText("Assign to me");
        btnAssignAgentReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignAgentReqActionPerformed(evt);
            }
        });

        lblOtpMessage.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblOtpMessage.setForeground(new java.awt.Color(255, 0, 0));

        lblFormTitle.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        lblFormTitle.setText("Insurance Agent Home Screen");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Insurance Agent Work Area");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Create New Insurer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(468, 468, 468)
                .addComponent(lblFormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtPatientPin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(255, 255, 255))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblPatientId, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(lblFolioNum))
                                                        .addComponent(lblInsurerName))
                                                    .addComponent(lblInsuranceAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblInsuranceDuration, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(txtInsurerName, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(txtFolioNum, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(txtInsurerId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(comboInsuranceDuration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(comboInsuranceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(btnRequestFinanceManagerApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(243, 243, 243))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOtpMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnGenaratePin, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRetrievePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(btnAssignAgentReq, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btnProcessApplication)))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblFormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(btnGenaratePin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtPatientPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnRetrievePatient)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnProcessApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAssignAgentReq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblOtpMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInsurerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPatientId))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFolioNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFolioNum))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtInsurerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblInsurerName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblInsuranceDuration)
                                    .addComponent(comboInsuranceDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblInsuranceAmount)
                                    .addComponent(comboInsuranceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(btnRequestFinanceManagerApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 307, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessApplicationActionPerformed
        try{
        int selectedRow = tblAgentFinanceManagerProposalWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to continue.");
            return;
        }
        boolean isThere = false;
       InsuranceFinanceOrganization myOrg = null;
          InsuranceAgentInsurancePlanProposalWorkRequest myRequest = ((InsuranceAgentInsurancePlanProposalWorkRequest)tblAgentFinanceManagerProposalWorkRequest.getValueAt(selectedRow, 0));
        Insurer insurer;
        int insurerId = Integer.parseInt(String.valueOf(tblAgentFinanceManagerProposalWorkRequest.getValueAt(selectedRow, 0)));
        Patient insurerName = (Patient)tblAgentFinanceManagerProposalWorkRequest.getValueAt(selectedRow, 1);
        String folioNum = txtFolioNum.getText();
        double insuredAmount = Double.parseDouble(String.valueOf(tblAgentFinanceManagerProposalWorkRequest.getValueAt(selectedRow, 2)));
        double premiumPerMonth = Double.parseDouble(String.valueOf(tblAgentFinanceManagerProposalWorkRequest.getValueAt(selectedRow, 3)));
        Date dateOfInsurance = new Date(String.valueOf(tblAgentFinanceManagerProposalWorkRequest.getValueAt(selectedRow, 4)));
        Date dateOfExpiration = new Date(String.valueOf(tblAgentFinanceManagerProposalWorkRequest.getValueAt(selectedRow, 5)));
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof InsuranceFinanceOrganization) {
                if (!(((InsuranceFinanceOrganization) org).getInsurerDirectory() == null)) {
                    for (Insurer ins : ((InsuranceFinanceOrganization) org).getInsurerDirectory().getInsurerList()) {
                        if ((insurerId == ins.getInsurerId())) {
                            isThere = true;
                             myOrg =((InsuranceFinanceOrganization) org);
                        }
                    }
                } 
//                for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
//                    if (request.getStatus().equals("Approved")) {
//                        org.getWorkQueue().getWorkRequestList().remove(request);
//                    }
//                }
            }
        }
        
        if(!isThere){
            
       myOrg.getInsurerDirectory().addInsurer(insurerName, insurerId, folioNum, insuredAmount, premiumPerMonth, dateOfInsurance, dateOfExpiration);
                            myRequest.setStatus("complete");
        }
        
       for(Organization torg : enterprise.getOrganizationDirectory().getOrganizationList()){
           
           if(torg instanceof InsuranceFinanceOrganization){
           ((InsuranceFinanceOrganization)torg).getInsurerDirectory().addInsurer(insurerName, insurerId, folioNum, insuredAmount, premiumPerMonth, dateOfInsurance, dateOfExpiration);
           JOptionPane.showMessageDialog(null, "Request, successfull!");
           }
       
       }
               
        
        
//        DefaultTableModel model = (DefaultTableModel) tblAgentFinanceManagerProposalWorkRequest.getModel();
//        model.setRowCount(0);
populateAgentWorkRequest();
        JOptionPane.showMessageDialog(null, "Insurance Application Successful!");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, "Request, successfull!");
            return;
        }
    }//GEN-LAST:event_btnProcessApplicationActionPerformed

    private void btnGenaratePinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenaratePinActionPerformed
        try {

            int ptId = Integer.parseInt(txtPatientId.getText());

            CAOTPAuthorizationWorkRequest otpRequest = new CAOTPAuthorizationWorkRequest(CAOTPAuthorizationWorkRequest.RequestType.Normal, ptId);
            otpRequest.setSender(userAccount);
            otpRequest.setStatus("Requested");

//            System.out.println("userinterface.ReceptionistRole.ReceptionistWorkAreaJPanel.btnGenaratePinActionPerformed() -- otp verify return -- ");
            if (OTPVerification.verifyPatientEmail(business, otpRequest)) {
                lblOtpMessage.setText("Request has been sent to patient's Email, kindly enter pin to retrieve.");
                btnRetrievePatient.setEnabled(true);
                txtPatientPin.setEnabled(true);
                return;
            }

            lblOtpMessage.setText("Invalid Patient ID, kindly verify.");
            return;
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Patient Id cannot be String, please enter number only!");
            return;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Invalid Patient ID, kindly verify.");
            return;

        }


    }//GEN-LAST:event_btnGenaratePinActionPerformed

    private void btnRetrievePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrievePatientActionPerformed
        // TODO add your handling code here:
        try {

            int pin = Integer.parseInt(txtPatientPin.getText());
            int ptId = Integer.parseInt(txtPatientId.getText());

            CAFetchPatientRequest fetchRequest = new CAFetchPatientRequest();
            Boolean isPatientRetrieveSuccessfull = false;
            Patient myPatient;

            fetchRequest.setSender(userAccount);
            fetchRequest.setStatus("Requested");

            fetchRequest.setOtp(pin);
            fetchRequest.setPatientId(ptId);

            if (OTPVerification.fetchPatient(business, fetchRequest)) {
                System.out.println("otp verification successfull by CA");
                myPatient = fetchRequest.getPatient();
                if (myPatient != null) {
                    isPatientRetrieveSuccessfull = true;
                    
                    txtInsurerId.setText(String.valueOf(myPatient.getPatientId()));
                    txtInsurerId.setText(txtPatientId.getText());
                    txtInsurerName.setText(myPatient.getName());
                    btnRequestFinanceManagerApproval.setEnabled(true);
                    insurePatient = myPatient;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid PIN!");
                    return;
                }
            };
        } catch (NumberFormatException r) {
            JOptionPane.showMessageDialog(null, "Invalid PIN!");
            return;
        } catch (Exception r) {
            JOptionPane.showMessageDialog(null, "Invalid PIN!");
            return;
        }
    }//GEN-LAST:event_btnRetrievePatientActionPerformed

    private void btnRequestFinanceManagerApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestFinanceManagerApprovalActionPerformed

    Boolean isInsured = GeneralTools.isPatientInsured(insurePatient, business);
    
    if(isInsured){
     JOptionPane.showMessageDialog(null, "Patient is already insured with insurer id: " + insurePatient.getPatientId()+", kindly verify again.");
                return;
    
    }

        FinanceManagerApprovalForNewInsuranceWorkRequest request = new FinanceManagerApprovalForNewInsuranceWorkRequest();
        request.setRequestDate(new Date());
        request.setInsurePatient(insurePatient);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setDuration(Integer.parseInt((String) comboInsuranceDuration.getSelectedItem()));
        request.setInsuranceAmount(Double.parseDouble((String) comboInsuranceAmount.getSelectedItem()));
    
        
        
        
        
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof InsuranceFinanceOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
                JOptionPane.showMessageDialog(null, "Request sent to Finance Manager for approval.");
                return;
            }
    }//GEN-LAST:event_btnRequestFinanceManagerApprovalActionPerformed

    private void btnAssignAgentReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignAgentReqActionPerformed
        int selectedRow = tblAgentFinanceManagerProposalWorkRequest.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest request = (WorkRequest) tblAgentFinanceManagerProposalWorkRequest.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateAgentWorkRequest();
        btnProcessApplication.setEnabled(true);
    }//GEN-LAST:event_btnAssignAgentReqActionPerformed

    private void populateComboBox() {
        Calendar cal = Calendar.getInstance();
        comboInsuranceAmount.setModel(new DefaultComboBoxModel<>(new String[]{"250000", "50000", "750000", "1000000"}));
        comboInsuranceDuration.setModel(new DefaultComboBoxModel<>(new String[]{"15", "20", "25", "35", "40", "45"}));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignAgentReq;
    private javax.swing.JButton btnGenaratePin;
    private javax.swing.JButton btnProcessApplication;
    private javax.swing.JButton btnRequestFinanceManagerApproval;
    private javax.swing.JButton btnRetrievePatient;
    private javax.swing.JComboBox<String> comboInsuranceAmount;
    private javax.swing.JComboBox<String> comboInsuranceDuration;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblFolioNum;
    private javax.swing.JLabel lblFormTitle;
    private javax.swing.JLabel lblInsuranceAmount;
    private javax.swing.JLabel lblInsuranceDuration;
    private javax.swing.JLabel lblInsurerName;
    private javax.swing.JLabel lblOtpMessage;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JTable tblAgentFinanceManagerProposalWorkRequest;
    private javax.swing.JTextField txtFolioNum;
    private javax.swing.JTextField txtInsurerId;
    private javax.swing.JTextField txtInsurerName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientPin;
    // End of variables declaration//GEN-END:variables

    public void populateAgentWorkRequest() {
        DefaultTableModel model = (DefaultTableModel) tblAgentFinanceManagerProposalWorkRequest.getModel();

        model.setRowCount(0);

        for (WorkRequest request : agentOrganization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof InsuranceAgentInsurancePlanProposalWorkRequest) {
                Insurer insured = ((InsuranceAgentInsurancePlanProposalWorkRequest) request).getInsuredPatient();
                Object[] row = new Object[9];
                row[0] = request;
                row[1] = insured.getPatient();
                row[2] = insured.getInsuredAmount();
                row[3] = insured.getPremiumPerMonth();
                row[4] = insured.getDateOfInsurance();
                row[5] = insured.getDateOfExpiration();
                row[6] = request.getStatus();
                row[7] = request.getSender().getEmployee().getName();
                row[8] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                txtFolioNum.setText(insured.getFolioNumber());
                model.addRow(row);
            }
        }
    }

}

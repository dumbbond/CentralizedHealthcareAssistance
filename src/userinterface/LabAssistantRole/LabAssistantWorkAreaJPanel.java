/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.EcoSystem;
import Business.GeneralTools;
import Business.Organization.HospitalLabOrganization;
import Business.Organization.Organization;
import Business.Patient.LabTest;
import Business.Patient.TestDetails;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Team NullPointerException
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private HospitalLabOrganization labOrganization;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (HospitalLabOrganization) organization;

        populateTable();
        addListnerToLabTestTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workTableJRequest.getModel();

        model.setRowCount(0);
        for (WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()) {

            LabTestWorkRequest myRequest = (LabTestWorkRequest) request;
            System.out.println("myRequest -- " + myRequest);
            LabTest labTest = myRequest.getLabTest();
            System.out.println("userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel.populateTable() 1-- " + (myRequest instanceof LabTestWorkRequest));
            System.out.println("userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel.populateTable() 2-- " + myRequest.getClass().getName());
            Object[] row = new Object[7];

            row[0] = myRequest;
            row[1] = labTest;
            System.out.println("labTest -- " + labTest);
            row[2] = labTest.getRefDoctorname();
            System.out.println("labTest.getRefDoctorname() -- " + labTest.getRefDoctorname());
            row[3] = myRequest.getReceiver();
            row[4] = GeneralTools.getMyEnterprise(labOrganization, business);
            row[5] = GeneralTools.getMyNetwork(labOrganization, business);
            row[6] = labTest.getStatus();

            model.addRow(row);
        }

        addListnerToLabTestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAssignToMe = new javax.swing.JButton();
        btnProcessTest = new javax.swing.JButton();
        btnReferesh = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        workTableJRequest = new javax.swing.JTable();
        lblFormTitle = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAssignToMe.setText("Assign to me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });
        add(btnAssignToMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 360, -1, -1));

        btnProcessTest.setText("Process Test  >>");
        btnProcessTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessTestActionPerformed(evt);
            }
        });
        add(btnProcessTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 400, 180, 60));

        btnReferesh.setText("Refresh");
        btnReferesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefereshActionPerformed(evt);
            }
        });
        add(btnReferesh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 120, -1, -1));

        workTableJRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Lab Test ID", "Doctor", "Lab Assistant", "Lab's Hospital", "Lab's Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workTableJRequest.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(workTableJRequest);

        add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 970, 200));

        lblFormTitle.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        lblFormTitle.setText("View Lab Test Requests");
        add(lblFormTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void addListnerToLabTestTable() {

        workTableJRequest.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (workTableJRequest.getSelectedRow() > -1) {
                    int selectedRow = workTableJRequest.getSelectedRow();
                    LabTest labTest = (LabTest) workTableJRequest.getValueAt(selectedRow, 1);
                    LabTestWorkRequest workReq = (LabTestWorkRequest) workTableJRequest.getValueAt(selectedRow, 0);

                    if (labTest.getStatus().equalsIgnoreCase("complete") || labTest.getStatus().equalsIgnoreCase("cancel")) {
                        btnCancel.setEnabled(false);
                        btnAssignToMe.setEnabled(false);
                        btnCancel.setEnabled(false);
                        btnProcessTest.setEnabled(false);
                    } else {
                        btnCancel.setEnabled(true);
                        if (workReq.getReceiver() == userAccount) {
                            btnAssignToMe.setEnabled(false);
                            btnProcessTest.setEnabled(true);
                        } else {
                            btnAssignToMe.setEnabled(true);
                        }

                    }

                }
            }

        });

    }


    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed

        int selectedRow = workTableJRequest.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row!");
            return;
        }

        LabTestWorkRequest request = (LabTestWorkRequest) workTableJRequest.getValueAt(selectedRow, 0);
        LabTest labTest = request.getLabTest();
        labTest.setLabAssistant(userAccount);
        labTest.setStatus("assigned");
        request.setReceiver(userAccount);
        request.setStatus("assigned");

        populateTable();

    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnProcessTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessTestActionPerformed

        int selectedRow = workTableJRequest.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row!");
            return;
        }

        LabTestWorkRequest request = (LabTestWorkRequest) workTableJRequest.getValueAt(selectedRow, 0);
        LabTest labTest = request.getLabTest();
        labTest.setLabAssistant(userAccount);
        labTest.setStatus("pending");
        request.setReceiver(userAccount);
        request.setStatus("pending");

        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnProcessTestActionPerformed

    private void btnRefereshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefereshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefereshActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:

        int selectedRow = workTableJRequest.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row!");
            return;
        }
        LabTestWorkRequest request = (LabTestWorkRequest) workTableJRequest.getValueAt(selectedRow, 0);
        LabTest labTest = request.getLabTest();
        labTest.setLabAssistant(userAccount);
        labTest.setStatus("cancel");
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnProcessTest;
    private javax.swing.JButton btnReferesh;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblFormTitle;
    private javax.swing.JTable workTableJRequest;
    // End of variables declaration//GEN-END:variables
}

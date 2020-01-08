/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientHistory;

import Business.Disease;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author rruch
 */
public class PatientProfile extends javax.swing.JPanel {

    /**
     * Creates new form PatientProfile
     */
    private JPanel userProcessContainer; 
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private Patient patient;
    
    public PatientProfile(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Patient patient) {
        initComponents();
        loadUpdate(patient);
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.patient = patient;
    }
    
    public void loadUpdate(Patient patient){
        txtName.setText(patient.getName());
        txtAddress.setText(patient.getAddress());
        txtCity.setText(patient.getCity());
        cboState.setSelectedItem(patient.getState());
        txtZip.setText(String.valueOf(patient.getZip()));
        txtCellNo.setText(patient.getCellNo());
        Calendar ca = Calendar.getInstance();
        ca.setTime(patient.getDob());
        dateDOB.setSelectedDate(ca);
        cboSex.setSelectedItem(patient.getSex());
        txtEmail.setText(patient.getEmail());
        txtGovtId.setText(patient.getId());
        txtEmergencyName1.setText(patient.getEmerName1());
        txtEmergencyName2.setText(patient.getEmerName2());
        txtEmergencyPhone1.setText(patient.getEmerNumber1());
        txtEmergencyPhone2.setText(patient.getEmerNumber2());
        txtEmergencyRelationship1.setText(patient.getEmerRelationship1());
        txtEmergencyRelationship2.setText(patient.getEmerRelationship2());
        
        if (patient.isCaffinatedDrink()){
            rdoBtnYes.setSelected(true);
            txtNoOfCups.setText(String.valueOf(patient.getNoOfCups()));
            txtNoOfCups.setEnabled(true);
        }else{
            rdoBtnNo.setSelected(true);
            txtNoOfCups.setText(String.valueOf(patient.getNoOfCups()));
            txtNoOfCups.setEnabled(false);
        }
        
        if (patient.getAlcoholFrequency().equalsIgnoreCase("Daily")){
            rdoBtnDaily.setSelected(true);
        }
        else if (patient.getAlcoholFrequency().equalsIgnoreCase("Weekly")){
            rdoBtnWeekly.setSelected(true);
        }else if (patient.getAlcoholFrequency().equalsIgnoreCase("Occasionally")){
            rdoBtnOccasionally.setSelected(true);
        }else {
            rdoBtnNever.setSelected(true);
        }
        
        if (patient.isSmoke()){
            rdoBtnSmokeYes.setSelected(true);
            txtSmokePacks.setText(String.valueOf(patient.getPacksPerDay()));
            txtSmokePacks.setEnabled(true);
        } else {
            rdoBtnSmokeNo.setSelected(true);
            txtSmokePacks.setText(String.valueOf(patient.getPacksPerDay()));
            txtSmokePacks.setEnabled(false);
        }
        
        txtExerciseTimes.setText(String.valueOf(patient.getExercisePerWeek()));
        txtExerciseType.setText(patient.getTypeOfExercise());
        
        txtAreaFamilyHistory.setText(patient.getFamilyMedicalHistory());
        
        DefaultListModel lstAllergiesModel = new DefaultListModel();        
        for (String str: patient.getAllergies()){
            
            lstAllergiesModel.addElement(str);
            
        }
        lstAllergies.setModel(lstAllergiesModel);
        
        if (patient.getDietaryPreference().equalsIgnoreCase("Standard")){
            rdoBtnStandard.setSelected(true);
        }
        else if (patient.getDietaryPreference().equalsIgnoreCase("Pescetarian")){
            rdoBtnPescetarian.setSelected(true);
        }
        else if (patient.getDietaryPreference().equalsIgnoreCase("Vegetarian")){
            rdoBtnVegetarian.setSelected(true);
        }
        else if (patient.getDietaryPreference().equalsIgnoreCase("LactoVegetarian")){
            rdoBtnLactoVegetarian.setSelected(true);
        }
        else if (patient.getDietaryPreference().equalsIgnoreCase("OvoVegetarian")){
            rdoBtnOvoVegetarian.setSelected(true);
        }
        else if (patient.getDietaryPreference().equalsIgnoreCase("Vegan")){
            rdoBtnVegan.setSelected(true);
        }
        

        DefaultListModel lstPatientModel = new DefaultListModel();
        for (Disease disease: patient.getPreviousDisease()){
            lstPatientModel.addElement(disease);
        }
        lstPatient.setModel(lstPatientModel);
        
        if (patient.getPhoto() != null){
        ImageIcon logoPreview = new ImageIcon(patient.getPhoto());
        lblPhoto.setIcon(logoPreview);}
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblFormTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        cboState = new javax.swing.JComboBox();
        lblZip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        lblTextNo = new javax.swing.JLabel();
        txtCellNo = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        dateDOB = new datechooser.beans.DateChooserCombo();
        lblSex = new javax.swing.JLabel();
        cboSex = new javax.swing.JComboBox();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblEmergencyName1 = new javax.swing.JLabel();
        txtEmergencyName1 = new javax.swing.JTextField();
        lblRelationship1 = new javax.swing.JLabel();
        txtEmergencyRelationship1 = new javax.swing.JTextField();
        lblEmergencyPhone1 = new javax.swing.JLabel();
        txtEmergencyPhone1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtEmergencyName2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtEmergencyRelationship2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtEmergencyPhone2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPatient = new javax.swing.JList();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rdoBtnYes = new javax.swing.JRadioButton();
        rdoBtnNo = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        txtNoOfCups = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        rdoBtnDaily = new javax.swing.JRadioButton();
        rdoBtnWeekly = new javax.swing.JRadioButton();
        rdoBtnOccasionally = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        rdoBtnSmokeYes = new javax.swing.JRadioButton();
        rdoBtnSmokeNo = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        txtSmokePacks = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtExerciseTimes = new javax.swing.JTextField();
        lblExerciseType = new javax.swing.JLabel();
        txtExerciseType = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaFamilyHistory = new javax.swing.JTextArea();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstAllergies = new javax.swing.JList();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        rdoBtnStandard = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        rdoBtnPescetarian = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        rdoBtnVegetarian = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        rdoBtnLactoVegetarian = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        rdoBtnOvoVegetarian = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        rdoBtnVegan = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lblGovtId = new javax.swing.JLabel();
        txtGovtId = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        rdoBtnNever = new javax.swing.JRadioButton();
        btnback = new javax.swing.JButton();

        lblFormTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblFormTitle.setText("Profile for Patient: ");

        lblName.setText("Name: ");

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        lblAddress.setText("Address:");

        txtAddress.setEditable(false);
        txtAddress.setMinimumSize(new java.awt.Dimension(6, 26));
        txtAddress.setPreferredSize(new java.awt.Dimension(6, 26));

        lblCity.setText("City:");

        txtCity.setEditable(false);
        txtCity.setMinimumSize(new java.awt.Dimension(6, 26));
        txtCity.setPreferredSize(new java.awt.Dimension(6, 26));

        lblState.setText("State:");

        cboState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));
        cboState.setEnabled(false);

        lblZip.setText("Zip:");

        txtZip.setEditable(false);

        lblTextNo.setText("Cell no:");

        txtCellNo.setEditable(false);

        lblDOB.setText("Date of Birth:");

        dateDOB.setCalendarPreferredSize(new java.awt.Dimension(350, 210));
        dateDOB.setEnabled(false);

        lblSex.setText("Sex:");

        cboSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));
        cboSex.setEnabled(false);

        lblEmail.setText("Email:");

        txtEmail.setEditable(false);

        jLabel10.setText("Photo:");

        lblEmergencyName1.setText("Name:");

        txtEmergencyName1.setEditable(false);

        lblRelationship1.setText("Relationship:");

        txtEmergencyRelationship1.setEditable(false);

        lblEmergencyPhone1.setText("Phone:");

        txtEmergencyPhone1.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Emergency Contact 1: ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("Emergency Contact 2:");

        jLabel20.setText("Name:");

        txtEmergencyName2.setEditable(false);
        txtEmergencyName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmergencyName2ActionPerformed(evt);
            }
        });

        jLabel21.setText("Relationship:");

        txtEmergencyRelationship2.setEditable(false);

        jLabel22.setText("Phone:");

        txtEmergencyPhone2.setEditable(false);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setText("Previously Diagnosed for:");

        lstPatient.setEnabled(false);
        jScrollPane2.setViewportView(lstPatient);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setText("Social Lifestyle Evaluation:");

        jLabel17.setText("Do you drink coffee, caffeinated soft drinks, or tea?");

        rdoBtnYes.setText("Yes");
        rdoBtnYes.setEnabled(false);
        rdoBtnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBtnYesActionPerformed(evt);
            }
        });

        rdoBtnNo.setSelected(true);
        rdoBtnNo.setText("No");
        rdoBtnNo.setEnabled(false);
        rdoBtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBtnNoActionPerformed(evt);
            }
        });

        jLabel18.setText("If yes, How many cups per day:");

        txtNoOfCups.setEditable(false);

        jLabel23.setText("Do you drink alcohol?");

        rdoBtnDaily.setText("Daily");
        rdoBtnDaily.setEnabled(false);
        rdoBtnDaily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBtnDailyActionPerformed(evt);
            }
        });

        rdoBtnWeekly.setText("Weekly");
        rdoBtnWeekly.setEnabled(false);

        rdoBtnOccasionally.setText("Occasionally");
        rdoBtnOccasionally.setEnabled(false);
        rdoBtnOccasionally.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBtnOccasionallyActionPerformed(evt);
            }
        });

        jLabel24.setText("Do you smoke?");

        rdoBtnSmokeYes.setText("Yes");
        rdoBtnSmokeYes.setEnabled(false);
        rdoBtnSmokeYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBtnSmokeYesActionPerformed(evt);
            }
        });

        rdoBtnSmokeNo.setSelected(true);
        rdoBtnSmokeNo.setText("No");
        rdoBtnSmokeNo.setEnabled(false);
        rdoBtnSmokeNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBtnSmokeNoActionPerformed(evt);
            }
        });

        jLabel25.setText("If Yes, How much:");

        txtSmokePacks.setEditable(false);

        jLabel26.setText("packs per day.");

        jLabel27.setText("Do you exercise regularly?");

        jLabel28.setText("How many times a week?");

        txtExerciseTimes.setEditable(false);

        lblExerciseType.setText("What type of exercise?");

        txtExerciseType.setEditable(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel30.setText("Family Medical History (If any to be shared)");

        txtAreaFamilyHistory.setEditable(false);
        txtAreaFamilyHistory.setColumns(20);
        txtAreaFamilyHistory.setRows(5);
        jScrollPane3.setViewportView(txtAreaFamilyHistory);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel31.setText("Allergies (If any):");

        lstAllergies.setEnabled(false);
        jScrollPane4.setViewportView(lstAllergies);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel32.setText("Dietary Preference:");

        rdoBtnStandard.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rdoBtnStandard.setSelected(true);
        rdoBtnStandard.setText("Standard");
        rdoBtnStandard.setEnabled(false);

        jLabel33.setText("Includes red meat, fish, poultry, eggs, milk & plant");

        rdoBtnPescetarian.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rdoBtnPescetarian.setText("Pescetarian");
        rdoBtnPescetarian.setEnabled(false);
        rdoBtnPescetarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBtnPescetarianActionPerformed(evt);
            }
        });

        jLabel34.setText("Includes fish, eggs, milk and plant products");

        jLabel35.setText("Excludes Red meat and poultry");

        rdoBtnVegetarian.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rdoBtnVegetarian.setText("Vegetarian");
        rdoBtnVegetarian.setEnabled(false);

        jLabel36.setText("Includes eggs, milk and plant products");

        jLabel37.setText("Excludes Red Meat, Fish and Poultry");

        rdoBtnLactoVegetarian.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rdoBtnLactoVegetarian.setText("Lacto-vegetarian");
        rdoBtnLactoVegetarian.setEnabled(false);
        rdoBtnLactoVegetarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBtnLactoVegetarianActionPerformed(evt);
            }
        });

        jLabel38.setText("Includes milk and plant products");

        jLabel39.setText("Excludes Red Meat, Fish, Eggs and Poultry");

        rdoBtnOvoVegetarian.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rdoBtnOvoVegetarian.setText("Ovo-vegetarian");
        rdoBtnOvoVegetarian.setEnabled(false);

        jLabel40.setText("Includes eggs and plant products");

        jLabel41.setText("Excludes Red Meat, Fish, Milk products and Poultry");

        rdoBtnVegan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rdoBtnVegan.setText("Vegan");
        rdoBtnVegan.setEnabled(false);
        rdoBtnVegan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBtnVeganActionPerformed(evt);
            }
        });

        jLabel42.setText("Includes plant based foods only");

        jLabel43.setText("Excludes animal food of any kind");

        lblGovtId.setText("Government ID:");

        txtGovtId.setEditable(false);

        lblError.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));

        rdoBtnNever.setSelected(true);
        rdoBtnNever.setText("Never");
        rdoBtnNever.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress)
                                    .addComponent(lblName))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmergencyName1)
                                    .addComponent(lblRelationship1)
                                    .addComponent(lblEmergencyPhone1))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmergencyPhone1)
                                    .addComponent(txtEmergencyRelationship1)
                                    .addComponent(txtEmergencyName1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblState)
                                    .addComponent(lblZip)
                                    .addComponent(lblTextNo)
                                    .addComponent(lblCity))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCellNo)
                                    .addComponent(txtZip)
                                    .addComponent(cboState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDOB)
                                    .addComponent(lblSex)
                                    .addComponent(lblEmail))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboSex, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(txtEmail)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblGovtId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGovtId))
                            .addComponent(jLabel15)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(157, 157, 157))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmergencyRelationship2)
                                    .addComponent(txtEmergencyPhone2)
                                    .addComponent(txtEmergencyName2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(29, 29, 29)
                                        .addComponent(rdoBtnYes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdoBtnNo)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNoOfCups, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel27)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rdoBtnSmokeYes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdoBtnSmokeNo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtSmokePacks))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rdoBtnDaily)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdoBtnWeekly)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rdoBtnOccasionally)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(rdoBtnNever))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator6))
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(lblExerciseType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtExerciseType)
                                    .addComponent(txtExerciseTimes))
                                .addGap(650, 650, 650))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addComponent(rdoBtnStandard)
                                            .addComponent(rdoBtnPescetarian)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel35)
                                            .addComponent(rdoBtnVegetarian)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel37)
                                            .addComponent(rdoBtnLactoVegetarian)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel39)
                                            .addComponent(rdoBtnOvoVegetarian)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel41)
                                            .addComponent(rdoBtnVegan)
                                            .addComponent(jLabel42)
                                            .addComponent(jLabel43))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator5)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblError)
                            .addComponent(lblFormTitle))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblState)
                            .addComponent(cboState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblZip))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtZip, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextNo)
                            .addComponent(txtCellNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDOB)
                            .addComponent(dateDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSex)
                            .addComponent(cboSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGovtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGovtId))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmergencyName1)
                            .addComponent(txtEmergencyName1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRelationship1)
                            .addComponent(txtEmergencyRelationship1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmergencyPhone1)
                            .addComponent(txtEmergencyPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtEmergencyName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtEmergencyRelationship2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtEmergencyPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(169, 169, 169))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(rdoBtnYes)
                                    .addComponent(rdoBtnNo)
                                    .addComponent(jLabel18)
                                    .addComponent(txtNoOfCups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(rdoBtnDaily)
                                    .addComponent(rdoBtnWeekly)
                                    .addComponent(rdoBtnOccasionally)
                                    .addComponent(rdoBtnNever))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(rdoBtnSmokeYes)
                                    .addComponent(rdoBtnSmokeNo)
                                    .addComponent(jLabel25)
                                    .addComponent(txtSmokePacks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(txtExerciseTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblExerciseType)
                                    .addComponent(txtExerciseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoBtnStandard)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdoBtnPescetarian)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoBtnVegetarian)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoBtnLactoVegetarian)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoBtnOvoVegetarian)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoBtnVegan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel43))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel31)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane4))
                                        .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError)
                .addContainerGap())
        );

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed

    }//GEN-LAST:event_txtNameKeyPressed

    private void txtEmergencyName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmergencyName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyName2ActionPerformed

    private void rdoBtnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBtnYesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rdoBtnYesActionPerformed

    private void rdoBtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBtnNoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rdoBtnNoActionPerformed

    private void rdoBtnDailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBtnDailyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoBtnDailyActionPerformed

    private void rdoBtnOccasionallyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBtnOccasionallyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoBtnOccasionallyActionPerformed

    private void rdoBtnSmokeYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBtnSmokeYesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rdoBtnSmokeYesActionPerformed

    private void rdoBtnSmokeNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBtnSmokeNoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rdoBtnSmokeNoActionPerformed

    private void rdoBtnPescetarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBtnPescetarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoBtnPescetarianActionPerformed

    private void rdoBtnLactoVegetarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBtnLactoVegetarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoBtnLactoVegetarianActionPerformed

    private void rdoBtnVeganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBtnVeganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoBtnVeganActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox cboSex;
    private javax.swing.JComboBox cboState;
    private datechooser.beans.DateChooserCombo dateDOB;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmergencyName1;
    private javax.swing.JLabel lblEmergencyPhone1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblExerciseType;
    private javax.swing.JLabel lblFormTitle;
    private javax.swing.JLabel lblGovtId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblRelationship1;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTextNo;
    private javax.swing.JLabel lblZip;
    private javax.swing.JList lstAllergies;
    private javax.swing.JList lstPatient;
    private javax.swing.JRadioButton rdoBtnDaily;
    private javax.swing.JRadioButton rdoBtnLactoVegetarian;
    private javax.swing.JRadioButton rdoBtnNever;
    private javax.swing.JRadioButton rdoBtnNo;
    private javax.swing.JRadioButton rdoBtnOccasionally;
    private javax.swing.JRadioButton rdoBtnOvoVegetarian;
    private javax.swing.JRadioButton rdoBtnPescetarian;
    private javax.swing.JRadioButton rdoBtnSmokeNo;
    private javax.swing.JRadioButton rdoBtnSmokeYes;
    private javax.swing.JRadioButton rdoBtnStandard;
    private javax.swing.JRadioButton rdoBtnVegan;
    private javax.swing.JRadioButton rdoBtnVegetarian;
    private javax.swing.JRadioButton rdoBtnWeekly;
    private javax.swing.JRadioButton rdoBtnYes;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextArea txtAreaFamilyHistory;
    private javax.swing.JTextField txtCellNo;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmergencyName1;
    private javax.swing.JTextField txtEmergencyName2;
    private javax.swing.JTextField txtEmergencyPhone1;
    private javax.swing.JTextField txtEmergencyPhone2;
    private javax.swing.JTextField txtEmergencyRelationship1;
    private javax.swing.JTextField txtEmergencyRelationship2;
    private javax.swing.JTextField txtExerciseTimes;
    private javax.swing.JTextField txtExerciseType;
    private javax.swing.JTextField txtGovtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNoOfCups;
    private javax.swing.JTextField txtSmokePacks;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}

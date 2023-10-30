/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.EmployerRole.JobWork;

import ui.*;
import Business.Business;
import Business.CourseWork.TechStack;
import Business.Employment.Job;
import Business.Profiles.EmployerProfile;
import UserInterface.WorkAreas.EmployerRole.EmployerWorkAreaJPanel;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class AddJobJPanel extends javax.swing.JPanel {
    Business business;
    JPanel CardSequencePanel;
    EmployerProfile employer;


    /**
     * Creates new form AddJobJPanel
     */
    public AddJobJPanel(Business bz, EmployerProfile p, JPanel jp) {
        this.business = bz;
        CardSequencePanel = jp;
        employer = p;
        initComponents();
        modifyComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblLastName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnAddJob = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProgrammingLanguages = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListFrameworks = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListTools = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        lblFirstName1 = new javax.swing.JLabel();

        lblLastName.setText("Description:");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblFirstName.setText("Title:");

        btnAddJob.setText("Add Course");
        btnAddJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJobActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Job Opening");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jLabel5.setText("Programming Langauages:");

        jListProgrammingLanguages.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListProgrammingLanguages);

        jListFrameworks.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListFrameworks);

        jLabel6.setText("Frameworks:");

        jListTools.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jListTools);

        jLabel7.setText("Tools:");

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        lblFirstName1.setText("Location:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(lblEmail)
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 233, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFirstName1)
                        .addGap(18, 18, 18)
                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane4)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(btnAddJob)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblLastName)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblFirstName)
                                    .addGap(30, 30, 30)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogOut)))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddJob)
                .addContainerGap(341, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void btnAddJobActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    // Get the values entered by the user
    String jobTitle = txtFirstName.getText();
    String jobDescription = jTextArea1.getText();
    String location = txtLocation.getText();

    
    // Collect selected programming languages from the JList
    List<String> selectedLanguages = jListProgrammingLanguages.getSelectedValuesList();
    
    // Collect selected frameworks from the JList
    List<String> selectedFrameworks = jListFrameworks.getSelectedValuesList();
    
    // Collect selected tools from the JList
    List<String> selectedTools = jListTools.getSelectedValuesList();
    
    // Create a TechStack object and set the selected lists
    TechStack techStack = new TechStack(selectedLanguages, selectedFrameworks, selectedTools);
    Job newJob = business.getJobCatalog().newJob(jobTitle, jobDescription, location);

    // Set the TechStack for the course
    newJob.setTechStack(techStack);
    

    // Add the new course to the course catalog
    employer.addJobOpening(newJob);
    
    // Notify the user that the course has been added
    JOptionPane.showMessageDialog(this, "Course has been added successfully!");

    // Clear the input fields
    txtFirstName.setText("");
    jTextArea1.setText("");
    txtLocation.setText("");
    jListProgrammingLanguages.clearSelection();
    jListFrameworks.clearSelection();
    jListTools.clearSelection();
    modifyComponents();
    }                                         

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        EmployerWorkAreaJPanel panel = new EmployerWorkAreaJPanel(business, employer, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("employer", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }                                       

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        LoginJPanel panel = new LoginJPanel(business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("LoginJPanel", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }                                         

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAddJob;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListFrameworks;
    private javax.swing.JList<String> jListProgrammingLanguages;
    private javax.swing.JList<String> jListTools;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLocation;
    // End of variables declaration                   

    private void modifyComponents() {
        populateTechStack();
        
    }
    
    public void populateTechStack() {
    // Create a list of programming languages
    List<String> programmingLanguages = Arrays.asList(
        "Java", "Python", "C++", "JavaScript", "Ruby", "Swift",
        "C#", "PHP", "Go", "Rust", "TypeScript", "Kotlin",
        "Perl", "Scala", "Haskell", "Objective-C", "Lua", "Dart",
        "SQL", "HTML"
    );
    // Create a DefaultListModel to store the programming languages
    DefaultListModel<String> listModelLanguages = new DefaultListModel<>();

    // Add each programming language to the list model
    for (String language : programmingLanguages) {
        listModelLanguages.addElement(language);
    }

    // Set the list model to the JList for programming languages
    jListProgrammingLanguages.setModel(listModelLanguages);

    // Create a list of frameworks
    List<String> frameworks = Arrays.asList(
        "Spring", "Hibernate", "React", "Angular", "Node.js", "Django",
        "Ruby on Rails", "Vue.js", "Laravel", "Express.js", "Flask", "Struts",
        "Ember.js", "Play Framework", "Meteor", "Symfony", "ASP.NET Core", "CakePHP",
        "MySQL", "MongoDB"
    );

    // Create a DefaultListModel to store the frameworks
    DefaultListModel<String> listModelFrameworks = new DefaultListModel<>();

    // Add each framework to the list model
    for (String framework : frameworks) {
        listModelFrameworks.addElement(framework);
    }

    // Set the list model to the JList for frameworks
    jListFrameworks.setModel(listModelFrameworks);

    // Create a list of tools
    List<String> tools = Arrays.asList(
        "Eclipse", "IntelliJ IDEA", "Git", "Visual Studio Code", "PyCharm", "Sublime Text",
        "NetBeans", "Android Studio", "Xcode", "Atom", "Notepad++", "Vim",
        "Eclipse", "Visual Studio", "CLion", "WebStorm", "Rider", "Code::Blocks",
        "SQL Server Management Studio"
    );
    // Create a DefaultListModel to store the tools
    DefaultListModel<String> listModelTools = new DefaultListModel<>();

    // Add each tool to the list model
    for (String tool : tools) {
        listModelTools.addElement(tool);
    }

    // Set the list model to the JList for tools
    jListTools.setModel(listModelTools);
}


    
}

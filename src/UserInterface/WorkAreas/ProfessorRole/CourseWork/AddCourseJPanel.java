/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.ProfessorRole.CourseWork;

import ui.*;
import Business.Business;
import Business.CourseWork.Course;
import Business.Person.Person;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.Profile;
import Business.Profiles.StudentProfile;
import Business.UserAccounts.UserAccount;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author tirdesh
 */
public class AddCourseJPanel extends javax.swing.JPanel {
    Business business;
    JPanel CardSequencePanel;
    ProfessorProfile professor;


    /**
     * Creates new form AddCourseJPanel
     */
    public AddCourseJPanel(Business bz, ProfessorProfile p, JPanel jp) {
        this.business = bz;
        CardSequencePanel = jp;
        professor = p;
        initComponents();
        modifyComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblLastName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        jRadioButtonStudent = new javax.swing.JRadioButton();
        jRadioButtonProfessor = new javax.swing.JRadioButton();
        btnAddCourse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLastName1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButtonProfessor1 = new javax.swing.JRadioButton();
        lblRole1 = new javax.swing.JLabel();
        jRadioButtonStudent1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        lblLastName.setText("Description:");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblFirstName.setText("Name:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblRole.setText("Teaching Type:");

        buttonGroup1.add(jRadioButtonStudent);
        jRadioButtonStudent.setText("Live");
        jRadioButtonStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonStudentActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonProfessor);
        jRadioButtonProfessor.setText("Recorded");

        btnAddCourse.setText("Add Course");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Course");

        lblLastName1.setText("No. Of Hours:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("PreRequisites:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup2.add(jRadioButtonProfessor1);
        jRadioButtonProfessor1.setText("On Demand");
        jRadioButtonProfessor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonProfessor1ActionPerformed(evt);
            }
        });

        lblRole1.setText("Offering Type:");

        buttonGroup2.add(jRadioButtonStudent1);
        jRadioButtonStudent1.setText("Academic Calendar");
        jRadioButtonStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonStudent1ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lblEmail)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRole)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonStudent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonProfessor))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLastName1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblLastName)
                                                .addComponent(lblFirstName))
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRole1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonStudent1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonProfessor1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(btnAddCourse)))
                .addContainerGap(199, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblLastName))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName1))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRole)
                        .addComponent(jRadioButtonStudent))
                    .addComponent(jRadioButtonProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRole1)
                        .addComponent(jRadioButtonStudent1))
                    .addComponent(jRadioButtonProfessor1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddCourse)
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jRadioButtonStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonStudentActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        // TODO add your handling code here:
    // Get the values entered by the user
    String courseName = txtFirstName.getText();
    String description = jTextArea1.getText();
    int courseHours = Integer.parseInt(txtEmail.getText());

    String sessionType = "";
    if (jRadioButtonStudent.isSelected()) {
        sessionType = "Live";
    } else if (jRadioButtonProfessor.isSelected()) {
        sessionType = "Recorded";
    }

    // Create a new Course object
    Course newCourse = business.getCourseCatalog().newCourse(courseName, description, new ArrayList<>(), courseHours);
    
    // Set the session type for the course
    newCourse.setSessionType(sessionType);
    
    // Check if it's an academic calendar-based course
    if (jRadioButtonStudent1.isSelected()) {
        String term = jTextField1.getText();
        int termYear = Integer.parseInt(jTextField2.getText());
        // Set course duration for academic calendar-based courses
        newCourse.setCourseDuration(term, termYear, business.getAcademicCalendar());
    } else if (jRadioButtonProfessor1.isSelected()) {
        // Parse the start and end date for on-demand courses
        LocalDate startDate = LocalDate.parse(jTextField1.getText());
        LocalDate endDate = LocalDate.parse(jTextField2.getText());
        // Set course duration for on-demand courses
        newCourse.setCourseDuration(startDate, endDate);
    }

    // Add the new course to the course catalog
    professor.addCourseToProfile(newCourse);
    
    // Notify the user that the course has been added
    JOptionPane.showMessageDialog(this, "Course has been added successfully!");

    // Clear the input fields
    txtFirstName.setText("");
    jTextArea1.setText("");
    txtEmail.setText("");
    buttonGroup1.clearSelection();
    buttonGroup2.clearSelection();
    jLabel3.setVisible(false);
    jLabel4.setVisible(false);
    jTextField1.setVisible(false);
    jTextField2.setVisible(false);

    // Repopulate the course ComboBox
    populateCourseComboBox();

        
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void jRadioButtonStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonStudent1ActionPerformed
        // TODO add your handling code here:
            jLabel3.setText("Term:");
            jLabel4.setText("Year:");
            jLabel3.setVisible(true);
            jTextField1.setVisible(true);
            jLabel4.setVisible(true);
            jTextField2.setVisible(true);
            jTextField1.setText("Fall");
            jTextField2.setText("2023");
            
    }//GEN-LAST:event_jRadioButtonStudent1ActionPerformed

    private void jRadioButtonProfessor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonProfessor1ActionPerformed
        // TODO add your handling code here:
            jLabel3.setText("Start Date:");
            jLabel4.setText("End Date:");
            jLabel3.setVisible(true);
            jTextField1.setVisible(true);
            jLabel4.setVisible(true);
            jTextField2.setVisible(true);
            jTextField1.setText("2023-12-31");
            jTextField2.setText("2024-03-31");
    }//GEN-LAST:event_jRadioButtonProfessor1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButtonProfessor;
    private javax.swing.JRadioButton jRadioButtonProfessor1;
    private javax.swing.JRadioButton jRadioButtonStudent;
    private javax.swing.JRadioButton jRadioButtonStudent1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastName1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblRole1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    // End of variables declaration//GEN-END:variables

    private void modifyComponents() {
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        populateCourseComboBox();

    }
    public void populateCourseComboBox() {
    // Clear the existing items in the JComboBox
    jComboBox1.removeAllItems();
    jComboBox1.addItem("None");

    // Get the list of courses from the CourseCatalog
    ArrayList<Course> courses = business.getCourseCatalog().getCourseList();

    // Populate the JComboBox with course names
    for (Course course : courses) {
        jComboBox1.addItem(course.getCourseName());
    }
}

}

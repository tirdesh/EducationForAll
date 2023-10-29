/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.EmployerRole.JobWork;

import ui.*;
import Business.Business;
import Business.CourseWork.Course;
import Business.CourseWork.TechStack;
import Business.Employment.Job;
import Business.Profiles.EmployerProfile;
import UserInterface.WorkAreas.EmployerRole.EmployerWorkAreaJPanel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author tirdesh
 */
public class LinkCourseAndJobJPanel extends javax.swing.JPanel {
    Business business;
    JPanel CardSequencePanel;
    EmployerProfile employer;


    /**
     * Creates new form AddJobJPanel
     */
    public LinkCourseAndJobJPanel(Business bz, EmployerProfile p, JPanel jp) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmail = new javax.swing.JLabel();
        btnLink = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListReleventCourses = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxSelectJob = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();

        btnLink.setText("Link");
        btnLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Link Course to Job");

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

        jLabel5.setText("Relevent courses:");

        jListReleventCourses.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListReleventCourses);

        jLabel10.setText("Select Job:");

        jComboBoxSelectJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSelectJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectJobActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Show Only Relevent Courses");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(lblEmail)
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 297, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLink)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSelectJob, javax.swing.GroupLayout.Alignment.LEADING, 0, 350, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogOut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSelectJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jCheckBox1))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnLink)
                .addContainerGap(534, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkActionPerformed
        // TODO add your handling code here:
        String selectedJobTitle = (String) jComboBoxSelectJob.getSelectedItem();

        if (selectedJobTitle != null && !"Select a Job".equals(selectedJobTitle)) {
            Job selectedJob = business.getJobCatalog().findJob(selectedJobTitle);

            if (selectedJob != null) {
            // Get the selected courses from the JList
            int[] selectedIndices = jListReleventCourses.getSelectedIndices();
            DefaultListModel<String> listModel = (DefaultListModel<String>) jListReleventCourses.getModel();
            
            if (selectedIndices.length > 0) {
                // Create a list of selected courses
                ArrayList<Course> selectedCourses = new ArrayList<>();
                for (int selectedIndex : selectedIndices) {
                    selectedCourses.add(business.getCourseCatalog().getCourseList().get(selectedIndex));
                }

                // Associate the selected courses with the job
                selectedJob.setRelevantCourses(selectedCourses);

                // Optionally, update the user interface or provide feedback
                // You can display a message or refresh the relevant courses display

                // Example: Show a confirmation message
                JOptionPane.showMessageDialog(this, "Courses linked successfully!");
            } 
            else {
                // If no courses are selected, you can provide an error message or handle it as needed.
                // Example: Show an error message
                JOptionPane.showMessageDialog(this, "Please select one or more courses to link.");
            }
        }
    }
    }//GEN-LAST:event_btnLinkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        EmployerWorkAreaJPanel panel = new EmployerWorkAreaJPanel(business, employer, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("employer", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LoginJPanel panel = new LoginJPanel(business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("LoginJPanel", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void jComboBoxSelectJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectJobActionPerformed
        // TODO add your handling code here:


        String selectedJobTitle = (String) jComboBoxSelectJob.getSelectedItem();

        if (selectedJobTitle != null && !"Select a Job".equals(selectedJobTitle)) {
            Job selectedJob = business.getJobCatalog().findJob(selectedJobTitle);
            if (selectedJob != null) {
                jLabel5.setVisible(true);
                jListReleventCourses.setVisible(true);
                jScrollPane2.setVisible(true);
                jCheckBox1.setVisible(true);
                btnLink.setVisible(true);
                ArrayList<Course> courses;
                if (jCheckBox1.isSelected()) {
                    // Get and populate relevant courses only
                     courses = getRelevantCoursesForJob(selectedJob);
                } else {
                    // Get and populate all courses
                    courses = business.getCourseCatalog().getCourseList();
                }
                populateCourses(courses, selectedJob);
            }
        }
        else{
            jLabel5.setVisible(false);
            jListReleventCourses.setVisible(false);
            jScrollPane2.setVisible(false);
            jCheckBox1.setVisible(false);
            btnLink.setVisible(false);
        }
    }//GEN-LAST:event_jComboBoxSelectJobActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Course> courses;
        String selectedJobTitle = (String) jComboBoxSelectJob.getSelectedItem();
        Job selectedJob = business.getJobCatalog().findJob(selectedJobTitle);
        if (jCheckBox1.isSelected()) {
            // Get and populate relevant courses only
            courses = getRelevantCoursesForJob(selectedJob);    
        } 
        else {
            // Get and populate all courses
            courses = business.getCourseCatalog().getCourseList();
        }
        populateCourses(courses, selectedJob);
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLink;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBoxSelectJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListReleventCourses;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmail;
    // End of variables declaration//GEN-END:variables

    private void modifyComponents() {
        populateJobComboBox();
    }

    public void populateJobComboBox() {
    // Clear the existing items in the JComboBox
    jComboBoxSelectJob.removeAllItems();  // Clear existing items
    jComboBoxSelectJob.addItem("Select a Job");
    
    // Get the list of courses from the CourseCatalog
    ArrayList<Job> jobs = employer.getJobOpenings();
    for (Job job : jobs) {
            jComboBoxSelectJob.addItem(job.getTitle());
        }
    }

    private void populateCourses(ArrayList<Course> courses, Job selectedJob) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Course course : courses) {
            listModel.addElement(course.getCourseName());
        }
        jListReleventCourses.setModel(listModel);
        
        selectRelevantCourses(selectedJob);

    }
    
    // This method should be called when you need to select relevant courses
    private void selectRelevantCourses(Job selectedJob) {
    ArrayList<Course> relevantCourses = selectedJob.getRelevantCourses();

    if (!relevantCourses.isEmpty()) {
        // Get the list model of the JList
        DefaultListModel<String> listModel = (DefaultListModel<String>) jListReleventCourses.getModel();
        
        // Clear any existing selections
        jListReleventCourses.clearSelection();

        // Select the relevant courses in the JList
        for (Course relevantCourse : relevantCourses) {
            int index = listModel.indexOf(relevantCourse.getCourseName());
                if (index != -1) {
                    jListReleventCourses.addSelectionInterval(index, index);
                }
            }
        }
    }

    private ArrayList<Course> getRelevantCoursesForJob(Job selectedJob) {
        ArrayList<Course> relevantCourses = new ArrayList<>();

        // Get the existing relevant courses from the selected job
        ArrayList<Course> existingRelevantCourses = selectedJob.getRelevantCourses();

        // Get the tech stack of the selected job
        TechStack jobTechStack = selectedJob.getTechStack();

        for (Course course : business.getCourseCatalog().getCourseList()) {
            TechStack courseTechStack = course.getTechStack();

            // Check if the course is already in the existing relevant courses
            if (existingRelevantCourses.contains(course)) {
                relevantCourses.add(course);
            } 
            else {
                // Check for partial matches in programming languages, frameworks, and tools
                boolean isPartiallyMatching = isPartialMatch(jobTechStack.getProgrammingLanguages(), courseTechStack.getProgrammingLanguages())
                        || isPartialMatch(jobTechStack.getFrameworks(), courseTechStack.getFrameworks())
                        || isPartialMatch(jobTechStack.getTools(), courseTechStack.getTools());

                if (isPartiallyMatching) {
                    relevantCourses.add(course);
                }
            }
        }

        return relevantCourses;
    }


    // Helper method to check for a partial match between two lists
    private boolean isPartialMatch(List<String> list1, List<String> list2) {
        for (String item1 : list1) {
            for (String item2 : list2) {
                if (item2.contains(item1) || item1.contains(item2)) {
                    return true;
                }
            }
        }
        return false;
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.EmployerRole.CourseRating;

import Business.Business;
import Business.CourseWork.Course;
import Business.Profiles.EmployerProfile;
import Business.Profiles.ProfessorProfile;
import UserInterface.WorkAreas.EmployerRole.EmployerWorkAreaJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.LoginJPanel;

/**
 *
 * @author abhisheksagar
 */
public class RateCourseJPanel extends javax.swing.JPanel {
     int userRating = 0;
     Business business;
    JPanel CardSequencePanel;
    EmployerProfile employer;
    /**
     * Creates new form RateCourseJPanel
     */
    public RateCourseJPanel(Business business, JPanel CardSequencePanel, EmployerProfile employer) {
        this.business=business;
        this.CardSequencePanel=CardSequencePanel;
        this.employer=employer;
        initComponents();
        jButton1.setText("★");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("★");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("★");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("★");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setText("★");
        jButton5.addActionListener(this::jButton5ActionPerformed);
        
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jLabel6.setVisible(false);
        jButton6.setVisible(false);
        populatetable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcourse = new javax.swing.JTable();
        btnLogOut = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tblcourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Course Discription", "Session Type", "Term", "Rating"
            }
        ));
        tblcourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcourse);

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel6)
                                .addGap(74, 74, 74)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addComponent(jButton6))
                        .addGap(0, 227, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogOut)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userRating=1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userRating=2;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userRating=3;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        userRating=4;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        userRating=5;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
//         ratingLabel.setText("You rated the course " + userRating + " stars.");
//         business.
Course co = null ;
         int selectedRowIndex=tblcourse.getSelectedRow();
         if (selectedRowIndex != -1) {
          DefaultTableModel model = (DefaultTableModel) tblcourse.getModel();
                int nameColumn = 0; // Adjust this column index based on your table
                String nameValue = model.getValueAt(selectedRowIndex, nameColumn).toString();
                // Now, iterate through the registered students of the selected course
//                for (Course p : business.getProfessorDirectory().getProfessorlist()) {
//                    if (Integer.parseInt(IDValue) == p.getPerson().getPersonId()) {
//                        pro=p;
//                        break;
//                    }
//                }
                co=business.getCourseCatalog().findCourse(nameValue);
                System.out.println(co.getRatingSystem().getAverageEmployerRating());
                EmployerProfile employerProfile=(EmployerProfile) business.getUserAccountDirectory().getActualuser().getAssociatedPersonProfile();
         co.getRatingSystem().addRating(userRating,employerProfile);
             System.out.println(co.getRatingSystem().getAverageEmployerRating());
         populatetable();
         JOptionPane.showMessageDialog(this, "Rating Submited successfully");
         }
         else{
             JOptionPane.showMessageDialog(this, "Please select the row");
         }
         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tblcourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcourseMouseClicked
        // TODO add your handling code here:
         int selectedRowIndex=tblcourse.getSelectedRow();
         DefaultTableModel model= (DefaultTableModel) tblcourse.getModel();
//        System.out.println(model.getValueAt(ERROR, WIDTH));
//        int a= model.getValueAt(selectedRowIndex,0);
        String selectedVitals=  model.getValueAt(selectedRowIndex,0).toString();
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jLabel6.setVisible(true);
        jButton6.setVisible(true);
        jLabel6.setText("Give your Rating for "+selectedVitals);
   
    }//GEN-LAST:event_tblcourseMouseClicked

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LoginJPanel panel = new LoginJPanel(business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("LoginJPanel", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        EmployerWorkAreaJPanel panel = new EmployerWorkAreaJPanel(business, employer, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("employer", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcourse;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
    DefaultTableModel model = (DefaultTableModel) tblcourse.getModel();
        
    model.setRowCount(0); 
    
     for(Course c :business.getCourseCatalog().getCourseList()){
//             String temp = null;
             Object[] row =new Object[6];
             row[0]=c.getCourseName();
             row[1]=c.getDescription();
             row[2]=c.getSessionType();
//             row[2]=u.getPrerequisites();
//             row[3]=u.getCourseHours();
//             row[3]=c.ge().getPerson().getFirst_name();
//             for(Course c: u.getCourseList()){
//                 temp=c.getCourseName()+",";
//             }
             row[3]=c.getTerm();
             row[4]=c.getRatingSystem().getAverageEmployerRating();
             model.addRow(row);
    }
    }
}

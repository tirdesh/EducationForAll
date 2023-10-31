/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole.CourseRating;

import UserInterface.WorkAreas.EmployerRole.CourseRating.*;
import Business.Business;
import Business.CourseWork.Course;
import Business.Profiles.EmployerProfile;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.StudentProfile;
import UserInterface.WorkAreas.EmployerRole.EmployerWorkAreaJPanel;
import UserInterface.WorkAreas.ProfessorRole.ProfessorWorkAreaJPanel;
import UserInterface.WorkAreas.StudentRole.StudentWorkAreaJPanel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.LoginJPanel;

/**
 *
 * @author abhisheksagar
 */
public class StuRateProfessorJPanel extends javax.swing.JPanel {
     int userRating = 0;
     Business business;
    JPanel CardSequencePanel;
    StudentProfile sp;
    /**
     * Creates new form RateCourseJPanel
     */
    public StuRateProfessorJPanel(Business business, JPanel CardSequencePanel, StudentProfile sp) {
        this.business=business;
        this.CardSequencePanel=CardSequencePanel;
        this.sp=sp;
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
        tblprofessor = new javax.swing.JTable();
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

        tblprofessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name", "Email Id", "Coures", "Emp Rating"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblprofessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblprofessorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblprofessor);

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
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(74, 74, 74)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton6)
                .addGap(46, 46, 46)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut)
                .addGap(112, 112, 112))
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
ProfessorProfile pro = null ;
         int selectedRowIndex=tblprofessor.getSelectedRow();
         if (selectedRowIndex != -1) {
          DefaultTableModel model = (DefaultTableModel) tblprofessor.getModel();
                int IDColumn = 0; // Adjust this column index based on your table
                String IDValue = model.getValueAt(selectedRowIndex, IDColumn).toString();
                // Now, iterate through the registered students of the selected course
                for (ProfessorProfile p : business.getProfessorDirectory().getProfessorlist()) {
                    if (Integer.parseInt(IDValue) == p.getPerson().getPersonId()) {
                        pro=p;
                        break;
                    }
                }
                System.out.println(pro.getRatingSystem().getAverageStudentRating());
                StudentProfile spp=(StudentProfile) business.getUserAccountDirectory().getActualuser().getAssociatedPersonProfile();
         pro.getRatingSystem().addRating(userRating,spp);
             System.out.println(pro.getRatingSystem().getAverageStudentRating());
         populatetable();
         JOptionPane.showMessageDialog(this, "Rating Submited successfully");
         }
         else{
             JOptionPane.showMessageDialog(this, "Please select the row");
         }
         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LoginJPanel panel = new LoginJPanel(business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("LoginJPanel", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void tblprofessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblprofessorMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex=tblprofessor.getSelectedRow();
         DefaultTableModel model= (DefaultTableModel) tblprofessor.getModel();
//        System.out.println(model.getValueAt(ERROR, WIDTH));
        int a=(int) model.getValueAt(selectedRowIndex,0);
        ProfessorProfile selectedVitals=  business.getProfessorDirectory().findProfessor(a);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jLabel6.setVisible(true);
        jButton6.setVisible(true);
        jLabel6.setText("Give your Rating for"+selectedVitals.getPerson().getFirst_name()+selectedVitals.getPerson().getLast_name());
    }//GEN-LAST:event_tblprofessorMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        StudentWorkAreaJPanel panel = new StudentWorkAreaJPanel(business, sp, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("sp", panel);
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
    private javax.swing.JTable tblprofessor;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
//
     DefaultTableModel model = (DefaultTableModel) tblprofessor.getModel();
        
         model.setRowCount(0);
//         ArrayList<ProfessorProfile> s= new ArrayList<ProfessorProfile>();
//         for(Profe u:cc.getCourseList()){
//             if(spp.getCourseList().contains(u)){
//                 
//             }
//             else{
//                 s.add(u);
//             }
//         }
         for(ProfessorProfile u :business.getProfessorDirectory().getProfessorlist()){
             String temp = null;
             Object[] row =new Object[6];
             row[0]=u.getPerson().getPersonId();
             row[1]=u.getPerson().getFirst_name();
             row[2]=u.getPerson().getLast_name();
//             row[2]=u.getPrerequisites();
//             row[3]=u.getCourseHours();
             row[3]=u.getPerson().getEmail();
             for(Course c: u.getCourseList()){
                 temp=c.getCourseName()+",";
             }
             row[4]=temp;
             row[5]=u.getRatingSystem().getAverageStudentRating();
             model.addRow(row);
    }
}
}
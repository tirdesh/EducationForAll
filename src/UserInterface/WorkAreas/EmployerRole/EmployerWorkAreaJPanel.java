/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.WorkAreas.EmployerRole;

import Business.Business;
import Business.Profiles.EmployerProfile;
import UserInterface.WorkAreas.EmployerRole.CourseRating.RateCourseJPanel;
import UserInterface.WorkAreas.EmployerRole.CourseRating.RateProfessorJPanel;
import UserInterface.WorkAreas.EmployerRole.JobWork.AddJobJPanel;
import UserInterface.WorkAreas.EmployerRole.JobWork.LinkCourseAndJobJPanel;
import javax.swing.JPanel;
import ui.LoginJPanel;
import ui.ManageProfileJPanel;

public class EmployerWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    EmployerProfile employer;

    /**
     * Creates new form UnitRiskWorkArea
     * @param b
     * @param spp
     * @param clp
     */

    public EmployerWorkAreaJPanel(Business b, EmployerProfile spp, JPanel clp) {

        business = b;
        this.CardSequencePanel = clp;
        employer = spp;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMyProfile = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnAddJob = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLinkCourseAndJob = new javax.swing.JButton();
        btnRateCourse = new javax.swing.JButton();
        btnRateProfessor = new javax.swing.JButton();

        setForeground(new java.awt.Color(51, 51, 51));

        btnMyProfile.setBackground(new java.awt.Color(102, 153, 255));
        btnMyProfile.setFont(getFont());
        btnMyProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnMyProfile.setText("My Profile");
        btnMyProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMyProfile.setMaximumSize(new java.awt.Dimension(200, 40));
        btnMyProfile.setMinimumSize(new java.awt.Dimension(20, 23));
        btnMyProfile.setPreferredSize(new java.awt.Dimension(240, 30));
        btnMyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyProfileIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 153, 255));
        jButton10.setFont(getFont());
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Log Out");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton10.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton10.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        btnAddJob.setBackground(new java.awt.Color(102, 153, 255));
        btnAddJob.setFont(getFont());
        btnAddJob.setForeground(new java.awt.Color(255, 255, 255));
        btnAddJob.setText("Add Job");
        btnAddJob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddJob.setMaximumSize(new java.awt.Dimension(200, 40));
        btnAddJob.setMinimumSize(new java.awt.Dimension(20, 20));
        btnAddJob.setPreferredSize(new java.awt.Dimension(240, 25));
        btnAddJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJobActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");

        btnLinkCourseAndJob.setBackground(new java.awt.Color(102, 153, 255));
        btnLinkCourseAndJob.setFont(getFont());
        btnLinkCourseAndJob.setForeground(new java.awt.Color(255, 255, 255));
        btnLinkCourseAndJob.setText("Link Course and Job");
        btnLinkCourseAndJob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLinkCourseAndJob.setMaximumSize(new java.awt.Dimension(200, 40));
        btnLinkCourseAndJob.setMinimumSize(new java.awt.Dimension(20, 20));
        btnLinkCourseAndJob.setPreferredSize(new java.awt.Dimension(240, 25));
        btnLinkCourseAndJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkCourseAndJobActionPerformed(evt);
            }
        });

        btnRateCourse.setBackground(new java.awt.Color(102, 153, 255));
        btnRateCourse.setFont(getFont());
        btnRateCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnRateCourse.setText("Rate Course");
        btnRateCourse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRateCourse.setMaximumSize(new java.awt.Dimension(200, 40));
        btnRateCourse.setMinimumSize(new java.awt.Dimension(20, 20));
        btnRateCourse.setPreferredSize(new java.awt.Dimension(240, 25));
        btnRateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateCourseActionPerformed(evt);
            }
        });

        btnRateProfessor.setBackground(new java.awt.Color(102, 153, 255));
        btnRateProfessor.setFont(getFont());
        btnRateProfessor.setForeground(new java.awt.Color(255, 255, 255));
        btnRateProfessor.setText("Rate Professor");
        btnRateProfessor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRateProfessor.setMaximumSize(new java.awt.Dimension(200, 40));
        btnRateProfessor.setMinimumSize(new java.awt.Dimension(20, 20));
        btnRateProfessor.setPreferredSize(new java.awt.Dimension(240, 25));
        btnRateProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnRateProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(117, 117, 117)
                            .addComponent(btnRateCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(117, 117, 117)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAddJob, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addComponent(btnLinkCourseAndJob, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))))
                .addContainerGap(590, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddJob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRateProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLinkCourseAndJob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMyProfileIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyProfileIdentifyResourceAssetsActionPerformed
        
    // TODO add your handling code here:
        ManageProfileJPanel panel = new ManageProfileJPanel(business, CardSequencePanel,employer);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ManageProfileJPanel", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnMyProfileIdentifyResourceAssetsActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        LoginJPanel panel = new LoginJPanel(business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("LoginJPanel", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnAddJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJobActionPerformed
        // TODO add your handling code here:
        AddJobJPanel panel = new AddJobJPanel(business, employer, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("AddJobJPanel", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

}//GEN-LAST:event_btnAddJobActionPerformed

    private void btnLinkCourseAndJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkCourseAndJobActionPerformed
        // TODO add your handling code here:
        LinkCourseAndJobJPanel panel = new LinkCourseAndJobJPanel(business, employer, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("LinkCourseAndJobJPanel", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnLinkCourseAndJobActionPerformed

    private void btnRateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateCourseActionPerformed
        // TODO add your handling code here:
        RateCourseJPanel panel = new RateCourseJPanel(business,CardSequencePanel, employer );
        CardSequencePanel.removeAll();
        CardSequencePanel.add("RateCourseJPanel", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnRateCourseActionPerformed

    private void btnRateProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateProfessorActionPerformed
        // TODO add your handling code here:
        RateProfessorJPanel panel = new RateProfessorJPanel(business,CardSequencePanel,employer);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("RateProfessorJPanel", panel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnRateProfessorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddJob;
    private javax.swing.JButton btnLinkCourseAndJob;
    private javax.swing.JButton btnMyProfile;
    private javax.swing.JButton btnRateCourse;
    private javax.swing.JButton btnRateProfessor;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}

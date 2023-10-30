/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole.CourseRegistration;

import Business.Business;
import Business.CourseWork.Course;
import Business.Profiles.StudentProfile;
import UserInterface.WorkAreas.StudentRole.StudentWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import ui.LoginJPanel;

/**
 *
 * @author abhisheksagar
 */
public class StudentCourseworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentCourseworkJPanel
     */
    Business business;
    JPanel CardSequencePanel;
    StudentProfile spp;
    public StudentCourseworkJPanel(Business business, JPanel CardSequencePanel, StudentProfile spp) {
        initComponents();
        this.CardSequencePanel=CardSequencePanel;
        this.business=business;
        this.spp=spp;
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblcourse = new javax.swing.JTable();
        btnLogOut = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnderole = new javax.swing.JButton();

        tblcourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Course Discription", "Term Based", "Duration", "Session Type", "Professor Rating"
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

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnderole.setText("Derole");
        btnderole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnderoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnsearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(btnderole)))
                .addGap(552, 552, 552))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addGap(523, 523, 523)
                .addComponent(btnderole)
                .addGap(241, 241, 241))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(286, 286, 286)
                    .addComponent(jScrollPane1)
                    .addGap(287, 287, 287)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void tblcourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcourseMouseClicked
        // TODO add your handling code here:
//        if(evt.getClickCount()==1){
//            int row=tblregister.getSelectedRow();
//            int col=tblregister.getSelectedColumn();
//            if(col==6){
//                exefunction(row);
//            }
//            if(col==7){
//                viewfunction(row);
//            }
        
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
        //        if(actualuser.getRole().equals("Student")){
            StudentWorkAreaJPanel studentWorkAreaJPanel = new StudentWorkAreaJPanel(business, spp, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("spp", studentWorkAreaJPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
            //    }
        //        else{
            //            ProfessorWorkAreaJPanel professorWorkAreaJPanel = new ProfessorWorkAreaJPanel(business, pp, CardSequencePanel);
            //            CardSequencePanel.removeAll();
            //            CardSequencePanel.add("pp", professorWorkAreaJPanel);
            //            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
            //        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        TableRowSorter<TableModel> rowSorter= new TableRowSorter<>(tblcourse.getModel());
        tblcourse.setRowSorter(rowSorter);
        String text = txtsearch.getText();
        if (text.length() == 0) {
            rowSorter.setRowFilter(null);
        } else {

            rowSorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnderoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnderoleActionPerformed
        // TODO add your handling code here:
         int SelectedRow=tblcourse.getSelectedRow();
        if(SelectedRow>=0){
           int dialogButton=JOptionPane.YES_NO_OPTION;
           int dialogResult=JOptionPane.showConfirmDialog(null, "Would you like to deregister the Course?", "Warning", dialogButton);
           if(dialogResult==JOptionPane.YES_OPTION){
               Course course=business.getCourseCatalog().findCourse(tblcourse.getValueAt(SelectedRow, 0).toString());
               spp.removeCourseFromProfile(course);
               populatetable();
           }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from table first!","Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnderoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnderole;
    private javax.swing.JButton btnsearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcourse;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        DefaultTableModel model = (DefaultTableModel) tblcourse.getModel();
        
         model.setRowCount(0);
         
         for(Course u : spp.getCourseList()){
             Object[] row =new Object[6];
             row[0]=u.getCourseName();
             row[1]=u.getDescription();
//             row[2]=u.getPrerequisites();
//             row[3]=u.getCourseHours();
             row[2]=u.isTermBased()?u.getTerm()+ " "+u.getTermYear():"On Demand";
             row[3]="Start Date:"+u.getStartDate()+" End Date:"+u.getEndDate();
             row[4]=u.getSessionType();
             row[5]=u.getRatingSystem().getOverallAverageRating();
             model.addRow(row);
    }

}
}


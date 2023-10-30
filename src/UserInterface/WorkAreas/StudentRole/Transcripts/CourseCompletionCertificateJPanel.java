/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole.Transcripts;

import javax.swing.JPanel;

/**
 *
 * @author abhisheksagar
 */
public class CourseCompletionCertificateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseCompletionCertificateJPanel
     */
    String name;
    String coursename;
    JPanel CardSequencePanel;
    public CourseCompletionCertificateJPanel(JPanel CardSequencePanel, String name, String coursename) {
        initComponents();
        this.CardSequencePanel=CardSequencePanel;
        this.name=name;
        this.coursename=coursename;
        
        lblcoursename.setText(coursename);
        lblname.setText(name);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblsen = new javax.swing.JLabel();
        lblcoursename = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 50));

        lbltitle.setFont(new java.awt.Font("Mshtakan", 3, 48)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Certificate of Completion");

        lblname.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        lblname.setText("Name");

        lblsen.setFont(new java.awt.Font("Mshtakan", 0, 24)); // NOI18N
        lblsen.setText("has successfully completed ");

        lblcoursename.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        lblcoursename.setText("Course Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsen)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcoursename, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lbltitle)
                .addGap(213, 213, 213)
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblsen)
                .addGap(48, 48, 48)
                .addComponent(lblcoursename, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblcoursename;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblsen;
    private javax.swing.JLabel lbltitle;
    // End of variables declaration//GEN-END:variables
}

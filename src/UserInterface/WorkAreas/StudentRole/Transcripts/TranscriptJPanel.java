/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole.Transcripts;

import Business.Business;
import Business.CourseWork.Course;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.StudentProfile;
import Business.UserAccounts.UserAccount;
import UserInterface.WorkAreas.StudentRole.StudentWorkAreaJPanel;
import java.util.ArrayList;
import java.util.stream.DoubleStream;
import javax.swing.JPanel;
import ui.LoginJPanel;

/**
 *
 * @author abhisheksagar
 */
public class TranscriptJPanel extends javax.swing.JPanel {
StudentProfile spp;
//    ProfessorProfile pp;
    Business business;
//    UserAccount actualuser;
    JPanel CardSequencePanel;
    ArrayList<Course> courses;
    int g;
    int index;
    /**
     * Creates new form TranscriptJPanel
     */
    public TranscriptJPanel(Business business, JPanel CardSequencePanel, StudentProfile spp) {
        initComponents();
        this.business=business;
        this.CardSequencePanel=CardSequencePanel;
        this.spp=spp;
        courses=spp.getCourseList();
 
        
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setValue(0);
        jProgressBar2.setStringPainted(true);
        jProgressBar2.setValue(0);
        jProgressBar3.setStringPainted(true);
        jProgressBar3.setValue(0);
        jProgressBar4.setStringPainted(true);
        jProgressBar4.setValue(0);
        jProgressBar5.setStringPainted(true);
        jProgressBar5.setValue(0);
        jProgressBar6.setStringPainted(true);
        jProgressBar6.setValue(0);
        jProgressBar7.setStringPainted(true);
        jProgressBar7.setValue(0);
        jProgressBar8.setStringPainted(true);
        jProgressBar8.setValue(0);
//        for(int i=1; i<9; i++){
//        String var="jProgressBar"+i;
//        var.setStringPainted(true);
//        var.setValue(0);
//        }
//        jProgressBar1.setValue(0);
        this.setVisible(true);
        
//        Thread t = new Thread(new Runnable(){
//            @Override
//            
//            public void run(){
//                int i = 0;
//               while(i<=g){
//                   if(index==1){
//                   jProgressBar1.setValue(i);
//                   }
//                   if(index==2){
//                   jProgressBar2.setValue(i);
//                   }
//                   if(index==3){
//                   jProgressBar3.setValue(i);
//                   }
//                   if(index==4){
//                   jProgressBar4.setValue(i);
//                   }
//                   if(index==5){
//                   jProgressBar5.setValue(i);
//                   }
//                   if(index==6){
//                   jProgressBar6.setValue(i);
//                   }
//                   if(index==7){
//                   jProgressBar7.setValue(i);
//                   }
//                   if(index==8){
//                   jProgressBar8.setValue(i);
//                   }
//                    i=i+5;
//                    try{
//                        Thread.sleep(100);
//                    }
//                    catch(Exception ex){
//                
//                    }
//               } 
//            }
//        });
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
            jButton7.setVisible(false);
            jButton8.setVisible(false);
        try{
        if(courses.get(0)!=null){
            lblcourse1.setText(courses.get(0).getCourseName());
//            index=1;
            int e;
            System.out.println(courses.get(0).getCourseprogress());
            if(courses.get(0).getCourseprogress().equals("Completed")){
                jButton1.setVisible(true);
            }
            switch (courses.get(0).getCourseprogress()) {
                
                case "In Progress":
                    e=50;
                    break;
                case "Completed":
                    e=100;
                    break;
                default:
                    e=25;
                    break;
            }
            Thread t = new Thread(new Runnable(){
            @Override
            
            public void run(){
                int i = 0;
               while(i<=e){
                 
                   jProgressBar1.setValue(i);
 
                    i=i+5;
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception ex){
                
                    }
               } 
            }
        });
            t.start();
        }
        
        }
        catch(Exception ex){
            lblcourse1.setVisible(false);
            jProgressBar1.setVisible(false);
            lblcourse2.setVisible(false);
            jProgressBar2.setVisible(false);
            lblcourse3.setVisible(false);
            jProgressBar3.setVisible(false);
            lblcourse4.setVisible(false);
            jProgressBar4.setVisible(false);
            lblcourse5.setVisible(false);
            jProgressBar5.setVisible(false);
            lblcourse6.setVisible(false);
            jProgressBar6.setVisible(false);
            lblcourse7.setVisible(false);
            jProgressBar7.setVisible(false);
            lblcourse8.setVisible(false);
            jProgressBar8.setVisible(false);
//            jButton1.setVisible(false);
//            jButton2.setVisible(false);
//            jButton3.setVisible(false);
//            jButton4.setVisible(false);
//            jButton5.setVisible(false);
//            jButton6.setVisible(false);
//            jButton7.setVisible(false);
//            jButton8.setVisible(false);
        }
        try{
//        t.start();
        if(courses.get(1)!=null){
            lblcourse2.setText(courses.get(1).getCourseName());
//            index=2;
            int f;
            System.out.println(courses.get(1).getCourseprogress());
            if(courses.get(1).getCourseprogress().equalsIgnoreCase("In Progress")){
                f=50;
            }
            else if(courses.get(1).getCourseprogress().equalsIgnoreCase("Completed")){
                f=100;
                jButton2.setVisible(true);

            }
            else{
                f=25;
            }
            Thread t = new Thread(new Runnable(){
            @Override
            
            public void run(){
                int i = 0;
               while(i<=f){
                 
                   jProgressBar2.setValue(i);
 
                    i=i+5;
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception ex){
                
                    }
               } 
            }
        });
            t.start();
        }
        else{
            lblcourse2.setVisible(false);
            jProgressBar2.setVisible(false);
        }
        }
        catch(Exception ex){
           
            lblcourse2.setVisible(false);
            jProgressBar2.setVisible(false);
            lblcourse3.setVisible(false);
            jProgressBar3.setVisible(false);
            lblcourse4.setVisible(false);
            jProgressBar4.setVisible(false);
            lblcourse5.setVisible(false);
            jProgressBar5.setVisible(false);
            lblcourse6.setVisible(false);
            jProgressBar6.setVisible(false);
            lblcourse7.setVisible(false);
            jProgressBar7.setVisible(false);
            lblcourse8.setVisible(false);
            jProgressBar8.setVisible(false);
        }
        try{
        if(courses.get(2)!=null){
            lblcourse3.setText(courses.get(2).getCourseName());
//            index=3;
            int h;
            
            System.out.println(courses.get(2).getCourseprogress());
            if(courses.get(2).getCourseprogress().equalsIgnoreCase("In Progress")){
                h=50;
            }
            else if(courses.get(2).getCourseprogress().equalsIgnoreCase("Completed")){
                h=100;
                jButton3.setVisible(true);
            }
            else{
                h=25;
            }
            Thread t = new Thread(new Runnable(){
            @Override
            
            public void run(){
                int i = 0;
               while(i<=h){
                 
                   jProgressBar3.setValue(i);
 
                    i=i+5;
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception ex){
                
                    }
               } 
            }
        });
            t.start();
        }
        }
        catch(Exception ex){
         
            lblcourse3.setVisible(false);
            jProgressBar3.setVisible(false);
            lblcourse4.setVisible(false);
            jProgressBar4.setVisible(false);
            lblcourse5.setVisible(false);
            jProgressBar5.setVisible(false);
            lblcourse6.setVisible(false);
            jProgressBar6.setVisible(false);
            lblcourse7.setVisible(false);
            jProgressBar7.setVisible(false);
            lblcourse8.setVisible(false);
            jProgressBar8.setVisible(false);
        }
        try{
        if(courses.get(3)!=null){
            lblcourse4.setText(courses.get(3).getCourseName());
//            index=4;
            int z;
            if(courses.get(3).getCourseprogress().equalsIgnoreCase("In Progress")){
                z=50;
            }
            else if(courses.get(3).getCourseprogress().equalsIgnoreCase("Completed")){
                z=100;
                jButton4.setVisible(true);
            }
            else{
                z=25;
            }
            Thread t = new Thread(new Runnable(){
            @Override
            
            public void run(){
                int i = 0;
               while(i<=z){
                 
                   jProgressBar4.setValue(i);
 
                    i=i+5;
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception ex){
                
                    }
               } 
            }
        });
            t.start();
        }
        }
        catch(Exception ex){
            
            lblcourse4.setVisible(false);
            jProgressBar4.setVisible(false);
            lblcourse5.setVisible(false);
            jProgressBar5.setVisible(false);
            lblcourse6.setVisible(false);
            jProgressBar6.setVisible(false);
            lblcourse7.setVisible(false);
            jProgressBar7.setVisible(false);
            lblcourse8.setVisible(false);
            jProgressBar8.setVisible(false);
        }
        try{
        if(courses.get(4)!=null){
            lblcourse5.setText(courses.get(4).getCourseName());
//            index=5;
            int d;
            if(courses.get(4).getCourseprogress().equalsIgnoreCase("In Progress")){
                d=50;
            }
            else if(courses.get(4).getCourseprogress().equalsIgnoreCase("Completed")){
                d=100;
                jButton5.setVisible(true);
            }
            else{
                d=25;
            }
            Thread t = new Thread(new Runnable(){
            @Override
            
            public void run(){
                int i = 0;
               while(i<=d){
                 
                   jProgressBar5.setValue(i);
 
                    i=i+5;
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception ex){
                
                    }
               } 
            }
        });
            t.start();
        }
        }
        catch(Exception ex){
            
            lblcourse5.setVisible(false);
            jProgressBar5.setVisible(false);
            lblcourse6.setVisible(false);
            jProgressBar6.setVisible(false);
            lblcourse7.setVisible(false);
            jProgressBar7.setVisible(false);
            lblcourse8.setVisible(false);
            jProgressBar8.setVisible(false);
        }
        try{

        if(courses.get(5)!=null){
            lblcourse6.setText(courses.get(5).getCourseName());
//            index=6;
           int c;
            if(courses.get(5).getCourseprogress().equalsIgnoreCase("In Progress")){
                c=50;
            }
            else if(courses.get(5).getCourseprogress().equalsIgnoreCase("Completed")){
                c=100;
                jButton6.setVisible(true);
            }
            else{
                c=25;
            }
             Thread t = new Thread(new Runnable(){
            @Override
            
            public void run(){
                int i = 0;
               while(i<=c){
                 
                   jProgressBar6.setValue(i);
 
                    i=i+5;
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception ex){
                
                    }
               } 
            }
        });
            t.start();
        }
        }
        catch(Exception ex){
            
            lblcourse6.setVisible(false);
            jProgressBar6.setVisible(false);
            lblcourse7.setVisible(false);
            jProgressBar7.setVisible(false);
            lblcourse8.setVisible(false);
            jProgressBar8.setVisible(false);
        }
        try{
        if(courses.get(6)!=null){
            lblcourse7.setText(courses.get(6).getCourseName());
//            index=7;
            int b;
            if(courses.get(6).getCourseprogress().equalsIgnoreCase("In Progress")){
                b=50;
            }
            else if(courses.get(6).getCourseprogress().equalsIgnoreCase("Completed")){
                b=100;
                jButton7.setVisible(true);
            }
            else{
                b=25;
            }
            Thread t = new Thread(new Runnable(){
            @Override
            
            public void run(){
                int i = 0;
               while(i<=b){
                 
                   jProgressBar7.setValue(i);
 
                    i=i+5;
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception ex){
                
                    }
               } 
            }
        });
            t.start();
        }
        }
        catch(Exception ex){
         
            lblcourse7.setVisible(false);
            jProgressBar7.setVisible(false);
            lblcourse8.setVisible(false);
            jProgressBar8.setVisible(false);
        }
        try{
        if(courses.get(7)!=null){
            lblcourse8.setText(courses.get(7).getCourseName());
//            index=8;
            int a;
            if(courses.get(7).getCourseprogress().equalsIgnoreCase("In Progress")){
                a=50;
            }
            else if(courses.get(7).getCourseprogress().equalsIgnoreCase("Completed")){
                a=100;
                jButton8.setVisible(true);
            }
            else{
                a=25;
            }
            Thread t = new Thread(new Runnable(){
            @Override
            
            public void run(){
                int i = 0;
               while(i<=a){
                 
                   jProgressBar8.setValue(i);
 
                    i=i+5;
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception ex){
                
                    }
               } 
            }
        });
            t.start();
        }
        else{
            lblcourse8.setVisible(false);
            jProgressBar8.setVisible(false);
        }
        }
        catch(Exception ex){
            
            lblcourse8.setVisible(false);
            jProgressBar8.setVisible(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcourse1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnLogOut = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblcourse2 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        lblcourse3 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        lblcourse4 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        lblcourse5 = new javax.swing.JLabel();
        jProgressBar5 = new javax.swing.JProgressBar();
        lblcourse6 = new javax.swing.JLabel();
        jProgressBar6 = new javax.swing.JProgressBar();
        lblcourse7 = new javax.swing.JLabel();
        jProgressBar7 = new javax.swing.JProgressBar();
        lblcourse8 = new javax.swing.JLabel();
        jProgressBar8 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        lblcourse1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblcourse1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcourse1.setText("Course 1");

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(0, 255, 0));

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

        lblcourse2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblcourse2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcourse2.setText("Course 2");

        jProgressBar2.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(0, 255, 0));

        lblcourse3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblcourse3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcourse3.setText("Course 3");

        jProgressBar3.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jProgressBar3.setForeground(new java.awt.Color(0, 255, 0));

        lblcourse4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblcourse4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcourse4.setText("Course 4");

        jProgressBar4.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jProgressBar4.setForeground(new java.awt.Color(0, 255, 0));

        lblcourse5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblcourse5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcourse5.setText("Course 5");

        jProgressBar5.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jProgressBar5.setForeground(new java.awt.Color(0, 255, 0));

        lblcourse6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblcourse6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcourse6.setText("Course 6");

        jProgressBar6.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jProgressBar6.setForeground(new java.awt.Color(0, 255, 0));

        lblcourse7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblcourse7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcourse7.setText("Course 7");

        jProgressBar7.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jProgressBar7.setForeground(new java.awt.Color(0, 255, 0));

        lblcourse8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblcourse8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcourse8.setText("Course 8");

        jProgressBar8.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jProgressBar8.setForeground(new java.awt.Color(0, 255, 0));

        jButton1.setText("View Certificate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View Certificate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Certificate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("View Certificate");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("View Certificate");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("View Certificate");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("View Certificate");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("View Certificate");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblcourse6, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblcourse5, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                    .addComponent(lblcourse4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblcourse3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblcourse2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblcourse1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblcourse8, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(lblcourse7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcourse1)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcourse2)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcourse3)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcourse4)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcourse5)
                    .addComponent(jProgressBar5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcourse6)
                    .addComponent(jProgressBar6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcourse7)
                    .addComponent(jProgressBar7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcourse8)
                    .addComponent(jProgressBar8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut)
                .addContainerGap(357, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CourseCompletionCertificateJPanel cccpanel= new CourseCompletionCertificateJPanel(CardSequencePanel, spp.getPerson().getFirst_name()+spp.getPerson().getLast_name(),courses.get(0).getCourseName());
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CourseCompletionCertificateJPanel", cccpanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CourseCompletionCertificateJPanel cccpanel= new CourseCompletionCertificateJPanel(CardSequencePanel, spp.getPerson().getFirst_name()+spp.getPerson().getLast_name(),courses.get(1).getCourseName());
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CourseCompletionCertificateJPanel", cccpanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CourseCompletionCertificateJPanel cccpanel= new CourseCompletionCertificateJPanel(CardSequencePanel, spp.getPerson().getFirst_name()+spp.getPerson().getLast_name(),courses.get(2).getCourseName());
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CourseCompletionCertificateJPanel", cccpanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CourseCompletionCertificateJPanel cccpanel= new CourseCompletionCertificateJPanel(CardSequencePanel, spp.getPerson().getFirst_name()+spp.getPerson().getLast_name(),courses.get(3).getCourseName());
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CourseCompletionCertificateJPanel", cccpanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        CourseCompletionCertificateJPanel cccpanel= new CourseCompletionCertificateJPanel(CardSequencePanel, spp.getPerson().getFirst_name()+spp.getPerson().getLast_name(),courses.get(4).getCourseName());
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CourseCompletionCertificateJPanel", cccpanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        CourseCompletionCertificateJPanel cccpanel= new CourseCompletionCertificateJPanel(CardSequencePanel, spp.getPerson().getFirst_name()+spp.getPerson().getLast_name(),courses.get(5).getCourseName());
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CourseCompletionCertificateJPanel", cccpanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        CourseCompletionCertificateJPanel cccpanel= new CourseCompletionCertificateJPanel(CardSequencePanel, spp.getPerson().getFirst_name()+spp.getPerson().getLast_name(),courses.get(6).getCourseName());
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CourseCompletionCertificateJPanel", cccpanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        CourseCompletionCertificateJPanel cccpanel= new CourseCompletionCertificateJPanel(CardSequencePanel, spp.getPerson().getFirst_name()+spp.getPerson().getLast_name(),courses.get(7).getCourseName());
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CourseCompletionCertificateJPanel", cccpanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JLabel lblcourse1;
    private javax.swing.JLabel lblcourse2;
    private javax.swing.JLabel lblcourse3;
    private javax.swing.JLabel lblcourse4;
    private javax.swing.JLabel lblcourse5;
    private javax.swing.JLabel lblcourse6;
    private javax.swing.JLabel lblcourse7;
    private javax.swing.JLabel lblcourse8;
    // End of variables declaration//GEN-END:variables

//    private void iterate() {
//        
//        int i=0;
//        while(i<=100){
//            jProgressBar1.setValue(i);
//            i=i+5;
//            try{
//                Thread.sleep(100);
//            }
//            catch(Exception ex){
//                
//            }
//        }
//    }
}

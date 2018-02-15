/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.Toolkit;


/**
 *
 * @author Mohammad98.Sh
 */
public class JfEnd extends javax.swing.JFrame {

    /**
     * Creates new form JfRegistration
     */
    private JfQuiz jfq;
    private JfMain jfm;
    private JfRegistration jfr;
    public JfEnd(JfQuiz jfQuiz) {
                this.jfq = jfQuiz;
                
        initComponents();
        setIcon();
        setResizable(false);
        
        if(jfq.point>=70){
            jLabel4.setText("You Win " + jfq.name1 + " :)" );
        }else{
            jLabel4.setText("You Lose  " + jfq.name1 +" :(");
        }
        
        jLabel6.setText(jfq.point+"");
    } 
    private JfEnd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Know The Globe");
        setLocation(new java.awt.Point(500, 250));
        setPreferredSize(new java.awt.Dimension(323, 368));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        jLabel1.setText("☺ ♥");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 40, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jButton1.setText("Back to Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 140, 40));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel3.setText("Thank you for choosing this game to play");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/globeEnd.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 160));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setText("You Win :)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Points :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//           if(jfm == null) {
//                jfm = new JfMain(this);
//            }
//            jfm.setVisible(true);
//            setVisible(false);    
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("globeImage.png")));
    }
}

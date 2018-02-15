/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Mohammad98.Sh
 */


public class JfQuiz extends javax.swing.JFrame {
    
    private boolean validateOption(){          //validates for all jrbs to be Full
         if(jrb1.getText().length()==0)
             return true;
         if(jrb2.getText().length()==0)
             return true;
         if(jrb3.getText().length()==0)
             return true;
         if(jrb4.getText().length()==0)
             return true;
         if(jrb5.getText().length()==0)
             return true;
         return false;
     }
    private boolean validateDuplicate(){            //validates duplicate elements
           if(jrb1.getText().equals(jrb2.getText())||jrb1.getText().equals(jrb3.getText())||jrb1.getText().equals(jrb4.getText())||jrb1.getText().equals(jrb5.getText())){
               return true;
           }
           if(jrb2.getText().equals(jrb3.getText())||jrb2.getText().equals(jrb4.getText())||jrb2.getText().equals(jrb5.getText())){
               return true;
           }
           if(jrb3.getText().equals(jrb4.getText())||jrb3.getText().equals(jrb5.getText())){
               return true;
           }
        if(jrb4.getText().equals(jrb5.getText())){
               return true;
        }
        return false;
    }
    private boolean validateRepetitive(){                       //validates Repititive questions (countries)
        if(dList.contains(jlblCountry.getText())){
        return true;
        }
        return false;
    }
     List dList=new ArrayList();                             // duplicate Country list
     int i=1;               //for Counter
     int rnd3=0;          //for Options
     int point ;         //for Calcuating Points
     String name1 ;       //for Holding name1 of player
    public void quiz(){
     try {
         rbItem[0]=jrb1;
         rbItem[1]=jrb2;
         rbItem[2]=jrb3;
         rbItem[3]=jrb4;
         rbItem[4]=jrb5;
         
         // **Capitals**
         Path dbCapitals =Paths.get("dbCapitals.txt");
         capitalLines = Files.readAllLines(dbCapitals);
         String[] capitalsArr = new String[capitalLines.size()];
         capitalsArr = capitalLines.toArray(capitalsArr);                 //Creating array of Capitals
         
         // **Countries**
         Path dbCountries =Paths.get("dbCountries.txt");
         countryLines = Files.readAllLines(dbCountries);
         String[] countriesArr = new String[countryLines.size()];
         countriesArr = countryLines.toArray(countriesArr);              //Creating array of Countries
         
         int rnd=10;            //for Capitals
         int rnd2=29;          //for Countries
             rnd3=0;          //for Options
        
        while(rnd!=rnd2 || validateOption() || validateDuplicate() || dList.contains(jlblCountry.getText()) ){               //همه ی گزینه ها پر می شوند
                rnd=(int) ((Math.random()*capitalsArr.length));                 //Both of the Arrays , have 30 elements
                rnd2=(int) ((Math.random()*countriesArr.length));
                rnd3=(int) (Math.random()*5);
                rbItem[rnd3].setText(capitalsArr[rnd]);                //Inseting RadioButton Option (Capitals) ☺*** Imp
                jlblCountry.setText(countriesArr[rnd]);                 //Inserting Label Item (Countries)
        }
                                                                            //همهیشه آخرین رادیو باتنی که پر میشود گزینه ی صحیح است که 
                                                                            //rbItem[rnd3] درواقع 
                                                                            // پاسخ است 
        dList.add(jlblCountry.getText());
     } catch (IOException ex) {
         Logger.getLogger(JfQuiz.class.getName()).log(Level.SEVERE, null, ex);
     }
    
    }
        
    /**
     * Creates new form JfRegistration
     */ 
 private JRadioButton[]  rbItem= new JRadioButton[5];
 private JfRegistration jfr;
 private List<String> capitalLines;
 private List<String> countryLines;
 private List helplist =new ArrayList();             // helps to not Create duplicate Question 
 
 
    private JfEnd jfe;
    public JfQuiz(JfRegistration jfr) {     
        //  Inserting elements if array from type of Radio Button
        this.jfr = jfr;
        initComponents();
        setIcon();
        setResizable(false);
        jLabel7.setText(jfr.name);
        name1 = jfr.name;
        quiz();
    }

    

    private JfQuiz() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jrb1 = new javax.swing.JRadioButton();
        jrb2 = new javax.swing.JRadioButton();
        jrb3 = new javax.swing.JRadioButton();
        jrb4 = new javax.swing.JRadioButton();
        jrb5 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblCountry = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTfPoint = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Know The Globe");
        setLocation(new java.awt.Point(500, 250));
        setPreferredSize(new java.awt.Dimension(323, 368));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jrb1);
        jrb1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jrb1.setName("jrb1"); // NOI18N
        jrb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jrb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        buttonGroup1.add(jrb2);
        jrb2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jrb2.setName("jrb2"); // NOI18N
        jrb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jrb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        buttonGroup1.add(jrb3);
        jrb3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jrb3.setName("jrb3"); // NOI18N
        jrb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jrb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        buttonGroup1.add(jrb4);
        jrb4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jrb4.setName("jrb4"); // NOI18N
        jrb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jrb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        buttonGroup1.add(jrb5);
        jrb5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jrb5.setName("jrb5"); // NOI18N
        jrb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jrb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 15)); // NOI18N
        jButton1.setText("Help me :)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 110, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("- Which is the Capital of");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 20, 20));

        jlblCountry.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblCountry.setText("jLabel4");
        getContentPane().add(jlblCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Next Without Choose");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, 30));

        jTfPoint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTfPoint.setEnabled(false);
        getContentPane().add(jTfPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 30, 30));

        jLabel4.setText("Points :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Save and Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, -1));

        jLabel6.setText("Player :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/flags.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        rbItem[rnd3].setText(rbItem[rnd3].getText()+"***");
        jButton1.setEnabled(false);
//                System.out.println(dList.get(i-1));
//                Path record =Paths.get("Record.txt");
//            try {
//                BufferedWriter bwrec=Files.newBufferedWriter(record, StandardOpenOption.APPEND);
////                lines = Files.readAllLines(record);
////                for(String line : lines){
////                if(line.startsWith("#"))
//                    bwrec.write(point);
////                }
//            } catch (IOException ex) {
//                Logger.getLogger(JfQuiz.class.getName()).log(Level.SEVERE, null, ex);
//            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jrb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb4ActionPerformed
            jButton2.setText("Next");
    }//GEN-LAST:event_jrb4ActionPerformed
    private List<String> lines;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        if(buttonGroup1.getSelection()==null){
           JOptionPane.showMessageDialog(null, "The answer was : " + rbItem[rnd3].getText(), "Result", JOptionPane.INFORMATION_MESSAGE); 
        }else{
                if(rbItem[rnd3].isSelected()){                               //for knowing correct answer
             point = point + 10;
             JOptionPane.showMessageDialog(null, "Correct ;) ", "Result", JOptionPane.INFORMATION_MESSAGE);
            }else{
              point = point - 5;
         JOptionPane.showMessageDialog(null, "InCorrect :( ", "Result", JOptionPane.OK_OPTION);
                }
        }
//        if(rbItem[rnd3].isSelected()){                               //for knowing correct answer
//         point = point + 10;
//         JOptionPane.showMessageDialog(null, "Correct ;) ", "Result", JOptionPane.INFORMATION_MESSAGE);
//        }else if(!jrb1.isSelected() || !jrb2.isSelected() ||!jrb3.isSelected() ||!jrb4.isSelected() ||!jrb5.isSelected() ){
//         JOptionPane.showMessageDialog(null, "The answer was : " + rbItem[rnd3].getText(), "Result", JOptionPane.INFORMATION_MESSAGE);
//        }
//        else {
//         point = point - 5;
//         JOptionPane.showMessageDialog(null, "InCorrect :( ", "Result", JOptionPane.OK_OPTION);
//        } 
        jTfPoint.setText(point+"");
        jButton1.setEnabled(true);
        quiz();
         i++;
      jLabel3.setText(i+"");
      buttonGroup1.clearSelection();
      System.out.println(point);
      jButton2.setText("Next Without Choose");
      if(i>10){                                 //End of Quiz ;-)
        Path record =Paths.get("Record.txt");
            try {
                BufferedWriter bwrec=Files.newBufferedWriter(record, StandardOpenOption.APPEND);
//                lines = Files.readAllLines(record);
//                for(String line : lines){
//                if(line.startsWith("#"))
                    bwrec.write(String.valueOf(point)+"\r\n");
                    bwrec.close();
//                }
            } catch (IOException ex) {
                Logger.getLogger(JfQuiz.class.getName()).log(Level.SEVERE, null, ex);
            }
      if(jfe == null) {
                jfe = new JfEnd(this);
            }
            jfe.setVisible(true);
            setVisible(false);
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Path record =Paths.get("Record.txt");
            try {
                BufferedWriter bwrec=Files.newBufferedWriter(record, StandardOpenOption.APPEND);
//                lines = Files.readAllLines(record);
//                for(String line : lines){
//                if(line.startsWith("#"))
                    bwrec.write(String.valueOf(point)+"\r\n");
                    bwrec.close();
//                }
            } catch (IOException ex) {
                Logger.getLogger(JfQuiz.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTfPoint;
    private javax.swing.JLabel jlblCountry;
    public javax.swing.JRadioButton jrb1;
    public javax.swing.JRadioButton jrb2;
    public javax.swing.JRadioButton jrb3;
    public javax.swing.JRadioButton jrb4;
    public javax.swing.JRadioButton jrb5;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("globeImage.png")));
    }
}

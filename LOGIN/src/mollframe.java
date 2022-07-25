
import java.awt.Color;
import javax.swing.JOptionPane;

public class mollframe extends javax.swing.JFrame {
     String element1;
     String element2;
     public static String mol1;
     public static String mol2;
     String bond;
     public static int score=0;
     
    public mollframe() {
 this. setSize(616,510);
        initComponents();
    }

   public void warning()
   {     
      
      boolean ch=check(element1,element2);//elements
      boolean c=check();                    //bond
      boolean ss=ChemicalComponents.check_quantities();        //quantity

      System.out.println("check_q is"+ss);
                
       if (c==true&&ch==true&&ss==true)
       { 
           this.setVisible(false);
           new casee().setVisible(true);
        }
       else //if ((/c==false||ch==false))
           //fat7a el mice w bardo enty msh 
       {
           this.setVisible(false); 
           new warning().setVisible(true);
       }
       
       
   }
     public mollframe( String e1,String e2) {
         element1=e1;
         element2=e2;
         initComponents();
        this. setSize(616,510);
         jLabel1.setText(e1);
         jLabel2.setText(e2);
    }
     boolean tst;
     
     //overloading
     
     //Check Bond
    public boolean check()
          
    { 
        tst =ChemicalComponents.getBonds().equals(bond);
        JOptionPane.showMessageDialog(this,tst);
       if(tst==true){
            score+=10;
        }
         return tst;
         
   }
     //Check Items
            public boolean check(String element1, String element2)          
    {
        /*
        boolean x;
        x=(element1.equals(ChemicalComponents.getP1()) && element2.equals(ChemicalComponents.getP2()))
                 || (element1.equals(ChemicalComponents.getP2()) && element2.equals(ChemicalComponents.getP1()));
        
        }*/
         return (element1.equals(ChemicalComponents.getP1()) && element2.equals(ChemicalComponents.getP2()))
                 || (element1.equals(ChemicalComponents.getP2()) && element2.equals(ChemicalComponents.getP1()));
         
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        select = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setSize(new java.awt.Dimension(850, 570));
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                formInputMethodTextChanged(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel1InputMethodTextChanged(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 90, 50);

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 90, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(100, 40, 130, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(100, 100, 130, 30);

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setText("Bond");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 150, 90, 50);

        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ionic bond", "1", "2", "3" }));
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        getContentPane().add(select);
        select.setBounds(10, 210, 160, 30);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton1.setText("next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 420, 170, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colorful-flat-chemistry-background_23-2148156516.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 620, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel1InputMethodTextChanged
     
    }//GEN-LAST:event_jLabel1InputMethodTextChanged

    private void formInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_formInputMethodTextChanged
    
    }//GEN-LAST:event_formInputMethodTextChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
     mol2=jComboBox2.getSelectedItem().toString();
        JOptionPane.showMessageDialog(this,mol2);
       // JOptionPane.showMessageDialog(this,ChemicalComponents.getM1() +"  &&  " +ChemicalComponents.getM2());
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     mol1=jComboBox1.getSelectedItem().toString();
    //mol2=jComboBox1.getSelectedItem().toString();
        JOptionPane.showMessageDialog(this,mol1);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
      bond=select.getSelectedItem().toString();
       JOptionPane.showMessageDialog(this,bond);
        
    }//GEN-LAST:event_selectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
//        if(check(element1,element2))
//        {      if (check_quantities())
//            {
//                  warning();
//            }
//        else{
//           JOptionPane.showMessageDialog(this," Re_enter Quantities");
//        }
//     }
////      
//check_quantities();
//System.out.println(check_quantities());
//         
warning();
     
//        }

    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(mollframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mollframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mollframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mollframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mollframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> select;
    // End of variables declaration//GEN-END:variables
}
 



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

     String name ;
     String result;
 
    public login() {
         initComponents();
         setSize(950,750);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(215, 214, 183));
        setFont(new java.awt.Font("Adobe Devanagari", 1, 24)); // NOI18N
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qq.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 220, 410, 90);

        jTextField1.setText("Name");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(630, 330, 250, 30);

        jButton1.setBackground(new java.awt.Color(233, 195, 85));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        jButton1.setText("start");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.white, new java.awt.Color(255, 204, 153), java.awt.Color.orange));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 320, 140, 50);

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(255, 204, 153), java.awt.Color.orange));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 530, 290, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nn.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, -100, 670, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-270, -20, 1230, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//       name=jTextField1.getText();
////           jLabel5.setBackground(Color.gray);
//        jLabel5.setVisible(true);
//        jTextField3.setVisible(true);
//        String to="Hi  "+name;
//         jTextField3.setText(to);
//          jTextField3.setBackground(Color.red);
//               jTextField3.enable(false);
//       jButton1.setText("oops"); 
        Reactions.StopWatch();  
      String filepath ="D:\\Projects\\OOP java\\LOGIN\\src\\MoodyLoop.wav";
      musictaff musicObject = new  musictaff();
       musicObject.PlayMusic(filepath);
       
       //JOptionPane.showMessageDialog(new Reactions()," you should made this Chemical compound"+result);
       
        this.setVisible(false);
         new Reactions().setVisible(true);
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);// exit 
    }//GEN-LAST:event_jButton2ActionPerformed
 private void jLabel5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
   // jLabel5.setVisible(false);
    }       
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}



class musictaff {

    void PlayMusic(String musiclocation){
        try{
         File musicpath = new File(musiclocation);   
         if( musicpath.exists()){
             AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicpath);
             Clip clip =AudioSystem.getClip();
             clip.open(audioInput);
             clip.start();
          // JOptionPane.showMessageDialog(null, "press off to stop playing");
         }
         else{
         System.out.println("Can not find file");
         }
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

//
//abstract class ChemicalComponents 
//{
//    //DataBase variables
//  private int m1,m2;
//  private String  Result,p1 ,p2,bonds;
//  
//  private String Randp1,Randp2;        //another false choices
//   
//  //GUI Input
//  private int mol1,mol2;
//  private String product1,product2,Chemicalbonds;
//  
//  //this function to set the right equation
//  public void SetInfo(String Result,String p1, String p2, int m1,int m2, String bonds)
//  {
//      this.Result=Result;
//      this.p1=p1;
//      this.p2=p2;
//      this.m1=m1;
//      this.m2=m2;
//      this.bonds=bonds;
//  }
//  
//  //This function to set the wrong choices
//  public void SetRandomChoice(String Randp1, String Randp2)
//  {
//      this.Randp1=Randp1;
//      this.Randp2=Randp2;
//  }
//  //This function Gets inforamation from the DataBase
//  public abstract void GetFromDB();
//  
//  //This function should be deleted
//  public void display()
//  {
//      System.out.println(Result);
//      System.out.println(m1);
//      System.out.println(p1);
//      System.out.println(m2);
//      System.out.println(p2);
//      System.out.println(bonds);
//      System.out.println(Randp1);
//      System.out.println(Randp2);
//  }
//}
// class Equation extends ChemicalComponents //Inheritance
//{
//    int rand1,rand2,rand3;   
//
//    public void setRandom(int rand1, int rand2,int rand3) {
//        this.rand1 = rand1;
//        this.rand2 = rand2;
//        this.rand3 = rand3;
//    }
//
//   
// 
//    @Override
//    public void GetFromDB()
//    {
//        
//                try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            try {
//                Connection con;
//                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata" , "root", "0000");
//               Choose(rand1,rand2,rand3);
//                PreparedStatement stmt=con.prepareStatement("SELECT Result,m1,p1,m2,p2,bonds FROM equations WHERE ID="+rand1);
//                ResultSet rs=stmt.executeQuery();
//                
//               while (rs.next())
//                {
//                   
//                    String result=rs.getString("Result");
//                     int m1=rs.getInt("m1");
//                    String p1=rs.getString("p1");
//                    
//                     int m2=rs.getInt("m2");
//                    String p2=rs.getString("p2");
//                    
//                    String bonds=rs.getString("bonds");
//                    
//                   SetInfo(result,p1,p2,m1,m2,bonds); 
//                }
//              stmt=con.prepareStatement("SELECT p1 FROM equations WHERE ID="+rand2);
//              rs=stmt.executeQuery();
//              rs.next();
//              String choice1=rs.getString("p1");
//              stmt=con.prepareStatement("SELECT p1 FROM equations WHERE ID="+rand3);
//              rs=stmt.executeQuery();
//              rs.next();
//              String choice2=rs.getString("p1");
//              SetRandomChoice(choice1,choice2);
//              
//            } catch (SQLException ex) {
//                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    
//    
//    
//       private static int getRandomNumberInRange(int min, int max)
//      {
//
//	if (min >= max) {
//		throw new IllegalArgumentException("max must be greater than min");
//	}
//
//	Random r = new Random();
//	return r.nextInt((max - min) + 1) + min;
//      }
//       //This function generates three different numbers to be able to have choices from differnt rows
//    public  void Choose(int n1,int n2, int n3)
//    {
//        
//    
//        //int n1,n2,n3;
//        while(true)
//        {
//            n1=getRandomNumberInRange(1,10);
//            n2=getRandomNumberInRange(1,10);
//            n3=getRandomNumberInRange(1,10);
//            if ((n1==n2 || n2==n3 || n1==n3)==false)
//                break;
//        }
//       setRandom(n1,n2,n3);
//    }
//}
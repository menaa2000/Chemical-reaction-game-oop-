
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Doha
 */

public class Equation extends ChemicalComponents //Inheritance
{
    int rand1,rand2,rand3;   

    public void setRandom(int rand1, int rand2,int rand3) {
        this.rand1 = rand1;
        this.rand2 = rand2;
        this.rand3 = rand3;
    }

   
 
    @Override
    public void GetFromDB()
    {
        
                try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata" , "root", "doha//2001");
               Choose(rand1,rand2,rand3);
                PreparedStatement stmt=con.prepareStatement("SELECT scientificName,m1,p1,m2,p2,bonds FROM equations WHERE ID="+rand1);
                ResultSet rs=stmt.executeQuery();
                
               while (rs.next())
                {
                   
                    String result=rs.getString("scientificName");
                     String m1=rs.getString("m1");
                    String p1=rs.getString("p1");
                    
                     String m2=rs.getString("m2");
                    String p2=rs.getString("p2");
                    
                    String bonds=rs.getString("bonds");
                    
                   SetInfo(result,p1,p2,m1,m2,bonds); 
                }
              stmt=con.prepareStatement("SELECT p1 FROM equations WHERE ID="+rand2);
              rs=stmt.executeQuery();
              rs.next();
              String choice1=rs.getString("p1");
              stmt=con.prepareStatement("SELECT p1 FROM equations WHERE ID="+rand3);
              rs=stmt.executeQuery();
              rs.next();
              String choice2=rs.getString("p1");
              SetRandomChoice(choice1,choice2);
              
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);   //login can be changed
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
       static int getRandomNumberInRange(int min, int max)
      {

	if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
	}

	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
      }
       //This function generates three different numbers to be able to have choices from differnt rows
    public  void Choose(int n1,int n2, int n3)
    {
        
    
        //int n1,n2,n3;
        while(true)
        {
            n1=getRandomNumberInRange(1,10);
            n2=getRandomNumberInRange(1,10);
            n3=getRandomNumberInRange(1,10);
            if ((n1==n2 || n2==n3 || n1==n3)==false)
                break;
        }
       setRandom(n1,n2,n3);
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Doha
 */
public abstract class ChemicalComponents {
  
    //DataBase variables
  private static String m1,m2;

    
  private  String  Result;
  private static  String p1 ,p2,bonds;
  private String Randp1,Randp2;        //another false choices
   
  
  //this function to set the right equation
  public void SetInfo(String Result,String p1, String p2, String m1,String m2, String bonds)
  {
      this.Result=Result;
      this.p1=p1;
      this.p2=p2;
      this.m1=m1;
      this.m2=m2;
      ChemicalComponents.bonds=bonds;
  }
  
  //This function to set the wrong choices
  public void SetRandomChoice(String Randp1, String Randp2)
  {
      this.Randp1=Randp1;
      this.Randp2=Randp2;
  }
  //This function Gets inforamation from the DataBase
  public abstract void GetFromDB();

    public String getResult() {
        return Result;
    }

    public static  String getBonds() {
        return bonds;
    }

    public static String getP1() {
        return p1;
    }

    public static String getP2() {
        return p2;
    }

    public String getRandp1() {
        return Randp1;
    }

    public String getRandp2() {
        return Randp2;
    }
//  public static String getM1() {
//        return m1;
//    }
//
//    public static String getM2() {
//        return m2;
//    }
    public static boolean check_quantities()
    {
        boolean y,z,m,n;
        
        System.out.println(m1);
        System.out.println(mollframe.mol1);
        System.out.println(m2);
        System.out.println(mollframe.mol2);
        y=m1.equals(mollframe.mol1);
        z=m2.equals(mollframe.mol2);
        m=m1.equals(mollframe.mol2);
        n=m2.equals(mollframe.mol1);
        if(y==true){
            mollframe.score+=10;
        }
      else
        {if(m==true){
            mollframe.score+=10;
        }
        }
        
           if(n==true){
            mollframe.score+=10;
           }
            else 
            { if(z==true){
            mollframe.score+=10;
        }}
//       y=(m1.equals(mollframe.mol1)&&m2.equals(mollframe.mol2))||(m1.equals(mollframe.mol2)&&m2.equals(mollframe.mol1));
//       if(y==true){
//           mollframe.score+=20; 
//       }
        
        return (m1.equals(mollframe.mol1)&&m2.equals(mollframe.mol2))||(m1.equals(mollframe.mol2)&&m2.equals(mollframe.mol1));
    }
    
    
} 

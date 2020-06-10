import javax.swing.JOptionPane;
import java.util.Scanner;
public class App
{

 public static void main ( String[]ar)
 {
  
  String input;
  int [] choice=new int [10];
  input=JOptionPane.showInputDialog("Hello\n1.Log In\n2.Sign Up");
  choice[0]=Integer.parseInt(input);
  if(choice[0]==1)
   {
    LogIn();
   }
     
  else if(choice[0]==2)
   {
     Log_In_Information();
     JOptionPane.showMessageDialog(null,"Congrats you have succusfully signed up\n Now please enter your email and password");
     LogIn();
     if(email.equalsIgnoreCase(information[2])&&password.equalsIgnoreCase(information[3]))
      {
       JOptionPane.showMessageDialog(null," Your In.");
      }
     if(!(email.equalsIgnoreCase( information[2])&&password.equalsIgnoreCase(information[3])))
      {
       JOptionPane.showMessageDialog(null," sorry your password or email is wrong.");
      }

      
      
   }
 }
 
 
 public static String Log_In_Information()
 {
  
  String input;
  String[] information=new String[10];
  information[0]=JOptionPane.showInputDialog("please enter your name");
  information[1]=JOptionPane.showInputDialog("please enter your age");
  information[2]=JOptionPane.showInputDialog("please enter an email address");
  information[3]=JOptionPane.showInputDialog("please enter a password");
  while(information[3].length()<8)
   {
    JOptionPane.showMessageDialog(null," Password must be more then 8 charcters");
    information[3]=JOptionPane.showInputDialog("please enter a password");

   }
  }
  
  
  
  public static void LogIn()
  {
  
      String email=JOptionPane.showInputDialog("Please enter your email");
      String password=JOptionPane.showInputDialog("Please enter your password");
     
   } 

}
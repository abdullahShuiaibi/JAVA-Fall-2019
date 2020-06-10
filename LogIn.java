import javax.swing.JOptionPane;


public class LogIn
{
  

 public void SetLogInEmail(String Information,String new_email)
  {
   
   if(!Information.equalsIgnoreCase(new_email))
     {
      JOptionPane.showMessageDialog(null,"Sorry Email does not match");
     }
    
   
  }
  
  
  
  
  public void SetLogInPassword(String Password,String new_Password)
  {
   
   if(!Password.equalsIgnoreCase(new_Password))
     {
      JOptionPane.showMessageDialog(null,"Sorry password does not match");
     }
    
   
  }

}
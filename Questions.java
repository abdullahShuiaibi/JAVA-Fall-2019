import javax.swing.JOptionPane;
public class Questions
 { 
  public static void main(String[]ar)
   {
    String choice;
    choice=JOptionPane.showInputDialog("are you taking csc210 next semster");
    if(choice.equalsIgnoreCase("yes")){
      JOptionPane.showMessageDialog(null,"good, make sure you sign up early");
      }
    else
      JOptionPane.showMessageDialog(null,"change your major");
      
     }
    }
    
    
    
import javax.swing.JOptionPane;

public class Miles_Perhour
 {
  public static void main(String[]arg)
  {
   int count=1;
   double hours,speed,total;
   String input,in;
   input=JOptionPane.showInputDialog("How many hours have you traveled.");
   hours=Double.parseDouble(input);
   in=JOptionPane.showInputDialog("What is your speed(Miles per hour).");
   speed=Double.parseDouble(in);
   
   if(speed>=1){
     while(count<=hours){
       total=count*speed;
       JOptionPane.showMessageDialog(null,"hour             Distance Traveled\n_____________________________\n"+count+"                               "+total);
       count++;
                        }
              }
       
       
       
       
    }
   }
   
   
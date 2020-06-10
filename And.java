import javax.swing.JOptionPane;
public class And
 {
  public static void main(String[]ar)
  {
   double x,y,z;
   String Input;
  
   Input=JOptionPane.showInputDialog("enter a number for x");
   x=Double.parseDouble(Input);
   Input=JOptionPane.showInputDialog(" enter a number for y");
   y=Double.parseDouble(Input);
   Input=JOptionPane.showInputDialog("enter a number for z");
   z=Double.parseDouble(Input);
   
   
   
   
   if(x>y&&x>z){
     JOptionPane.showMessageDialog(null,"x is the greatest");
      if(x==y){
        JOptionPane.showMessageDialog(null,"x and y are the same");}}
        
   else if(y>x&&y>z){
     JOptionPane.showMessageDialog(null,"y is the greatest");}
   
   else if(x==z){
      JOptionPane.showMessageDialog(null,"x and z are the same");
       JOptionPane.showMessageDialog(null,"z is the greatest");}
  

   
   
  
  }
 }


   
   
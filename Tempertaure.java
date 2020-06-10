import javax.swing.JOptionPane;

public class Tempertaure
{
 public static void main(String[]ar)
 {
  double  f;
  double  c;
  int count=0;
  String input;
   while(count<=20)
   {
    c=count;
    f=9/5*c+32;
    System.out.println(count+"). "+f+"f");
    count++;
   }
 
 }
}
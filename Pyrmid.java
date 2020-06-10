import javax.swing.JOptionPane;
import java.util.Scanner;
public class Pyrmid
{
 public static void main(String[]ar)
 {
  
   int scanner = nameScanner(5);
   JOptionPane.showMessageDialog(null,"your number is "+scanner);
   pyrmid(scanner);
 
 }
 
 
 
 
 
 
 public static int method(int x,int y)
 {


   int  sum=x+y;
   return sum;
 
 }
 public static void loop(int hey)
 {
   for(hey=1;hey<=5;hey++)
   {
   }
  
 }
 public static void pyrmid(int x)
 {
    for(int count=0;count<=x;count++)
    {
     for(int count1=count+1;count1<=x;count1++)
      {
        System.out.print(" ");
       }
       for(int count2=0;count2<=count-1;count2++)
        {
         System.out.print("* ");
        }
      
       System.out.println();
     }
  }
 public static int nameScanner(int x)
 {
   Scanner input = new Scanner(System.in);
   System.out.println(" Please enter a number");
   x=input.nextInt();
   return x;
 }


} 
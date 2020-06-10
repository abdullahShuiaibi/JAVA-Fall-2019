import java.util.Scanner;
public class LoopMethod
{
 public static void main(String[]ar)
 {
  Scanner input = new Scanner (System.in);
  int x;
  System.out.println(" Please pick a number to count to ");
  x=input.nextInt();
  Loop(x);
  }
   
   
   
 public static void Loop(int x)
 {
  int count=1;
  while(count<=x)
  {
   System.out.println("your counting is "+count);
   count++;
  }
 }
  
  
  
  
  
}
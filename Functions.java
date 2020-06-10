import java.util.Scanner;
public class Functions
{
 public static void main(String []ar)
 {
  System.out.println("hello java");
  int x;
  for(int i=1;i<=3;i++)
  {
   name();
   intgers();
  }

  System.out.println("last line");
  give();
 }
 
 
 
 
 public static void name()
 {
  Scanner input=new Scanner(System.in);
  String name;
  System.out.println("What is you name");
  name=input.nextLine();
  System.out.println("your name is name "+name);
 }
 
 
 
 
 public static void intgers()
 {
  int x;
  double y;

  Scanner input=new Scanner(System.in);
  System.out.println("what is x");
  x=input.nextInt();
  
  y=x*2;
  System.out.println("X doubled is "+y);
 }
 public static void give()
 {
  int y;
  Scanner input=new Scanner(System.in);
  System.out.println("please chose a number to square");
  int x=input.nextInt();
  y=x*x;
  System.out.println("the double is "+y);
 }
 
 
 
 
 
}
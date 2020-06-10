// write a java program to input an intger x.
// triple x and print the results
import java.util.Scanner;

public class Practics
{
 public static void main(String[]ar)
 {
 Scanner input = new Scanner (System.in);
 int x,y,sum,product,difference;
 System.out.println("please enter a number for x");
 x=input.nextInt();
 System.out.println("please enetr a number for y  ");
 y=input.nextInt();
 System.out.println("you've enterd "+x+" and "+y);
 sum=x+y;
 product=x*y;
 difference=x-y;

 System.out.println(sum);
 System.out.println( product);
 System.out.println(difference);
 if (x<21)
 System.out.println("You are under the driniking age of 21");
 
 
 
 
 
 
 }
}
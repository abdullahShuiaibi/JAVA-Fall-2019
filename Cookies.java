import java.util.Scanner;
public class Cookies
{
 public static void main(String[]ar)
 {
  double sugar,butter,flour;
  int cookies;
  Scanner input=new Scanner(System.in);
  System.out.println("Please enter how many cookies you want to bake");
  cookies=input.nextInt();
  sugar=1.5/48*cookies;
  butter=1.0/48*cookies;
  flour=2.75/48*cookies;
  System.out.println("These are the following ingredients you need for "+cookies+" cookies \n");
  System.out.println("you need "+sugar+" cups of sugar");
  System.out.println("you need "+butter+" cups of butter");
  System.out.println("you need "+flour+" cups of flour");
  
  
  
  
 }
}

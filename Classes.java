//Today we study Classes
import java.util.Scanner;
import java.util.Random;
public class Classes
{
 
   static int sum;
   static String name;
   static int age,age2;
   static Scanner input=new Scanner(System.in);
   static Random ran=new Random();

 
 
 public static void main(String[]ar)
 {
  int player1=x,player2=x;
  System.out.println("What is your name");
  name=input.nextLine();
  sum=Age();
  System.out.println("Your name is "+name+" and your are "+sum+" years old");
  int x=ran.nextInt(3);
  
  
  if(x==1)
  System.out.println("rock");
  else if(x==2)
  System.out.println("paper");
  else 
  System.out.println("Scissors");
  
  
 if(player1==1&&player==2)
 System.out.println("player 1 won the game");
 else if(player2)
 {
 
 }
 public static int Age()
 {
  
  System.out.println("what is your age");
  age=input.nextInt();
  System.out.println(" What is your secodn age");
  age2=input.nextInt();
  int sum=age+age2;

  return sum;
 }
}



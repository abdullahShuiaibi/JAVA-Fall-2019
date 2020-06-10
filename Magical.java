import java.util.Scanner;
public class Magical
{
 public static void main(String[]ar)
 {
  int day, month,year,magical;
  Scanner input=new Scanner(System.in);
  System.out.println("please enter the day");
  day=input.nextInt();
  System.out.println("what is the month");
  month=input.nextInt();
  System.out.println("what is the year, please enter in two digit form. ");
  year=input.nextInt();
  magical=day*month;
  if (magical==year){
   System.out.println("  you have a magical year.");
   System.out.println(day+"/"+month+"/"+year);
  }
  else
  {
   System.out.println("  sorry you dont have a magical year.");
   System.out.println(day+"/"+month+"/"+year);
   }
  }
 }
 
 
 
 
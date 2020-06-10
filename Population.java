import java.util.Scanner;
public class Population
{ 
 public static void main(String[]ar)
 {
  int count=1,days,increase;
  double starting;
  
  Scanner input = new Scanner(System.in);
  System.out.println(" What is the starting number of organisms. Must be atleats 2");
  starting=input.nextInt();
  System.out.println(" how fast are they increasing, perctange wise, non negative increase");
  increase=input.nextInt();
  System.out.println(" How many days are they increasing for, must be more than 0");
  days=input.nextInt();
  System.out.println("0 days "+starting+" population of orgarnism");

  while(starting>1&&increase>0&&days>0)
  {  
 
    while(count<=days)
     {
      starting=starting*increase/100+starting;
      System.out.println(count+" days "+starting+" population of orgarnism");
      count++;
     }
      
    
    
  }


  
 }
}
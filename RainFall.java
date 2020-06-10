import java.util.Scanner;

public class RainFall
{
 public static void main(String[]ar)
 {
  int countyear=1;
  int count=1;
  int sum=0;
  int average;
  int month;
  int year;
  Scanner input=new Scanner(System.in);
  System.out.println("how many year do you want to calcalte.");
  year=input.nextInt();
  

    while(countyear<=year)
     {
         
      while(count<=12)
       {
         System.out.println("what is the inches of rain in month "+count);
         month=input.nextInt();
         sum=sum+month;
         average=month/sum;
         count++;
        }
    
    System.out.println("You Have Calculate "+(count-1)+" Month's.");    
    System.out.println("Your Sum of Rainfall For "+year+" Years Is "+sum+" Inches");
    System.out.println("Your Average Is "+(sum/count+1)+" Inches Of Rain Per "+year+" Year");
    countyear++;
   
 
       } 
   
   
   
   
   
   
   
   
 }
 }
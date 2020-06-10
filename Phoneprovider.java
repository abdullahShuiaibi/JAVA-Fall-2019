import java.util.Scanner;

public class Phoneprovider
 {
  public static void main(String[]ar)
  { 
   double rateA,B,C;
   String plan;
   int hours;
   double extra,extrahours;
   
   
   Scanner input=new Scanner (System.in);
   System.out.println("what kinda of pacake do you have");
   plan=input.nextLine();
   System.out.println("how many hours did you use");
   hours=input.nextInt();
   extrahours=hours-10;
   extra=2.00*extrahours;
   rateA=0.995*hours+extra-(extrahours);
  



   if (plan.equals("A")){
   System.out.println("You have plan A");}
    if(hours>10){
    System.out.println("your total "+rateA);
   }
   else 
   System.out.println("your total is "+rateA);
      
   
  }
 }
    
   
   
  
   
   
   
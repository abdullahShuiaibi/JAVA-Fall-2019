import java.util.Scanner;
public class Softwearsales
 {
 public static void main(String[]ar)
  {
   int quantity,discount1,discount2,discount3,discount4,total;
   Scanner input = new Scanner(System.in);
   System.out.println("how many packages would you like to purchase");
   quantity=input.nextInt();
   total=quantity*99;
   discount1=total-(total*20/100);
   discount2=total-(total*30/100);
   discount3=total-(total*40/100);
   discount4=total-(total*50/100);
   if(quantity>=100){
   System.out.println("your total is $"+total);
   System.out.println("your total  after the discount is $"+discount4);
   System.out.println("your discount is $"+(total-discount4)+" or 50%");
   }
   else if(quantity>=50){
   System.out.println("your total is $"+total);
   System.out.println("your total  after the discount is $"+discount3);
   System.out.println("your discount is $"+(total-discount3)+" or 40%");
   }
   else if(quantity>=20){
   System.out.println("your total is $"+total);
   System.out.println("your total  after the discount is $"+discount2);
   System.out.println("your discount is $"+(total-discount2)+" or 30%");
   }
   else if(quantity>=10){
   System.out.println("your total is $"+total);
   System.out.println("your total  after the discount is $"+discount1);
   System.out.println("your discount is $"+(total-discount1)+" or 20%");
   }
   else if (quantity<10){
   
   System.out.println("sorry your quantity is not valid.");
   System.out.println(" please purchase more to get a discount");
   }



   
  }
 }



   
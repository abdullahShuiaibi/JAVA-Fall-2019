import java.util.Scanner;
public class Exam
{ 
 public static void main(String[]ar)
  {
   int x;
   
   
   //for(int i=0;i<=1;i++){

   while(true){
   Scanner input=new Scanner(System.in);
   System.out.println("\nenter a number from 1 to 10.");
   x=input.nextInt();
      
    switch(x){
       case 1:
          System.out.println("one");
          break;
       case 2:
        System.out.println("two");
          break;
       case 3:
          System.out.println("three");
          break;
       case 4:
          System.out.println("four");
          break;
       case 5:
          System.out.println("five");
          break;
       case 6:
          System.out.println("six");
          break;
       case 7:
          System.out.println("seven");
          break;
       case 8:
          System.out.println("eight");
          break;
       case 9:
          System.out.println("nine");
          break;
          
       case 10:
          System.out.println("ten");
          break;
      
      default:
          System.out.println("sorry, not a valid number");
          break;






        }
        }
        
        
        
        
        
      }
    
    
     }
     
     
 


   
   
   
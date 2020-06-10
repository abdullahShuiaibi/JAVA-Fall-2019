import java.util.Scanner;
public class PasswordValidation
{
  public static void main( String[] ar)
  {
   int count=1;
   Scanner input=new Scanner(System.in);
   System.out.println(" Please create a password");
   String password=input.next();
   System.out.println(" please enter your password");
   String enter=input.next();
    
    while(!enter.equals(password)&&count<=3)
    {
     
     System.out.println(" your password entry is invalid.\n");
     
     System.out.println(" Please enter your password again.");
     enter=input.next();
     count++;

    } 
   if(enter.equals(password))
   {  
    System.out.println("congrats, you password is valid.");
   }
   else
    System.out.println(" Your password is wrong and you have been locked out.");
    
  }
}
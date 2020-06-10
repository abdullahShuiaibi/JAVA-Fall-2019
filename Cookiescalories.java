import java.util.Scanner;
public class Cookiescalories
{
 public static void main(String[]ar)
  {
   int cookies,calories,serving,total;
   Scanner input =new Scanner(System.in);
   System.out.println("how many cookies have you eaten");
   cookies=input.nextInt();
   calories=300;
   serving=calories*10/40;
   total=serving*cookies;
   System.out.println("you've had "+total+" calories from "+cookies+" cookies ");
   
   
   }
  }
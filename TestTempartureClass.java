import java.util.Scanner;
public class TestTempartureClass
{
 public static void main ( String []ar)
 {
  
  Scanner input=new Scanner ( System.in);
  System.out.println(" Please enter a temparture in Fahrenheit");
  double choice=input.nextInt();
 
  TempertureClass A1= new TempertureClass();
 

  A1.SetFtemp(choice);
  System.out.println(" Your temparture in fahrenheit is "+A1.GetFtemp());
  System.out.println(" Your temparture in kelvin is "+A1.GetKalvin());
  System.out.println(" your temparture in celsius is "+A1.GetCelsius());
 }
 
}
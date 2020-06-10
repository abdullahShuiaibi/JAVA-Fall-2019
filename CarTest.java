import java.util.Scanner;
public class CarTest
{
 public static void main(String[]ar)
 {
  Scanner input = new Scanner (System.in);
  Car carIn=new Car ();
  Car carIn2=new Car ("honda","civic",23000);
  carIn.SetMake("honda");
  carIn.SetModel("civic");
  carIn.SetPrice(23500);
  System.out.println("The make is "+carIn.GetMake());
  System.out.println("The model is "+carIn.GetModel());
  System.out.println("The price is "+carIn.GetPrice());
 }
}
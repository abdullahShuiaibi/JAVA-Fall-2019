import java.util.Scanner;

public class Mass
 {
  public static void main(String[]ar)
  {
   int light,heavy;
   double mass,newtons;
   Scanner input=new Scanner(System.in);
   System.out.println("what is the mass of the the object in kilgrams");
   mass=input.nextDouble();
   newtons=mass*9.807;
   heavy=1000;
   light=10;
   if (newtons>heavy){
   System.out.print("your weight of the object is "+newtons+" newtons");
   System.out.print("\nIts to heavy");}
   else if (newtons<light){
   System.out.print("your weight of the object is "+newtons+" newtons");
   System.out.println("\nIts to light");}
   else
   {
    System.out.println("your weight of the object is "+newtons+" newtons"); }  
      
  }
 }
   
  
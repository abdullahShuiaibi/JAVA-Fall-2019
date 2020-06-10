import javax.swing.JOptionPane;

public class ConversionProblem

{
 static String input;
 
 public static void main(String[]ar)
 {
  int number,result;
  input=JOptionPane.showInputDialog(" Enter a number in meters.");
  number=input.parseInt(input);
  
  while(number<0)
  {
   System.out.println(" Sorry invalid number");
   }
   
   
  JOptionPane.showMessageDialog("please choose the conversion type you want");
  Menu();
 
  if(menu()==1)
  { 
   result=ShowKilometer(number);
   System.out.println(result);
   }
   
  else if(menu()==2)
  {
    result=ShowInches(number);
   System.out.println(result);
  }
  
  else if(menu()==3)
  {
    result=ShowFeet(number);
   System.out.println(result);
  }
  
  else if(menu()==4)
  {
   System.out.println(" You quit, good bye.");
  }
  
  
  }
 }

 
 public static int ShowKilometer(int num)
 {
  int kilo=num*0.001;
  return kilo;
 }
 
 public static int ShowInches(int num)
 {
 int inches = num * 39.37;
 return inches;
 }
 
 
 public static int ShowFeet(int num)
 {
  int feet = num * 3.281;
  return feet;
 }
 
 public static void Menu()
 {
  for(int i=1;i>0;i++)
  { 
    input=JOptionPane.showInputDialog("1.Convert to kilomter's\n2.Convert to inches\n3. Convert to feet\n4.Quit the program");
    int choice=input.parseInt(input);

  }
   
  
 }
 
}
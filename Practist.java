import java.util.Scanner;
public class Practist
{
public static void main(String[]ar)
{
 int number;
 int smallestnumber;
 int count=1;
 int largestnumber;

 Scanner input=new Scanner (System.in);
 System.out.println(" Please Enter Your First Number ");
 number=input.nextInt();
 smallestnumber=number;
 largestnumber=number;
 
 while(number!=-99)
  {
   System.out.println(" Please Enter The Second Number \n          or          \n Enter [-99] to End.");
   number=input.nextInt();
   if(number<smallestnumber&&number!=-99)
    {
     smallestnumber=number;
      }
     else if(number>largestnumber)
      { 
      largestnumber=number;
        }
    count++;
   }
  System.out.println(" The largest number in the sequince is "+largestnumber);
  System.out.println(" The smallest number in the sequince is "+smallestnumber);
  
  
  
  
  }
}
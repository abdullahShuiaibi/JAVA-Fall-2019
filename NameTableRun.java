import java.util.Scanner;
public class NameTableRun
{
 public static void main( String[] ar)
 {
  Scanner input = new Scanner(System.in);
  String Arr[];
  Arr= new String[1000];
  String Pass[];
  Pass = new String[1000];

   for(int i=0;i<=3;i++){
      System.out.println(" Enter name ");
      Arr[i]=input.nextLine();
      System.out.println("Enter password");
      Pass[i]=input.nextLine();      
   }
  for(int j=0;j<=Arr.length;j++){
  
   System.out.println("Enter userName");
   String usrNm=input.next();  
   if(usrNm.equals(Arr[j]))
   { 
       System.out.println("Enter password");
       String Acc_Pass = input.next();
        if(Acc_Pass.equals(Pass[j]))
           {
               System.out.println("You've loged in succufully");
           }
   }
   else 
      System.out.println("Nothing found");
   
   }
 }
}
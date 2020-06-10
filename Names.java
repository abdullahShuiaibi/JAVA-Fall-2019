import java.util.Scanner;
public class Names
 {
 public static void main(String[]ar)
  {
   String name1,name2;
   
   Scanner input=new Scanner (System.in);
   
   System.out.println("what is name 1");
   name1=input.nextLine();
   
   System.out.println("what is name2");
   name2=input.nextLine();
  
     
   if(name1.compareTo(name2)>0){
     System.out.println(name2+"\n\n"+name1);
   }
   else
     System.out.println(name1+"\n\n"+name2);
   
   
   
  }
 }
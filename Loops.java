import java.util.Scanner;
public class Loops
 { 
  public static void main(String[]ar)
  {
  String name;
  
  for(int i=0;i<5;i++){
     for(int j=0;j<5-i;j++)
     {
        System.out.print(" ");
        } 
  for(int k=0;k<i;k++){
  System.out.print("* ");
  }
  System.out.println();
  }  
  int count=0;
  while(count<11){
  System.out.println(count);
  count++;
  }
  }
}
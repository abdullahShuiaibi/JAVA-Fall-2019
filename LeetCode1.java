import java.util.Scanner;
import java.util.Arrays;
public class LeetCode1
{
 public static void main( String[] ar)
 {
 
   int[] numberlist={3,4,6,9,4,1,3};
   for(int i=0;i<numberlist.length;i++)
       {
        for(int j=i;j<numberlist.length;j++)
         {
          if((numberlist[i]==numberlist[j])&&(i!=j))
             {
              System.out.println("The dublict is "+numberlist[j]);
             }
           
         }
       }
              
               
   }
 }
import java.util.Scanner;

public class CountLetters
{
	public static void main(String [] args )
	{  
      int count=0;
      String sentence;
      String letter;
      char pick;
      int countletter=0;
      
		Scanner input = new Scanner(System.in);
      System.out.println("please type a sentence");
      sentence=input.nextLine();
      System.out.println("please chose a letter you want to find");
      letter=input.nextLine();
      pick=letter.charAt(0);
      while(count<sentence.length())
      {
        
        if(pick==sentence.charAt(count))
         {
          countletter++;
         
        
         }
        count++; 
      }
      System.out.println("your amount is "+countletter);

                    
      
      
		
 }
}
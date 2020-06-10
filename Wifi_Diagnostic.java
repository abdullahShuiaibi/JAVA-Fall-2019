import java.util.Scanner;

public class Wifi_Diagnostic
{
 public static void main(String[]ar)
 {
  String question,question2,question3,question4;
  Scanner input=new Scanner(System.in);
  System.out.println("Here is how you can fix a bad wifi connection\nReboot the computer and try to connect to the wifi.\n\nDid that fix the problem?");
  question=input.nextLine();
  if(question.equals("no"))
  {         
     System.out.println("try to reboot the router.\n\ndid that work");
     question2=input.nextLine();
     if(question2.equals("no"))
     {
        System.out.println("are the cables all connected, try connection all of them again\n\ndid that work");
        question3=input.nextLine();
        if(question3.equals("no"))
        {
           System.out.println("move the router to a new place\n\ndid that work");
           question4=input.nextLine();
           if(question4.equals("no"))
           {
              System.out.println("It looks like anything you try does not work\nyou should get a new router");
              }
              else
               System.out.println("that fixed the problem, thank you.");
               }
                else
                 System.out.println("that fixed the problem, thank you.");
                 }
                  else
                   System.out.println("that fixed the problem, thank you.");
                   }
    else
     System.out.println("that fixed the problem, thank you.");
                                       

                                       

                                       

    
    
    
    
                 
      }
      }
              
          
          
          
          
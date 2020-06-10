import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class RandomGames
{
 
 static Scanner input=new Scanner(System.in);
 static Random random=new Random();
 
 
 public static void main ( String [] ar)
 {
 for(int i=1;i>0;i++)
 {
  int question;
  question=Question();
  if(question==1)
  {
   JOptionPane.showMessageDialog(null," You chose the guessing game.");
  
  }
  else if(question==2)
  {
   JOptionPane.showMessageDialog(null," You chose the Heads and Tails game");
   FlipCoin();
  }
  else if(question==3)
  {
   JOptionPane.showMessageDialog(null,"You ended the game\n Good-bye.");
  }
  
 }
 
  
 }
 public static int Question()
 {
  int question;
  String input=JOptionPane.showInputDialog("which game would you like to play\n 1.Pick a number from 1-10\n2.Heads and Tails\n3.End the game");
  return question = Integer.parseInt(input);
 }
 
 
 public static void FlipCoin()
 {
  
 int count=1;
 while(true)
 { 
 
  String input=JOptionPane.showInputDialog("Heads or Tails");
  
  int game=random.nextInt(2)+1;
  if(input.equalsIgnoreCase("heads")&&game==1)
  {
   JOptionPane.showMessageDialog(null,"You choose,"+input+" and the computer choose Heads \n          you won");
  } 
  else if(input.equalsIgnoreCase("tails")&&game==2)
   JOptionPane.showMessageDialog(null,"you choose "+input+" and the computer choose Tails \n          you win");
  else if(input.equalsIgnoreCase("Heads")&&game==2)
   JOptionPane.showMessageDialog(null,"You choose,"+input+" and the computer choose tails \n          you lose");
  else if(input.equalsIgnoreCase("tails")&&game==1)
    JOptionPane.showMessageDialog(null,"You choose,"+input+" and the computer choose Heads \n         you lose");
  String input2=JOptionPane.showInputDialog(" DO you want to keep playing ");
  if(input2.equalsIgnoreCase("yes"))
   {
    continue;
   }
  else if(input2.equalsIgnoreCase("no"))
  {
   JOptionPane.showMessageDialog(null," Game ended.");
   break;
   }
   else
  {
   JOptionPane.showMessageDialog(null," Sorry invalid number");
  }
 count++;
  }
  }

 
 
 
 
 
 }








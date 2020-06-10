import java.util.Scanner;

import java.util.Random;

import javax.swing.JOptionPane;


public class RockPaperScissers
{
 

 static String input;
 
 
 public static void main( String [] ar)
 {
  Random num=new Random();
  Scanner input=new Scanner(System.in);
  
 int R=Rounds();
 for(int i=1;i<=R;i++)
 
 {
 
 int player=player1();
  int computer=computer();
 
 

 
 if(player==1&&computer==3)
 {
  JOptionPane.showMessageDialog(null,"you won");
  }
 else if(player==1&&computer==2)
 {
 JOptionPane.showMessageDialog(null,"you lost");
  }
 else if(player==2&&computer==1)
 {
  JOptionPane.showMessageDialog(null,"you lost");
  }
 else if(player==2&&computer==3)
 {
  JOptionPane.showMessageDialog(null,"you won");
  }
 else if(player==3&&computer==1)
 {
  JOptionPane.showMessageDialog(null,"you lost");
  }
 else if(player==3&&computer==2)
 {
  JOptionPane.showMessageDialog(null,"you won");
  }
 else if(player==computer)
 {
  JOptionPane.showMessageDialog(null,"its a draw");
  } 
 else if(player==4)
 {
  JOptionPane.showMessageDialog(null,"You have ended the game, good bye");
  break;
 }
 else 
  JOptionPane.showMessageDialog(null,"Please try again");
 
  
  
  }
  
 }
 
 
 
 
 public static int player1()
 {
 
  input=JOptionPane.showInputDialog("Please pick one of the following\n1.rock\n2.paper\n3.scissers\n4.End game");
  int player1=Integer.parseInt(input);
  return player1;
  
  
  
 }
  public static int computer()
 {
  Random num=new Random();
  int x=num.nextInt(3)+1;
  return x;
 }
 
 
 public static int Rounds()
 {
  input=JOptionPane.showInputDialog(" How many rounds do you want to play");
  int rounds=Integer.parseInt(input);
  return rounds;
 }
 
 
}
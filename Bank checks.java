import javax.swing.JOptionPane;

public class Bank-check
 {
  public static void main(String[]ar)
  { 
  String input;
  double check,check1,check2,check3,check4;
  input=JOptionPane.showInputDialog("how many check have you written this month");
  check=Double.parseDouble(input);
  check1=check*0.10+10;
  check2=check*0.08+10;
  check3=check*0.06+10;
  check4=check*0.04+10;
  if(check>20){
  JOptionPane.showMessageDialog(null,"your total charges for this month are "+check1);
  }
  else if(check>=20 && check<=39){
  JOptionPane.showMessageDialog(null,"your total charges for this month are "+check2);
  }
  else if(check>=40 && check<=59){
  JOptionPane.showMessageDialog(null,"your total charges for this month are "+check3);
  }
  else if(check>60){
  JOptionPane.showMessageDialog(null,"your total charges for this month are "+check4);
  }
  
  
  
 }
}

  
  

  

import java.util.Scanner;


public class Stack_list{
   private int length;
   private char[] stackArr;
   private int top;
   
   public Stack_list(int s){
      length = s ;
      stackArr = new char[length];
      top = -1;
      
   }
   public void push(char num){
    stackArr[++top] = num;
  
   }
   public char pop(){
    return stackArr[top--];
   }
   
   public char peek(){
     return stackArr[top];
   }
   
   public boolean isEmpty(){
     return (top == -1);
   }
   
   public boolean isFull(){
     return (top == length-1);
     
   }
   
   
}

class Stack_test{
 public static void main(String [] ar){
   Stack_list stack = new Stack_list(10);
   Scanner input = new Scanner (System.in);
   System.out.print("Enter a word: ");
   String word = input.next();
   
   for (int i =0; i<word.length();i++){
    char letter = word.charAt(i);
    stack.push(letter);
   }
   System.out.print("Your reverse word is: ");
   while(!stack.isEmpty()){
       char value = stack.pop();
       System.out.print(value);
       
       
      

       }
      
   
   
      
 }
}
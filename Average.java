import java.util.Scanner;
public class Average
 { 
  public static void main(String[]ar)
   { 
    int grade1,grade2;
    double averge;
    String name;
    Scanner input=new Scanner(System.in);
    System.out.println("what is your name");
    name=input.nextLine();
    System.out.println("your name is "+name);
    System.out.println("");
    System.out.println("please enter the first grade");
    grade1=input.nextInt();
    System.out.println("please enter the second grade");
    grade2=input.nextInt();
    averge=(grade1+grade2)/2.0;
    System.out.println("your average is "+averge);
    if (averge>=60){
    System.out.println(name+" You passed");}
    else{ 
    System.out.println("sorry, "+name+" you failed");}
    if (averge==100){
    System.out.print(" wow "+name+" you have a perfect score");}
    else if (averge>=95){
    System.out.println("you have an A");} 
    else if (averge>=90){
    System.out.println("you have an A-");} 
    else if (averge>=86){
    System.out.println("you have an b+");} 
    else if (averge>=84){
    System.out.println("you have an b");} 
    else if (averge>=80){
    System.out.println("you have an b-");} 
    else if (averge>=77){
    System.out.println("you have an c+");} 
    else if (averge>=75){
    System.out.println("you have an c");} 
    else if (averge>=70){
    System.out.println("you have an c-");} 
    else if (averge>=65){
    System.out.println("you have an D");} 
    else if (averge>=60){
    System.out.println("you have an D-");} 


    


    




      
   
   }
}
   
   
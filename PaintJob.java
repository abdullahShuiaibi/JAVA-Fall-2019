

import java.util.Scanner;


public class PaintJob
{
 public static void main(String []ar)
 {
  Scanner input=new Scanner(System.in);
  int rooms,paint,price,hours;
  float paintnum,paintcost,laborcost,totalcost;
  System.out.println(" How many rooms do you want to paint");
  rooms=input.nextInt();
  System.out.println(" How many feet are in each room");
  paint=input.nextInt();
  System.out.println(" What is the price of a bucket of paint");
  price=input.nextInt();
  paintnum=PaintAmount(paint,rooms);
  System.out.println(" You need "+paintnum+" Gallons of paint");
  hours=LaborHours(rooms,paint);
  System.out.println(" This will take "+hours+" hours to complete");
  paintcost=PaintCost(paintnum,price);
  System.out.println(" The cost of the paint for the job is $"+paintcost);
  laborcost=LaborCost(hours);
  System.out.println(" This will cost you $"+laborcost+" for labor expenses");
  totalcost=TotalCost(laborcost,paintcost);
  System.out.println(" The total cost of the whole job is "+totalcost);
  }
 
 
 
 //The method for The paint ampount needed for the job.
 public static float PaintAmount(float feet,float rooms)
 {
  float paint = rooms*feet/115;
  return paint;  
  }
 
 
 
 
 //The method for the total of labor hours needed for the job.
 public static int LaborHours (int rooms,int feet)
 {
  int space=rooms*feet;
  int labor=space/115*8; //115 is the feet that one gallon of paint can fully cover.
  return labor;
  }
 
 
 
 //The method of how much the paint will cost for the job.
 public static float PaintCost(float paintnum,float price)
 {
  float paintcost=paintnum*price;
  return paintcost;
  }
 
 
 
 //The method for how much labor will cost for the job.
 public static int LaborCost(int hours)
 {
  int laborcost=hours*18;
  return laborcost;
  }
 
 
 
 
 
 //The method for how much everthing, meaning the whole job will cost.
 public static float TotalCost(float laborcost,float paintcost)
 {
  float totalcost=laborcost+paintcost;
  return totalcost;
  }
 
 
 
 
}
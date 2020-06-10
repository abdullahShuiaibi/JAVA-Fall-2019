public class Stack2
{
  private int len;
  private double[] ARR ;
  private int top;
  
  public Stack2(int len){
    ARR = new double [len];
    top = -1;
  }
  public boolean isEmpty(){
   return (top == -1);
  }
  public void add(int num){
  ARR[++top] = num;
  }
  public double out(){
  return ARR[top--];
  }
  public boolean isFull(){
    return (top == len -1);
  }
}

class testStack2{
 public static void main(String [] ar){
   Stack2 s = new Stack2(10);
   s.add(10);
   s.add(20);
   s.add(30);
   s.add(40);
   
   while (!s.isEmpty()){
     double out = s.out();
     System.out.println(out);
   }
 }
}
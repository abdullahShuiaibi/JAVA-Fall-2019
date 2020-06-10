public class GuestList
{
   public static void main ( String []ar)
   {
      int array[]={10,9,10,11};
      String arrayStr[]={"abdullah","sara celo","mama"};
      int hey=number(array[0],array[3],array[1]);
      System.out.println(hey);
      if(arrayStr[0].length()>arrayStr[1].length())
      {
         System.out.println(arrayStr[0]+" name is bigger than "+arrayStr[1]+" name"); 
      }
      else
         System.out.println(arrayStr[1]+" is bigger than "+arrayStr[0]+" Name");
   
   }
   public static int number(int x,int y,int z)
   {
      int sum=(x+y+z)/3;
      return sum;
   }
}
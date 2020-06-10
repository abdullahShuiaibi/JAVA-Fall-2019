public class RainfallClass
{
   private double year[];
   private double monthly;
   private double most;
   private double least;
   
   public double GetYear()
   {
      return year;
   }
   public void SetYear(double Y[])
   {
    year=new double [Y.length];
    
    int count=0;
    while(count<Y.length)
     {
      year[count]=Y[count];
      count++;
     }
    
   }
   
   
   
 }
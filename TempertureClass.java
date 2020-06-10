public class TempertureClass
{
 private double  Ftemp;
 private double celsius;
 private double kalvin;
 
 public TempertureClass()
 {
  Ftemp=0;
  celsius=0;
  kalvin=0;
 }
 public double GetFtemp()
 {
   return Ftemp;
 }
 public void SetFtemp(double F)
 {
  Ftemp=F;
 }
 public double GetCelsius()
 {
  return (Ftemp-32)*5/9;
 }
 public double GetKalvin()
 {
   return (Ftemp-32)*5/9+273.15;
 }
 
}
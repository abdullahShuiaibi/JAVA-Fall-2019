public class TestItem
{
 public static void main(String[]ar)
 {
  Item I = new Item ();
  Item I2 = new Item();
  Item I3 = new Item();
  I.SetDiscribition("Jacket");
  I.SetUnitsOnHand(7);
  I.SetPrice(129.99);
  I2.SetDiscribition("Jeans");
  I2.SetUnitsOnHand(3);
  I2.SetPrice(49.95);
  I3.SetDiscribition("T-Shirts");
  I3.SetUnitsOnHand(23);
  I3.SetPrice(9.95);


  System.out.println("            Discribition     Units On Hand      Price\n_________________________________________________________");
  System.out.println("Item #1        "+I.GetDiscribition()+"              "+I.GetUnitsOnHand()+"            $"+I.GetPrice());
  System.out.println("Item #2        "+I2.GetDiscribition()+"               "+I2.GetUnitsOnHand()+"            $"+I2.GetPrice());
  System.out.println("Item #3        "+I3.GetDiscribition()+"            "+I3.GetUnitsOnHand()+"           $"+I3.GetPrice());


 }
}
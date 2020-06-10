
public class TestEmploye
{
   public static void main(String[]ar)
   {
      Employe input = new Employe();
      Employe i2=new Employe();
      Employe i3=new Employe();
      input.SetName("Abdullah Shuiaibi");
      input.SetDepartment("Softwear devloper");
      input.SetPosition("Intern");
      input.SetID(23690899);
      i2.SetName("Mike Ross");
      i2.SetDepartment("Accounting");
      i2.SetPosition(" Accounting Manger");
      i2.SetID(29239392);
      i3.SetName("Anna Mcdonald");
      i3.SetDepartment("HR");
      i3.SetPosition(" Ethic's manger");
      i3.SetID(99374838);
   
   
     
      
      
      System.out.println(   "Name                  ID           Department        Position\n----------------------------------------------------------");
      System.out.println(input.GetName()+" | "+input.GetID()+" | "+input.GetDepartment()+" | "+input.GetPosition());
      
      System.out.println(i2.GetName()+"         | "+i2.GetID()+" | "+i2.GetDepartment()+"        | "+i2.GetPosition());
      System.out.println(i3.GetName()+"     | "+i3.GetID()+" | "+i3.GetDepartment()+"                | "+i3.GetPosition());
   
      
   }
}
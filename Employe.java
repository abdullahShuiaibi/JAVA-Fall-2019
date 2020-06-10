public class Employe
{
 private String name,position,Department;
 
 private int Id;
 
 public Employe()
 {
  name="nothing";
  position="nothing";
  Department="nothing";
  Id=0;
  
 }
 public String GetName()
 {
  return name;
 }
 public void SetName(String n)
 {
  name=n;
 }
 public String GetPosition()
 {
  return position;
 }
 public void SetPosition(String p)
 {
  position=p;
 }
 public String GetDepartment()
 {
  return Department;
 }
 public void SetDepartment(String d)
 {
  Department=d;
 }
 public int GetID()
 {
  return Id;
 }
 public void SetID(int I)
 {
  Id=I;
 }
 }

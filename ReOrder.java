public class ReOrder{
    public static void main(String [] ar){
     int[] num_list = {90,80,60,17,3,0,89,111,32,23,134,12,400};
     Array Arr = new Array(num_list.length);
     for (int i = 0; i<num_list.length;i++)
     {  
         Arr.add(num_list[i]);
     }
    
     Arr.display();
     Arr.list();
     System.out.println("\n");
     Arr.display();
     
    
    }
}
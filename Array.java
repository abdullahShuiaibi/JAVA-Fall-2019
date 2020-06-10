public class Array{
    private int len;
    private int[] Arr;
    private int index ;
    
    public Array(int len){
      len = len;
      Arr = new int [len];
      index = 0;
    }
    public void add(int num){
     
      Arr[index] = num;
      index++;
      
    }
   
    public void swap(int num1,int num2)
    {
      int empty;
      empty = Arr[num1];
      Arr[num1] = Arr[num2];
      Arr[num2] = empty;
      
      
    }
    public void display()
    {
        for(int i: Arr)
        {
            System.out.print(i+",");
        }
    }
   
    public void list()
    {
        int  min;
        for(int i = 0; i<index-1; i ++)
        {   
            min = i;
            for(int j = i+1;j<index; j++)
            {
                if (Arr[j] < Arr[min])
                  {
                     min = j;
                     
                  }
                swap(i,min);
            }
             

        }
        
      }   
    
}


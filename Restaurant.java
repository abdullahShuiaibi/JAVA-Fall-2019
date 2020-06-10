import java.util.Scanner;

public class Restaurant
 {
  public static void main(String[]ar)
  {
   String vegetarian,vegan,gluten;
   Scanner input=new Scanner(System.in);
   System.out.println("is anyone in your party a vegetarian?");
   vegetarian=input.nextLine();
   System.out.println("is anyone in your party a vegan?");
   vegan=input.nextLine();
   System.out.println("is anyone in your party gluten-free?");
   gluten=input.nextLine();
   
    if(vegetarian.equals("yes")&&vegan.equals("yes")&&gluten.equals("yes"))
   {
     System.out.println("here are your choices:\n   corner's cafe\n   the chef's kitchen");
     }
     
     
     
     
     
      
   else if(vegetarian.equals("no")&&vegan.equals("no")&&gluten.equals("yes"))
   {
     System.out.println("here are your choices:\n   corner's cafe\n   the chef's kitchen");
     }
   
   
   
   
    else if(vegetarian.equals("yes")&&vegan.equals("no")&&gluten.equals("no"))
   {
     System.out.println("here are your choices:\n   corner's cafe\n   the chef's kitchen\n   main street pizza company");
     }
   


   

   
   
   
   
   else if(vegetarian.equals("no")&&vegan.equals("no")&&gluten.equals("no"))
   {
     System.out.println("here are your choices:\n   joes's gourmet burger's\n   main street pizza\n   corner's cafe\n   mama's italian\n   the chef's kitchen");
     }
     
   
   
   
    else if(vegetarian.equals("yes")){if(vegan.equals("no")){if(gluten.equals("yes"))
   {
     System.out.println("here are your choices:\n    main street pizza\n    corner's cafe\n    the chef's kitchen");
     }
     }
     }
    else 
    System.out.println("sorry,you can't be vegan without being a vegetarian");
    
    
    
    
     

   
   

   
   
              
     
     
     
     
     
          
          

        
        
        
        
        
        
    }
   }





   
   
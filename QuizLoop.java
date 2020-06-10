public class QuizLoop
{
	public static void main (String[] args)
	{
	

		int j=14;

		for ( int i = 5; i <= j ; i++ )
		{
			System.out.println ( "\n Morning  " );

			if  (  i  %  3 == 0 )
				System.out.println( "\n Sunny " + i + "  " + j );
		
			else if  (  i  %  3 == 1 )
				System.out.println( "\n Rainy " + i + "  " + j );

			else
				System.out.println( "\n Cloudy " + i + "  " + j );


			System.out.println( "\n Night" );
	
			j = j -2  ;
		}
		System.out.println(  "Looping is fun" );
	
	}
	
}	
public class Circle
{
	private int radius;
	
	public int getRadius()
	{
		return radius;
	}
	
	
	public void setRadius( int r )
	{
		radius = r;
	}
	
	
	
	public double calculateArea()
	{
		return radius * radius * Math.PI;
	}
	
	public double calculateCircumference()
	{
		return 2* radius * Math.PI;
	}
	
}
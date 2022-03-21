package mobility;

public class Point 
{

	private int x;
	private int y;
	
	public Point()
	{
		x=0;
		y=0;
	}
	
	public Point(int x,int y)
	{
		setX(x);
		setY(y);
	}
	
	public boolean setX(int x)
	{
		if (x<0||x>800)
		{
			this.x=x;
			return true;
		}
		else
		{
			System.out.print("Please enter valid X");
			return false;
		}	
	}
	
	public boolean setY(int y)
	{
		if (y<0||x>600)
		{
			this.y=y;
			return true;
		}
		else
		{
			System.out.print("Please enter valid Y");
			return false;
		}	
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
}

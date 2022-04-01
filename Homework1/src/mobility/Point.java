package mobility;

public class Point 
{

	private int x;
	private int y;
	private static final int max_x=800;
	private static final int max_y=600;
	
	public Point()
	{
		x=0;
		y=0;
	}
	
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public Point(Point p)
	{
		this.x=p.getX();
		this.y=p.getY();
	}
	
	public boolean setX(int x)
	{
		if (x>=0&&x<=max_x)
		{
			this.x=x;
			return true;
		}
		else
		{
			System.out.print("Please enter valid x");
			return false;
		}
	}
	
	public boolean setY(int y)
	{
		if (y>=0&&y<=max_y)
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
	
	public static boolean cheackBounderies(Point p)
	{
		if ((p.getX()>=0 && p.getX()<=max_x)&&(p.getY()>=0 && p.getY()<=max_y))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}



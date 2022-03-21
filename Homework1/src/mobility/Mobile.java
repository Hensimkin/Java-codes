package mobility;

public abstract class Mobile implements Ilocatable  {

	private Point location;
	private double totalDistance;
	
	public Mobile()
	{
		Point location=new Point();
		this.totalDistance=1;
	}
	public void addTotalDistance(double d)
	{
		this.totalDistance=this.totalDistance+d;
	}
	
	public double calcDistance(Point p)
	{
		
	}
	
	public static double move(Point p)
	{
		return p.totalDistance;
	}
}

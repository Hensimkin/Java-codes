package mobility;
import java.lang.Math;

public abstract class Mobile implements Ilocatable  {

	private Point location;
	private double totalDistance;
	
	
	public Mobile(Point p)
	{
		this.location=new Point(p.getX(),p.getY());
		this.totalDistance=1;
	}
	
	
	public void addTotalDistance(double d)
	{
		this.totalDistance=this.totalDistance+d;
	}
	
	
	public double calcDistance(Point p)
	{
		return Math.sqrt(Math.pow(this.location.getX()-p.getX(),2)+Math.pow(this.location.getX()-p.getX(),2));
	}
	
	
	public abstract double move(Point p);

	
	public Point getLocation()
	{
		Point a=new Point(this.location.getX(),this.location.getY());
		return a;
	}
	
	
	public boolean setLocation(Point p)
	{
		return this.location.setX(p.getX())&&this.location.setY(p.getY());
	}
	
	
	public double getTotaldistance()
	{
		return this.totalDistance;
	}
}

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
	
	//public static double move(Point p)
	{
		//return p.totalDistance;
	}
}

package mobility;

public abstract class Mobile implements Ilocatable  {

	private Point location;
	private double totalDistance;
	
	public Mobile()
	{
		Point location=new Point();
		this.totalDistance=1;
	}
	void addTotalDistance(double d)
	{
		
	}
}

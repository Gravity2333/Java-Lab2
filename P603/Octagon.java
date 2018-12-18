package P603;

public class Octagon extends GeometricObject implements Comparable<Octagon> , Cloneable{
	private double sides;
	public Octagon(String Color,boolean isFilled,double sides)
	{
		super(Color,isFilled);
		this.sides=sides;
	}
	@Override
	public int compareTo(Octagon O)
	{
		if(O.sides==this.sides&&O.isFilled()==this.isFilled()&&O.getColor().equals(this.getColor())&&O.getCreateTime().equals(this.getCreateTime()))
		return 1;
		else
		return -1;
	}
	@Override
	public Octagon clone()
	{
		Octagon o = new Octagon(this.getColor(),this.isFilled(),this.sides);
		o.setCreateTime(this.getCreateTime());
		return o;
	}
	public double getArea()
	{
		return 2*Math.sqrt(2)*sides*sides;
	}
	
	public double getPerimeter()
	{
		return 8*this.sides;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+ " sides = "+this.sides+" Area = "
	+this.getArea()+" Perimeter = "+ this.getPerimeter(); 
	}
	

	
}

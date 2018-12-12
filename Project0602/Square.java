package P602;
/*
 * 设计一个名为Square的类，它扩展GeometricObject并实现Colorable。
 * 实现howToColor以显示如何为方形着色的消息。
 * */
public class Square extends GeometricObject implements Colorable{
	private double side1,side2,side3,side4;
	public Square()
	{
		super("White",false);
		side1=1.0;
		side2=1.0;
		side3=1.0;
		side4=1.0;
	}
	public Square(String color,boolean isFilled,double side1,double side2)
	{
		super(color,isFilled);
		this.side1=side1;
		this.side2=side2;
		this.side3=side1;
		this.side4=side2;
	}

	@Override
	public void howToColor()
	{
		if(false==this.isFilled())
		System.out.println("不可上色");
		else
		System.out.println("Square已经上色，Square信息: "+ toString());
	}
	@Override
	public String toString()
	{
		return super.toString()+"\n"+"side1"+side1+"side2"+side2+"side3"+side3+"side4"+side4;
	}
}

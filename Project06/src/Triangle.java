/*
2.1.1设计一个名为Triangle的类，它扩展了GeometricObject。
该课程包含：
1.三个双数据字段，名为side1，side2和side3，默认值为1.0，表示三角形的三个边。
2.一个创建默认三角形的无参数构造函数。
3.一个构造函数，它使用指定的side1，side2和side3创建一个三角形。
4.所有三个数据字段的访问器方法。
5.一个名为getArea（）的方法，它返回此三角形的区域。
6.一个名为getPerimeter（）的方法，它返回此三角形的周长。
7.一个名为toString（）的方法，它返回三角形的字符串描述。
 * */
public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		super();
		this.side1=1.0;
		this.side2=1.0;
		this.side3=1.0;
	}
	
	public Triangle(double side1,double side2,double side3)
	{
		super();
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public Triangle(String color,boolean isFilled,double side1,double side2,double side3)
	{
		super(color,isFilled);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}

	//getters and setters
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	//一个名为getArea（）的方法，它返回此三角形的区域。
	public double getArea()
	{
		double p=(side1+side2+side3)/2;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}
	//一个名为getPerimeter（）的方法，它返回此三角形的周长。
	public double getPerimeter()
	{
		return side1+side2+side3;
	}
	//一个名为toString（）的方法，它返回三角形的字符串描述。
	//返回“Triangle：side1 =”+ side1 +“side2 =”+ side2 +“side3 =”+ side3;
	@Override
	public String toString()
	{
		return super.toString()+"\n"+"side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " +this.side3; 
	}	
}

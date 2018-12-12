/*
2.1.1���һ����ΪTriangle���࣬����չ��GeometricObject��
�ÿγ̰�����
1.����˫�����ֶΣ���Ϊside1��side2��side3��Ĭ��ֵΪ1.0����ʾ�����ε������ߡ�
2.һ������Ĭ�������ε��޲������캯����
3.һ�����캯������ʹ��ָ����side1��side2��side3����һ�������Ρ�
4.�������������ֶεķ�����������
5.һ����ΪgetArea�����ķ����������ش������ε�����
6.һ����ΪgetPerimeter�����ķ����������ش������ε��ܳ���
7.һ����ΪtoString�����ķ����������������ε��ַ���������
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
	
	//һ����ΪgetArea�����ķ����������ش������ε�����
	public double getArea()
	{
		double p=(side1+side2+side3)/2;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}
	//һ����ΪgetPerimeter�����ķ����������ش������ε��ܳ���
	public double getPerimeter()
	{
		return side1+side2+side3;
	}
	//һ����ΪtoString�����ķ����������������ε��ַ���������
	//���ء�Triangle��side1 =��+ side1 +��side2 =��+ side2 +��side3 =��+ side3;
	@Override
	public String toString()
	{
		return super.toString()+"\n"+"side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " +this.side3; 
	}	
}

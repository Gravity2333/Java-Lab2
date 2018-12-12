package P602;
/*
 * ���һ����ΪSquare���࣬����չGeometricObject��ʵ��Colorable��
 * ʵ��howToColor����ʾ���Ϊ������ɫ����Ϣ��
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
		System.out.println("������ɫ");
		else
		System.out.println("Square�Ѿ���ɫ��Square��Ϣ: "+ toString());
	}
	@Override
	public String toString()
	{
		return super.toString()+"\n"+"side1"+side1+"side2"+side2+"side3"+side3+"side4"+side4;
	}
}

import java.util.Date;
/*
 * ʵ���ࡣ��дһ�����Գ��򣬴���һ���߳�Ϊ1,1.5,1�������ζ���
 * ������ɫΪ��ɫ�����Ϊ�棬����ʾ�����ܳ�����ɫ�Լ��Ƿ���䡣
 * */
public class Demo01 {
	public static void main(String[] args)
	{
		Triangle triangle=new Triangle(1.0,1.5,1.0);
		triangle.setColor("Yellow");
		triangle.setFilled(true);
		System.out.println("�����εĻ�����ϢΪ:");
		System.out.println(triangle.toString());
	}
}



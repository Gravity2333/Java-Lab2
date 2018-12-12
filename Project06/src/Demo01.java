import java.util.Date;
/*
 * 实现类。编写一个测试程序，创建一个边长为1,1.5,1的三角形对象，
 * 设置颜色为黄色并填充为真，并显示区域，周长，颜色以及是否填充。
 * */
public class Demo01 {
	public static void main(String[] args)
	{
		Triangle triangle=new Triangle(1.0,1.5,1.0);
		triangle.setColor("Yellow");
		triangle.setFilled(true);
		System.out.println("三角形的基本信息为:");
		System.out.println(triangle.toString());
	}
}



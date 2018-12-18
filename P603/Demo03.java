package P603;

public class Demo03 {
	public static void main(String[] args) {
	Octagon o =new Octagon("White",true,5);
	System.out.println(o.toString());
	Octagon oCopy = o.clone();
		if(1==oCopy.compareTo(o))
		{
			System.out.println("相等");
			System.out.println("oCopy信息为: "+oCopy.toString());
		}
		else
		{
			System.out.println("不等");
			System.out.println("oCopy信息为: "+oCopy.toString());
		}
	}
	
}

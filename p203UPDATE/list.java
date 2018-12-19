package p203;

public class list {
	int[] p1score = new int[5];
	int[] p2score = new  int[5];
	char[] Rc1 =new char[5];
	char[] Rc2=new char[5];
	long[] time1 =new long[6];
	long[] time2=new long[6];
	public void show()
	{
		System.out.println(" Round      |               ThreadA                  |                ThreadB                  |");
		System.out.println("            |sleepTime|RandomCharacter|PointsObtained|sleepTime|RandomCharacter|PointsObtained |");
		for(int i=0;i<5;i++)
		System.out.println(" "+i+"          |   "+time1[i]+"      |"+p1score[i]+"              |"+Rc1[i]+"            |"+"    "+time2[i]+"    |"+p2score[i]+"              |"+Rc2[i]+"              |");
	}
}

package P602;
/*
��дһ�����Գ��򣬴���һ���������GeometricObject�����顣
���������е�ÿ������������ǿ���ɫ�ģ��������howToColor������
Howtocolor ���һ���ַ���
 */
public class Demo02 {
	public static void main(String[] args)
	{
		GeometricObject[] geometricObject =new GeometricObject[5];
		geometricObject[0] = new Square("White",true,1.0,2.0);
		geometricObject[1] = new Square("Yellow",false,1.0,3.0);
		geometricObject[2] = new Square("Red",false,4.0,2.0);
		geometricObject[3] = new Square("Blue",true,6.0,3.0);
		geometricObject[4] = new Square("Black",true,4.0,7.0);
		for(int i=0;i<5;i++)
		{
			if(true==geometricObject[i].isFilled())
			{
				if(geometricObject[i] instanceof Square)
				{
					Square s=(Square)geometricObject[i];
					s.howToColor();
				}
			}
		}
	}
	
}

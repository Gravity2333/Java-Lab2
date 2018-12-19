package p203;

public class Demo01 {
	public static void main(String[] args)
	{
		Object lock1=new Object();
		
		Player player1=new Player(lock1);
		Player2 player2=new Player2(lock1);
		player1.setPriority(10);
		player2.setPriority(10);
		Runnable j=new Judge1(player1,player2,lock1);
		Thread judge=new Thread(j);
		judge.setPriority(8);
		player1.start();
		player2.start();	
		judge.start();
	}
}

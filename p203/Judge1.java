package p203;

public class Judge1 implements Runnable{
	Player player1;
	Player2 player2;
	Object lock1;
	int count=0;
	public  Judge1(Player player1,Player2 player2,Object lock1){
		this.player1=player1;
		this.player2=player2;
		this.lock1=lock1;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			if(count==5)
			{
				if(player1.getScore()>player2.getScore())
					System.out.println("player1��ʤ");
				else if(player2.getScore()<player2.getScore())
					System.out.println("player2��ʤ");
				else {
					System.out.println("ƽ��");
				}
				System.exit(1);
			}
			while(player1.isTime()!=false||player2.isTime()!=false);
			synchronized(lock1)
			{
				if(player1.getRandomChar()>player2.getRandomChar())
				{
					player1.setScore(player1.getScore()+2);
					System.out.println("player1������");
				}
				else if(player1.getRandomChar()<player2.getRandomChar())
				{
					player2.setScore(player2.getScore()+2);
					System.out.println("player2������");
				}
				else
				{
					player1.setScore(player1.getScore()+1);
					player2.setScore(player2.getScore()+1);
					System.out.println("player1��player2����һ��");
				}
				count++;
				lock1.notifyAll();
				player1.setTime(true);
				player2.setTime(true);
				try {
					lock1.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		}
	}
}

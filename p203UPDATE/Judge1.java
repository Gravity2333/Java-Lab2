package p203;

public class Judge1 implements Runnable{
	Player player1;
	Player2 player2;
	Object lock1;
	list l;
	int count=0;
	public  Judge1(Player player1,Player2 player2,Object lock1,list l){
		this.player1=player1;
		this.player2=player2;
		this.lock1=lock1;
		this.l=l;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
	
			if(count==5)
			{
				if(player1.getScore()>player2.getScore())
					System.out.println("player1获胜");
				else if(player2.getScore()<player2.getScore())
					System.out.println("player2获胜");
				else {
					System.out.println("平局");
				}
				l.show();
				System.exit(1);
			}
			while(player1.isTime()!=false||player2.isTime()!=false);
			synchronized(lock1)
			{
				if(player1.getRandomChar()>player2.getRandomChar())
				{
					player1.setScore(player1.getScore()+2);
					System.out.println("player1得两分");
				}
				else if(player1.getRandomChar()<player2.getRandomChar())
				{
					player2.setScore(player2.getScore()+2);
					System.out.println("player2得两分");
				}
				else
				{
					player1.setScore(player1.getScore()+1);
					player2.setScore(player2.getScore()+1);
					System.out.println("player1与player2各得一分");
				}
				l.p1score[count]=player1.getScore();
				l.p2score[count]=player2.getScore();
				l.Rc1[count]=player1.getRandomChar();
				l.Rc2[count]=player2.getRandomChar();
				
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

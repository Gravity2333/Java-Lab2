package p203;

public class Player extends Thread{
	int score=0;
	Boolean isTime=false;
	char RandomChar;

	Object lock1;
	public Player()
	{
		
	}
	public Player(Object lock1)
	{
		
		this.lock1=lock1;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isTime() {
		return isTime;
	}
	public void setTime(boolean isTime) {
		this.isTime = isTime;
	}
	public char getRandomChar()
	{
		return RandomChar;
	}
	public char getChar()
	{
		int cache=(int)(Math.round(Math.random()*(25-1)+1));
		char RandomChar = (char) ('A'+cache);
		System.out.println(" "+RandomChar);
		return RandomChar;
	}
	@Override
	public void run()
	{isTime=true;
		while(true)
		{	
			synchronized(lock1) {
			RandomChar=getChar();
			
			
			try {
				System.out.println("wait...");
				lock1.notifyAll();
				
				lock1.wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				isTime=false;
				lock1.notifyAll();
			}
			
			while(isTime==false);
		}
	}


}

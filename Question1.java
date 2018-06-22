
public class Question1 implements Runnable{
	
	public synchronized void run()
	{
		for(int i=1;i<=1000;i++)
		{
			try {
				System.out.println(Thread.currentThread().getName() + " " + i);
				Thread.sleep(5);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		Question1 task = new Question1();
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		thread1.start();
		thread2.start();

	}

}

package Day11;

public class ThreadPrg1 implements Runnable { 
	Thread t; 
	public void run() 	{ 
		for (int i = 0; i < 4; i++)		{ 
			System.out.println(Thread.currentThread().getName() + " " + i); 
			try			{ 
				Thread.sleep(1500); // thread to sleep for 1000 milliseconds 
			}  catch (Exception e)		{ 
				System.out.println(e); 
			}		}	} 
public static void main(String[] args) throws Exception	{ 
		Thread t = new Thread(new ThreadPrg1()); 
		t.start(); 
		Thread t2 = new Thread(new ThreadPrg1()); 
		t2.start();
		
		System.out.println("main thread name :- "+t.getName());
	}	}

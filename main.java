public class main extends Thread {
	public void run()
	{
		System.out.println("Thread is Running");
	}
	public static void main(String args[]) 
		{
			main t1 = new main();
			t1.start();
	}

}

package timerTest5;

import java.util.Timer;
import java.util.TimerTask;

public class Test8 {
	
	static class MyTask extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out.println("begin timer = " + System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("end   timer = " + System.currentTimeMillis());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTask task = new MyTask();
		System.out.println("当前时间：    " + System.currentTimeMillis());
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, 3000, 2000);
	}

}


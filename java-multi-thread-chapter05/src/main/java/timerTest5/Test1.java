package timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test1 {
	
	static class MyTask extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out.println("begin timer = " + System.currentTimeMillis());
				Thread.sleep(1000);
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
		Calendar calendarRef = Calendar.getInstance();
		Date runDate = calendarRef.getTime();
		Timer timer = new Timer();
		timer.schedule(task, runDate, 3000);
	}

}

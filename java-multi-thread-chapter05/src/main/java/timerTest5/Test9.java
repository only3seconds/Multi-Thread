package timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test9 {
	
	static class MyTask extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("begin timer = " + new Date());
			System.out.println("end   timer = " + new Date());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTask task = new MyTask();
		System.out.println("现在执行时间： " + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
		Date runDate = calendarRef.getTime();
		System.out.println("计划执行时间： " + runDate);
		Timer timer = new Timer();
		timer.schedule(task, runDate, 2000);
	}

}

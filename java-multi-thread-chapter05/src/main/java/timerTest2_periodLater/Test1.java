package timerTest2_periodLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("当前时间为        " + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		System.out.println("计划时间为        " + runDate);
		
		MyTaskA task = new MyTaskA();
		Timer timer = new Timer();
		timer.schedule(task, runDate, 3000);
	}

}

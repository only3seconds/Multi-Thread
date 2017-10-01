package timerCancelError;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Calendar calendarRef1 = Calendar.getInstance();
		Date runDate1 = calendarRef1.getTime();
		
		while (true) {
			i++;
			Timer timer = new Timer();
			MyTaskA task1 = new MyTaskA(i);
			timer.schedule(task1, runDate1);
			timer.cancel();
		}

	}

}

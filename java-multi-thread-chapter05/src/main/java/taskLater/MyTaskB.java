package taskLater;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("B begin timer = " + new Date());
		System.out.println("B   end timer = " + new Date());
	}

}

package timerTaskCancelMethod;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("B run timer = " + new Date());
	}

}

package timerCancelMethod;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("A run timer = " + new Date());
	}

}

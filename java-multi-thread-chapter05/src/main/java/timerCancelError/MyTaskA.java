package timerCancelError;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {
	private int i;
	
	public MyTaskA(int i) {
		super();
		this.i = i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("第 " + i + "次没有被cancel取消");
	}

}

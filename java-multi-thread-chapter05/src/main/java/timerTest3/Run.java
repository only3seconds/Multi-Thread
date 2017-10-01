package timerTest3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
	
	static public class MyTask extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("运行了！ 时间为： " + new Date());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("当前时间为： " + new Date());
		timer.schedule(task, 7000);

	}

}

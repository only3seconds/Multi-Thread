package t14;

public class MyThread  extends Thread{
	public void run(){
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("在沉睡中被停止！进入catch!"+this.isInterrupted());
			e.printStackTrace();
			
		}
		
	}

}

package t15;

public class MyThread extends Thread{
	public void run(){
		super.run();
		try {
			for(int i=0;i<10;i++){
				System.out.println("i= "+(i+1));
			}
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("先停止，再遇到了sleep!进入catch!");
			e.printStackTrace();
			
		}
		
	}

}

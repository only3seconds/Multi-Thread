package joinLong;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join(2000);//只等2秒
			//Thread.sleep(2000);
			System.out.println("	end timer = " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

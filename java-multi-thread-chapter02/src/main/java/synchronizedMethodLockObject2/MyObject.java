package synchronizedMethodLockObject2;

public class MyObject {
	synchronized public void methodA(){
		try {
			System.out.println("begin methodA thread name = "+Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end time = "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized public void methodB(){
		try {
			System.out.println("begin methodB thread name = "+Thread.currentThread().getName()+
					" begin time ="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

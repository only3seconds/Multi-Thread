package singleton_3;

public class MyObject {
	
	private static MyObject myObject;
	
	private  MyObject() {
		
	}
	//
	synchronized public static MyObject getInstance() {
		try {
			if (myObject != null) {
				
			} else {
				//模拟在创建对象之前做一些准备工作
				Thread.sleep(3000);
				//虽然部分代码被上锁，但是还有非线程安全问题
				synchronized (MyObject.class) {
					myObject = new MyObject();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myObject;
	}
}

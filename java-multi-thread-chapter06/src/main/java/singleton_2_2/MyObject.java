package singleton_2_2;

public class MyObject {
	
	private static MyObject myObject;
	
	private  MyObject() {
		
	}
	//
	synchronized public static MyObject getInstance() {
		try {
			//此种方法等同于 synchronized public static MyObject getInstance()的方法，效率一样低，全部代码被上锁
			synchronized (MyObject.class) {
				if (myObject != null) {
				} else {
					//模拟在创建对象之前做一些准备性的工作
					Thread.sleep(3000);
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

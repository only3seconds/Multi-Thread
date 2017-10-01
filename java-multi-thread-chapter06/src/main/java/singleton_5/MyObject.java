package singleton_5;

public class MyObject {
	
	private volatile static MyObject myObject;
	private MyObject(){
		
	}
		//使用双检测机制解决问题，既保证了不需要同步代码的异步执行性，又保证了单列的效果
	public static MyObject getInstance() {
		try {
			if (myObject != null) {
				
			} else {
				//模拟在创建对象之前做一些准备工作
				Thread.sleep(3000);
				synchronized (MyObject.class) {
					if (myObject == null) {
						myObject = new MyObject();
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myObject;
	}

}

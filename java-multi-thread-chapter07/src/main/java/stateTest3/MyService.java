package stateTest3;

public class MyService {
	
	//synchronized 加到 static 方法是给 Class类上锁，Class锁可以对所有对象实例起作用
	synchronized static public void serviceMethod() {
		try {
			System.out.println(Thread.currentThread().getName() + "进入了业务方法！");
			Thread.sleep(10000);//10秒后才释放锁
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

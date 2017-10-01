package synMoreObjectStaticOneLock;

public class Service {
	//synchronized 加到 static 方法是给 Class 类上锁，Class锁可以对所有对象实例起作用
	synchronized public static void printA() {
		try {
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "进入printA");
			Thread.sleep(3000);
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "离开printA");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	//synchronized 加到 static 方法是给 Class类上锁，Class锁可以对所有对象实例起作用
	synchronized public static void printB() {
		System.out.println("线程名称为：" + Thread.currentThread().getName()
				+ "在" + System.currentTimeMillis() + "进入printB");
		System.out.println("线程名称为：" + Thread.currentThread().getName()
				+ "在" + System.currentTimeMillis() + "离开printB");
			
	}

}

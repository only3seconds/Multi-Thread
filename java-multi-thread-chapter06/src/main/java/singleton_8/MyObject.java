package singleton_8;

public class MyObject {
	
	private static MyObject instance = null;
	
	private MyObject() {
		
	}
	//静态代码块，在使用类的时候就已经执行了，类似于"饿汉模式"
	static {
		instance = new MyObject();
	}
	
	public static MyObject getInstance() {
		return instance;
	}
}

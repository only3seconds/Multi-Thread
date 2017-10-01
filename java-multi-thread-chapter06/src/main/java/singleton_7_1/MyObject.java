package singleton_7_1;

import java.io.Serializable;

public class MyObject implements Serializable  {
	private static final long serialVersionUID = 888L;//显示定义 serialVersionUID
	//内部类方式
	private static class MyObjectHandler {
		private static MyObject myObject = new MyObject();
	}
	
	private MyObject() {
		
	}
	
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}
	
	//在反序列化中使用 readResolve() 方法修改 readObject() 返回的对象,实现单例模式
	protected Object readResolve() throws InterruptedException{
		System.out.println("调用了 readRasolve 方法！");
		return MyObjectHandler.myObject;
	}
	
}

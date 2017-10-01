package threadLocal22;

public class ThreadLocalExt extends ThreadLocal {
	
	protected Object initialValue() {
		return "我是默认值 第一次get不再为null";
	}

}

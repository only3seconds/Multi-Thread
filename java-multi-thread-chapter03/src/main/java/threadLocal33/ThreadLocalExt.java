package threadLocal33;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
	
	protected Object initialValue() {
		return new Date().getTime();
	}

}

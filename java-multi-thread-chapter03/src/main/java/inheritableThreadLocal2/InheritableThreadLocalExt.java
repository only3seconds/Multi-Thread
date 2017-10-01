package inheritableThreadLocal2;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
	
	protected Object initialValue() {
		return new Date().getTime();
		
	}
	
	protected Object childValue(Object parentValue) {
		return parentValue + " 我在子线程加的 ～！";
	}

}

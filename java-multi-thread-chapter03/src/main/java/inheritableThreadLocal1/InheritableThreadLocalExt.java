package inheritableThreadLocal1;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
	
	protected Object initialValue() {
		return new Date().getTime();
		
	}

}

package t9;

import java.util.List;
import java.util.ArrayList;

public class MyOneList {
	private List list = new ArrayList();
	
	synchronized public void add(String data) {
		list.add(data);
	};
	
	synchronized public int getSize() {
		return list.size();
	};

}

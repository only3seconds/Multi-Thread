package TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	volatile private List list = new ArrayList();
	
	public void add() {
		list.add("潘平平");
	}
	
	public int size() {
		return list.size();
	}
}

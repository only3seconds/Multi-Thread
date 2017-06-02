package syn_Out_asyn;

public class MyThreadA extends Thread {
	private MyList list;
	
	public MyThreadA(MyList list) {
		super();
		this.list = list;
	}
	
	public void run() {
		for(int i = 0; i < 10000; i++){
			list.add("threadA" + (i + 1));
		} 
	}
}

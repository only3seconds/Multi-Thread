package syn_Out_asyn;

public class MyThreadB extends Thread{
	private MyList list;
	
	public MyThreadB(MyList list) {
		super();
		this.list = list;
	}
	
	public void run() {
		for(int i = 0; i < 10000; i++){
			list.add("threadB" + (i + 1));
		}
	}
}

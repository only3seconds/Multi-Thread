package waitOld;

public class ThreadAdd extends Thread {
	private Add add;
	
	public ThreadAdd(Add add) {
		super();
		this.add = add;
	}
	
	public void run() {
		add.add();
	}
}

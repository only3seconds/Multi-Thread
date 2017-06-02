package setNewProperitiesOneLock;

public class ThreadA extends Thread {
	private Service service;
	private Userinfo userinfo;
	
	public ThreadA(Service service, Userinfo userinfo) {
		super();
		this.service = service;
		this.userinfo = userinfo;
	}
	
	public void run() {
		service.serviceMethodA(userinfo);
	}
}

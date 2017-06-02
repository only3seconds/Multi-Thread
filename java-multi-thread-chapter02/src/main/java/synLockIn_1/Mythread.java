package synLockIn_1;

public class Mythread extends Thread{
	public void run(){
		Service service = new Service();
		service.service1();
	}
}

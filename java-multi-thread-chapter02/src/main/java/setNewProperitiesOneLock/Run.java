package setNewProperitiesOneLock;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Service service = new Service();
			Userinfo userinfo = new Userinfo();
			ThreadA a = new ThreadA(service, userinfo);
			a.setName("a");
			a.start();
			Thread.sleep(50);
			ThreadB b = new ThreadB(service, userinfo);
			b.setName("b");
			b.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

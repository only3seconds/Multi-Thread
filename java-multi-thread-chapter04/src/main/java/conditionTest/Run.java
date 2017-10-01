package conditionTest;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyService service = new MyService();
		MyThreadA a = new MyThreadA(service);
		a.start();
		MyThreadB b = new MyThreadB(service);
		b.start();

	}

}

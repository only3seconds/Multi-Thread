package joinTest1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread threadTest = new MyThread();
		threadTest.start();
		//Thread.sleep(?);
		System.out.println("我想当threadTest对象执行完毕后我再执行");
		System.out.println("但上面的sleep()中应该填多少呢？");
		System.out.println("答案是：根据不能确定：）");
	}

}

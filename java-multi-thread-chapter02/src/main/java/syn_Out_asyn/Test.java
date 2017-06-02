package syn_Out_asyn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList list = new MyList();
		MyThreadA a = new MyThreadA(list);
		a.setName("A");
		a.start();
		MyThreadB b = new MyThreadB(list);
		b.setName("B");
		b.start();
	}	

}

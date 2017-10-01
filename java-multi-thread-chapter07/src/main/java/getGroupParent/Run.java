package getGroupParent;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" 线程 " + Thread.currentThread().getName()
				+ " 所在线程组名称为： " + Thread.currentThread().getThreadGroup().getName());
		System.out.println(" main 线程所在的线程组的父线程组的名称为： "
				+ Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println(" main 线程所在的线程组的父线程组的父线程组的名称为： "
				+ Thread.currentThread().getThreadGroup().getParent().getParent().getName()); //Jvm的跟线程组就是system，再取其父线程组就会出现空异常
	}

}

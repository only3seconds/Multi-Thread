package autoAddGroup;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A 处线程： " + Thread.currentThread().getName()
				+ " 所属的线程组名称为： " + Thread.currentThread().getThreadGroup().getName() + " " 
				+ " 中有线程组数量： " + Thread.currentThread().getThreadGroup().activeGroupCount());//activeGroupCount() 当前线程组中子线程组的数量
		ThreadGroup group1 = new ThreadGroup("group1"); // 自动加到 main 组中
		ThreadGroup group2 = new ThreadGroup("group2");
		System.out.println("B 处线程:" + Thread.currentThread().getName()
				+  " 所属的线程组名为： " + Thread.currentThread().getThreadGroup().getName()
				+ " 中有线程数量： " + Thread.currentThread().getThreadGroup().activeGroupCount());
		
		ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);// 将当前线程组中的子线程组以复制的形式拷贝到 threadGroup 中
		
		for(int i =0 ; i < threadGroup.length; i++) {
			System.out.println("第" + (i + 1) + "个线程组名称为：" + threadGroup[i].getName());
		}
	}

}
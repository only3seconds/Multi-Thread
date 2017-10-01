package groupAddThreadMoreLevel;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//在 main 组中添加一个线程组 A 
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group = new ThreadGroup(mainGroup, "A");
		
		Runnable runnable = new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				try {
					System.out.println("runMethod!");
					Thread.sleep(10000); // 线程必须在运行状态才可以受组管理
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		// 在这个 A 组中添加对象 Z
		Thread newThread = new Thread(group, runnable);
		newThread.setName("Z");
		newThread.start(); // 线程必须启动然后才归到组 A 中
		
		// 方法 activeGroupCount() 和 activeCount() 的值是不固定的，是系统中环境的一个快照
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		System.out.println("main 线程中有多少个子线程组：" + listGroup.length + " 名字为：" + listGroup[0].getName());
		
		Thread[] listThread = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listThread);
		System.out.println(listThread[0].getName());
		
		
		
		
	}

}

package t12;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			MyThread thread =new MyThread();
			thread.start();
			Thread.sleep(10);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("是否停止1？ ="+thread.interrupted());
			System.out.println("是否停止2？ ="+thread.interrupted());
		}catch (InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
			
		}
		System.out.println(" end!");

	}

}

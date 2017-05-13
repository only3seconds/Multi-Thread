package countPriority;

public class ThreadA extends Thread{
	private int count=0;
	
	public int getCount(){
		return count;
	}
	
	public void run(){
		while(true){
			count++;
		}
	}

}

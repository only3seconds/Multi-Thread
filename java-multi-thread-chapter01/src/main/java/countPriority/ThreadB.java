package countPriority;

public class ThreadB extends Thread{
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


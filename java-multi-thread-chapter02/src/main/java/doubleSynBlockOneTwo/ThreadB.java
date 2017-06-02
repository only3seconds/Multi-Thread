package doubleSynBlockOneTwo;

public class ThreadB extends Thread{
	ObjectService service = new ObjectService();
	
	public ThreadB(ObjectService service){
		super();
		this.service = service;
	}
	
	public void run(){
		super.run();
		service.serviceMethodB();
	}
}

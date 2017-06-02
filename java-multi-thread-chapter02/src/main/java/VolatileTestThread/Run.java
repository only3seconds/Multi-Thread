package VolatileTestThread;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread[] mythreadArayy = new MyThread[100];
		for (int i = 0; i < 100; i++) {
			mythreadArayy[i] = new MyThread();
		}
		for (int i = 0; i < 100 ;i++) {
			mythreadArayy[i].start();
		}
	}

}

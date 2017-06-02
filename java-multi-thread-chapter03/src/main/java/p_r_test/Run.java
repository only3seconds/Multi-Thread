package p_r_test;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lock = new String();
		P p = new P(lock);
		C c =new C(lock);
		ThreadP pThread = new ThreadP(p);
		ThreadC cThread = new ThreadC(c);
		pThread.start();
		cThread.start();
	}

}

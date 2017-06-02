package t10;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStirng printStringService = new PrintStirng();
		new Thread(printStringService).start();
		printStringService.printStringMethod();
		System.out.println("我要停止它！ stopThread = "
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}

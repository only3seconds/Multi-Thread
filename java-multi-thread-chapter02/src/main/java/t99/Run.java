package t99;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStirng printStringService = new PrintStirng();
		printStringService.printStringMethod();
		System.out.println("我要停止它！ stopThread = "
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}

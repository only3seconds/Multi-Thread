package synchronizedBlockLockAll_2;

public class MyObject {
	synchronized public void speedPrintString() {
		System.out.println("speedPrintString__getLock time="
				+ System.currentTimeMillis() + "run ThreadName="
				+ Thread.currentThread().getName());
		System.out.println("---------------------");
		System.out.println("speedPrintString__releaseLock time="
				+ System.currentTimeMillis() + "run ThreadName="
				+ Thread.currentThread().getName());
	}
}

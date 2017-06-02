package wait_notify_insert_test;

public class BackupA extends Thread {

	private DBTools dbtools;
	
	public BackupA(DBTools dbtools) {
		super();
		this.dbtools = dbtools;
	}
	
	public void run() {
		dbtools.backupA();
	}
}

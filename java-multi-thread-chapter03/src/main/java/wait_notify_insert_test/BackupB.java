package wait_notify_insert_test;

public class BackupB extends Thread {
	
	private DBTools dbtools;
	
	public BackupB(DBTools dbtools) {
		super();
		this.dbtools = dbtools;
	}
	
	public void run() {
		dbtools.backupB();
	}
}

package formatOK2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
	
	private SimpleDateFormat sdf;
	private String dateString;
	
	public MyThread(SimpleDateFormat sdf, String dateString) {
		super();
		this.sdf = sdf;
		this.dateString = dateString;
	}
	
	public void run() {
		try {
			Date dateRef = DateTools.getSimpleDateFormat("yyyy-MM-dd").parse(dateString);
			String newDateString = DateTools.getSimpleDateFormat("yyyy-MM-dd").format(dateRef).toString();
			if (!newDateString.equals(dateString)){
				System.out.println("ThreadName = " + this.getName()
				+ "报错了 日期字符串为：" + dateString + " 转换成的日期为：" + newDateString);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

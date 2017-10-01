package formatOK1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
			Date dateRef = DateTools.parse("yyyy-MM-dd", dateString);
			String newDateString = DateTools.format("yyyy-MM-dd", dateRef).toString();
			if (!newDateString.equals(dateString)){
				System.out.println("ThreadName = " + this.getName()
				+ "报错了 日期字符串为：" + dateString + " 转换成的日期为：" + newDateString);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

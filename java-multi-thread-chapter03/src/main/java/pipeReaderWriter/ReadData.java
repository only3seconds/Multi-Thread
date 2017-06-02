package pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
	
	public void readMethod(PipedReader input) {
		try {
			System.out.println("read: ");
			char[] charArray = new char[20];
			int readLength = input.read(charArray);
			while (readLength != -1) {
				String newData = new String(charArray, 0, readLength);
				System.out.print(newData);
				readLength = input.read(charArray);
			}
			System.out.println();
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

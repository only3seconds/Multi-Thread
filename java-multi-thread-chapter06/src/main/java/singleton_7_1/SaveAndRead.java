package singleton_7_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAndRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//序列化过程
		try {
			MyObject myObject = MyObject.getInstance();
			FileOutputStream fosRef = new FileOutputStream(new File("myObjectFile.txt")); //序列化 myObject 保存到文件 myObjectFile.txt 中
			ObjectOutputStream oosRef = new ObjectOutputStream(fosRef); //自定义序列化
			oosRef.writeObject(myObject); //使用 writeObject 默认序列化方式
			oosRef.close();
			fosRef.close();
			System.out.println(myObject.hashCode());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//反序列化过程
		try {
			FileInputStream fisRef = new FileInputStream(new File("myObjectFile.txt"));
			ObjectInputStream oisRef = new ObjectInputStream(fisRef); //自定义反序列化
			MyObject myObject = (MyObject) oisRef.readObject(); //使用 readObject() 默认序列化方式 ，会创建新的对象返回
			oisRef.close();
			fisRef.close();
			System.out.println(myObject.hashCode());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

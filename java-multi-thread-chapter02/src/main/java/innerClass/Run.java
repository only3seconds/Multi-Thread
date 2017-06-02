package innerClass;

import innerClass.PublicClass.PrivateClass;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername() + " "
				+ publicClass.getPassword());
		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		System.out.println(privateClass.getAge() + " "
				+ privateClass.getAddress());

	}

}

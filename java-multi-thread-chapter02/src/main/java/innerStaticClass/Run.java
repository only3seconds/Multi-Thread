package innerStaticClass;
import innerStaticClass.PublicClass.PrivateClass;//即使是同包，静态类也要import

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername() + " "
				+ publicClass.getPassword());
		PrivateClass privateClass = new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		System.out.println(privateClass.getAge() + " "
				+ privateClass.getAddress());

	}

}

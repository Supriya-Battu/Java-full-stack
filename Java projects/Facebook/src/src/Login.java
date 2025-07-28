package src;

public class Login {
	public static void main(String[] args)
	{
		//User uo= new User ("rahul","1");
		User u = new  User();
		u.setUsername("Rahul");
		u.setPassword("111");
		System.out.println(u.getUsername());
		System.out.println( u.getPassword());
	}

}

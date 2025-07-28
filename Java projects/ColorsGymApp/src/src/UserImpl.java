package src;

public class UserImpl implements IUser
{
	private User users[];
	UserImpl()
	{
		users= new User[5];
	}
	@Override
	public boolean register(User user, int index) {
		// TODO Auto-generated method stub
		//System.out.println("USER INFO "+ user);
		users[index]=user;
		return false;
	}
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("user username & password is"+username+" "+password);
		for (User user:users)
		{
			if(user!=null)
			{
				if(user.getUsername().equals(username)&& user.getPassword().equals(password))
				{
					return true;
				}
			}
		}
		return false;
	}
}

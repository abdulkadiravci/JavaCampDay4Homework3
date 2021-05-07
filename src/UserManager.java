
public class UserManager implements UserService{

	@Override
	public void addUser(User user) {
		System.out.println("User saved");
	}

	@Override
	public void userUpdate(User user) {
		System.out.println("User updated");
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("User deleted");
	}
	
	

}

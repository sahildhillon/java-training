package users;

public class UserService {
	UserRepo urepo = new UserRepo();
	public void addUser(User user, String password) {
		if(urepo.getUsers().containsKey(user)) {
//			if(urepo.getUsers().get(user).equals(password))
			System.out.println("User already available.");
		}else {
			urepo.getUsers().put(user, password);
		}
	}
	
	public boolean validateUser(User user, String password) {
		if(urepo.getUsers().containsKey(user)) {
			if(urepo.getUsers().get(user).equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public void viewUsers(User user,String password) {
		if(user.getRole().equals("Admin")) {
			if(validateUser(user, password)) {
				System.out.println(urepo.getUsers());
			}
			else
				System.out.println("Admin not recognised.");
		}
	}
}

package users;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
	static Map<User,String> users;
	static {
		users = new HashMap<User,String>();
		users.put(new User(1,"Admin","Panshul"), "admin123");
		users.put(new User(1,"Peon","Raghav"), "peon123");
	}
	
	public  Map<User,String> getUsers() {
		return users;
	}
	
}

package users;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name");
		String uName = sc.next();
		System.out.println("Enter password");
		String uPwd = sc.next();
		
		UserService usrService = new UserService();
		
		
		usrService.viewUsers(new User(1,"Admin","Panshul"), uPwd);
		
	}
}

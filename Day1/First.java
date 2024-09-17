package assignment;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0;
		for(int x: args[0].toCharArray()) {
			ans = ans + x*x*x;
		}
		System.out.println(ans);

	}

}

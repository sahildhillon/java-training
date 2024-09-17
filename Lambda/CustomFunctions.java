package lambda_assignment;

public class CustomFunctions {
	public double power(double x, double y) {
		return Math.pow(x, y);
	}
	
	public String addSpace(String str) {
		char[] chars = str.toCharArray();
		String ans = "";
		for(int i=0;i<chars.length;i++) {
			if(i == chars.length - 1) {
				ans+=chars[i];
			}else ans+=chars[i]+" ";
		}
		return ans;
	}
	
	public boolean validateUser(String name, String pwwd) {
		if(name.equals("Raghav") && pwwd.equals("123")) return true;
		return false;
	}
	
	public int factorial(int x) {
		int ans = 1;
		for(int i=1;i<=x;i++) {
			ans=ans*i;
		}
		return ans;
	}
}

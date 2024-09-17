package lambda_assignment;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactorial obj = (x)->{
			int ans = 1;
			for(int i=1;i<=x;i++) {
				ans=ans*i;
			}
			return ans;
		};
		
		System.out.println(obj.factorial(10));
		
		CustomFunctions customFunctions = new CustomFunctions();
		
		
		IFactorial obj2 = customFunctions::factorial;
		System.out.println(obj2.factorial(15));
	}

}

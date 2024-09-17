package lambda_assignment;

public class Ques3 {
	public static void main(String[] args) {
		String uname="Aman";
		String upwd="123";
		
		IValidateUser obj = (name,pwwd)->{
			if(name.equals("Raghav") && pwwd.equals("123")) return true;
			return false;
		};
		
		System.out.println(obj.validate(uname, upwd));
		
		CustomFunctions customFunctions = new CustomFunctions();
		
		IValidateUser obj2 = customFunctions::validateUser;
		System.out.println(obj2.validate(uname, upwd));
	}
}

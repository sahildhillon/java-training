package lambda_assignment;


public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRaiseTo obj = (x,y)-> Math.pow(x, y);
		System.out.println(obj.raiseTo(2, 3));
		
		CustomFunctions customFunctions = new CustomFunctions();
		
		
		IRaiseTo obj2 = customFunctions::power;
		System.out.println(obj2.raiseTo(2, 4));
		
		
	}

}

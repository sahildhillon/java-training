package assignment;
//Exercise 7: Create a method to check if a number is an increasing number
//
//Method Name 	checkNumber 
//Method Description 	Check if a number is an increasing number 
//Argument 	int number 
//Return Type 	boolean 
//Logic 	A number is said to be an increasing number if no digit is exceeded by the digit to its left. 
//For Example : 134468 is an increasing number 

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] num = args[0].toCharArray();
		int n = Integer.parseInt(args[0]);
		System.out.println(checkNumber(n));
	}
	
	public static boolean checkNumber(int number) {
		boolean ans = true;
		int lastNum = number%10;
		while(number != 0) {
			number = number/10;
			int prevNum = number%10;
			if(prevNum>lastNum) {
				ans = false;
			}
			lastNum = prevNum;
		}
		return ans;
	}

}

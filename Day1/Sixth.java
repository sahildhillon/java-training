package assignment;
//Exercise 6: Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
//
//
//Method Name 	calculateDifference 
//Method Description 	Calculate the difference 
//Argument 	int n 
//Return Type 	int - Sum 
//Logic 	Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
//For Example if n is 10,you have to find 
//(1^2+2^2+3^2+….9^2+10^2)- 
//(1+2+3+4+5…+9+10)^2 

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int sum = calculateDifference(n);
		System.out.println(sum);
	}
	
	public static int calculateDifference(int n) {
		int sumOfSquares = 0;
		int squareOfSum = 0;
		for(int i=1;i<=n;i++) {
			sumOfSquares+=(i*i);
			squareOfSum+=i;
		}
		squareOfSum = squareOfSum*squareOfSum;
		return sumOfSquares - squareOfSum;
	}

}

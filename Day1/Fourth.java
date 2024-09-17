package assignment;
//Exercise 4: Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?


public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		outer:
		for(int i=2;i<=n;i++) {
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					continue outer;
				}
			}
			System.out.println(i);
			
		}
	}

}

package assignment;

public class Third_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		System.out.println(fibo(n));
	}
	
	public static int fibo(int n) {
		if (n==0)
			return 0;
		else if (n==1 || n==2)
			return 1;
		else {
			return fibo(n-1) + fibo(n-2);
		}
	}

}

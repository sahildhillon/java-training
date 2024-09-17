package assignment;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int[] series = new int[n]; 
		if (n==0)
			System.out.println(0);
		if (n>0)
			series[0] = 1;
		if (n>1)
			series[1] = 1;
		for(int i=2;i<n;i++) {
			series[i] = series[i-1]+series[i-2];
		}			
		System.out.println(series[series.length-1]);
		
	}

}

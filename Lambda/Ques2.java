package lambda_assignment;

public class Ques2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		IFormatString obj = (x)->{
			char[] chars = x.toCharArray();
			String ans = "";
			for(int i=0;i<chars.length;i++) {
				if(i == chars.length - 1) {
					ans+=chars[i];
				}else ans+=chars[i]+" ";
			}
			return ans;
		};
		
		System.out.println(obj.formatString("Sahil"));
		
		CustomFunctions customFunctions = new CustomFunctions();
		
		IFormatString obj2 = customFunctions::addSpace;
		System.out.println(obj2.formatString("Sahil"));
		
	}

}

package assignmentList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ques2 {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		
		ls.add(23);
		ls.add(22);
		ls.add(24);
		ls.add(21);
		ls.add(223);
		ls.add(29);
		ls.add(2);
		ls.add(20);
		ls.add(0);
		ls.add(13);
		
		for(int x:ls) {
			if(x%2==1) System.out.println(x);
		}
		
		System.out.println("Min element");
		Collections.sort(ls);
		for(int i=0;i<1;i++) {
			System.out.println(ls.get(i));
		}
		
		Collections.sort(ls,(x,y)->y-x);
		System.out.println(ls);
	}
}

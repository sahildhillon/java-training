package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s = new HashSet<String>();
		s.add("A");
		s.add("AB");
		s.add("C");
		
		Iterator<String> it = s.iterator();
		String st = "";
		while(it.hasNext()) {
			st=st+it.next();
			System.out.println(st);			
		}
	}

}

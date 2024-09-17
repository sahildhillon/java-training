package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ques1 {
	public static void main(String[] args) {
		Set <String> s = new HashSet<String>();
		s.add("A");
		s.add("AB");
		s.add("C");
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
		
		
	}
}

package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ques3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Float> s = new HashSet<Float>();
		s.add(1.2f);
		s.add(1.3f);
		s.add(1.4f);
		
		Iterator<Float> it = s.iterator();
		Float st = 0f;
		while(it.hasNext()) {
			st=st+ it.next();
			System.out.println(st);			
		}
	}
}

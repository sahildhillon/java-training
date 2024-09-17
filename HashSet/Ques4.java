package assignment;

import java.util.HashSet;

public class Ques4 {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet<>(5);
		hs.add("ABC");
		hs.add("DEF");
		hs.add(new MyOwnClass(1));
		hs.add(new MyOwnClass(1));
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println(hs);
	}
}

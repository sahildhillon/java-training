package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class Ques5 {
	public static void main(String[] args) {
		
		System.out.println("\n\nHash Set\n");
		HashSet hs = new HashSet();
		hs.add("Abc");
		hs.add("Abcd");
		hs.add(new MyOwnClass2(1, "AMAN"));
		hs.add(new MyOwnClass2(2, "AMANS"));
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Object> iths = hs.iterator();
		
		while(iths.hasNext()) {
			System.out.println(iths.next());
		}
		
		System.out.println("\n\nLinked Hash Set\n");
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Abc");
		lhs.add("Abcd");
		lhs.add(new MyOwnClass2(1, "AMAN"));
		lhs.add(new MyOwnClass2(2, "AMANS"));
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		
		Iterator<Object> itlhs = hs.iterator();
		
		while(itlhs.hasNext()) {
			System.out.println(itlhs.next());
		}
		
		System.out.println("\n\nArray List\n");
		
		
		List arr = new ArrayList();
		arr.add("Abc");
		arr.add("Abcd");
		arr.add(new MyOwnClass2(1, "AMAN"));
		arr.add(new MyOwnClass2(2, "AMANS"));
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		Iterator<Object> itarr = arr.iterator();
		
		while(itarr.hasNext()) {
			System.out.println(itarr.next());
		}
		
	}
}

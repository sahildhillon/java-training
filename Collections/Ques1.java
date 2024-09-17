package assignmentList;

import java.util.ArrayList;	
import java.util.Collections;
import java.util.List;

public class Ques1 {
	public static void main(String[] args) {
		List<Student> ls = new ArrayList<Student>();
		ls.add(new Student("Aman",33));
		ls.add(new Student("Rohit",35));
		ls.add(new Student("Mohit",34));
		ls.add(new Student("Tarun",38));
		ls.add(new Student("Palak",39));
		ls.add(new Student("Raj",38));
		ls.add(new Student("Panshul",99));
		
		Collections.sort(ls);
		for(int i=0;i<3;i++) {
			System.out.println(ls.get(i));
		}
		
	}
}

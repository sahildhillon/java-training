package assignmentList;

public class Student implements Comparable<Student> {
	private String name;
	private int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return o.marks - this.marks;
	}
	
	
	
	public String toString() {
		return name;
	}
//	
//	public int hashCode() {
//		System.out.println("===================");
//		return name.length();
//	}
//	public boolean equals(Object obj) {
//		System.out.println("********************");
//		if(obj instanceof Student && this.name==((Student)obj).name)
//			return true;
//		else
//			return false;
//	}
}

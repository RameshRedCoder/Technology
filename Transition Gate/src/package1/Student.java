package package1;

public class Student {
	String name;
	int rollno;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public int getRollno() {
		return rollno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("Ramesh");
		s.setRollno(123);
		System.out.println("Name :" + s.getName());
		System.out.println("Rollno :" + s.getRollno());
	}

}

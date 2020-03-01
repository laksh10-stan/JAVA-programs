package Tutorials;

public class Stud {
	String name;
	String age;
	static int NoofStudents=0;
		Stud(){
			NoofStudents++;
		}
		public static int getnoofstudents() {
			return NoofStudents;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
	this.age=age;
	}
	

}

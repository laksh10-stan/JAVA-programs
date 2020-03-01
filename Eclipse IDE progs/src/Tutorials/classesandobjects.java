package Tutorials;

public class classesandobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student mark=new Student();// mark is an object or instance
		mark.id=7220;
		mark.name="Mark Zux";
		mark.age=14;
		System.out.println(mark.name + " is " + mark.age + " years old.");
		
		Student tom=new Student();// tom is an object or instance
		tom.setId(2321);
		tom.setName("Tom Riddle");
		tom.setAge(23);
		System.out.println(tom.getName() + " is " + tom.getAge() + " years old. ");
		
	}

}
 class Student {
	
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}

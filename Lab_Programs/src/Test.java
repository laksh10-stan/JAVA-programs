class Vehicle {
String color="Orange";
String speed="234 km/hr";
void attributesprint()
{
System.out.println(color);
System.out.println(speed);
}
}
 class Car extends Vehicle{
String cc="1100 cc";
String gear="6 gears";
void attributescar()
{
System.out.println("Color is"+color);	
System.out.println("Speed is"+speed);
System.out.println("CC is"+cc);
System.out.println("Gear is"+gear);
}
}
public class Test {
	public static void main(String[] args) {
		Car c1=new Car();
	    c1.color=" Blue";
		c1.speed=" 123 km/hr";
		c1.cc=" 1100 cc";
		c1.gear=" 5 gear";
		c1.attributescar();	
	}
}

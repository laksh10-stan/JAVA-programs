package Tutorials;

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Cube cube1=new Cube();
    System.out.println(cube1.getCubeVolume());
    Cube cube2=new Cube(12,23,34);
    System.out.println(cube2.getCubeVolume());
	}

}
 class Cube {
int length;
int breadth;
int height;
public int getCubeVolume() {
	return(length*breadth*height);
}
Cube(){
	System.out.println("We are in Constructor");
	length=10;breadth=20;height=30;
}
Cube (int l,int b,int h){
	length=l;breadth=b;height=h;
}
}


package shape_game_project;

public class Rectangle extends TwoDShape {
	double length;
	double breadth;
	
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public void getArea() {
		System.out.println("Area of rectangle is : " + (length*breadth));
	}
	public void getPermiter() {
		System.out.println("Permiter of rectangle is : " + (2*(length + breadth)));
	}

}

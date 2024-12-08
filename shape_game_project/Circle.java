package shape_game_project;

public class Circle extends TwoDShape {
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	public void getArea() {
		System.out.println("Area of circle is : " + (Math.PI*radius*radius));
	}
	public void getPermiter() {
		System.out.println("Permiter of circle is : " + (2*Math.PI*radius));
	}

}

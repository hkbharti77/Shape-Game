package shape_game_project;

public class Cylinder extends ThreeDShape{
	double height;
	double radius;
	
	Cylinder(double height, double radius){
		this.height = height;
		this.radius = radius;
	}
	public void getVolume() {
		System.out.println("Volume of Cylinder is : " + (Math.PI*radius*radius*height));
	}
	public void getTSA() {
		System.out.println("Total Surface Area of  cylinder  is : " + (2*Math.PI*radius*(radius + height)));
	}
	public void getLSA() {
		System.out.println("Lateral Surface Area Of Cylinder is : " + (2*Math.PI*radius*height));
	}

}

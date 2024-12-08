package shape_game_project;

public class Cube extends ThreeDShape {
	double side;
	
	Cube(double side){
		this.side = side;
	}
	
	public void getVolume() {
		System.out.println("Volume of cube is : " + (side*side*side));
	}
	public void getTSA() {
		System.out.println("Total Surface Area of cube is : " + (6* side*side));
	}


}

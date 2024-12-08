package shape_game_project;

public class Sphere extends ThreeDShape{
	double r;
	Sphere(double r){
		this.r = r;
	}
	
	public void getVolume() {
		System.out.println("Volume of spher is : " + ((4*Math.PI*r*r*r)/3));
	}
	public void getTSA() {
		//double l = Math.sqrt((r*r) + (h*h));
		System.out.println("Total Surface Area of sphere is : " + (4*Math.PI*r*r));
	}
	


}

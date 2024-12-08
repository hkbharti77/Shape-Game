package shape_game_project;

public class Cone extends ThreeDShape{
	double r;
	double h;
	Cone(double r, double h){
		this.r = r;
		this.h = h;
	}
	public void getVolume() {
		System.out.println("Volume of cone is : " + ((Math.PI*r*r*h)/3));
	}
	public void getTSA() {
		double l = Math.sqrt((r*r) + (h*h));
		System.out.println("Total Surface Area of cone is : " + (Math.PI*r*(r + l)));
	}
	public void getLSA() {
		double l = Math.sqrt((r*r) + (h*h));
		System.out.println("Lateral Surface Area Of  is : " + (Math.PI*r*l) );
	}

}

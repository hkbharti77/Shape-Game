package shape_game_project;

public class Cuboid extends ThreeDShape {
	
	double w;
	double l;
	double h;
	
	Cuboid(double w, double l, double h){
		this.w = w;
		this.l = l;
		this.h = h;
	}
	
	public void getVolume() {
		System.out.println("Volume of cuboid is : " + (w*l*h));
	}
	public void getTSA() {
		System.out.println("Total Surface Area of cuboid is : " + (2*(l*w + l*h + w*h)));
	}
	public void getLSA() {
		System.out.println("Lateral Surface Area Of cuboid is : " + (2*h*(l + w)) );
	}


}

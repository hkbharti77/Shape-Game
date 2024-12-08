package shape_game_project;

public class Triangle extends TwoDShape {
	double a;
	double b;
	double c;
	
	Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public  boolean isTriangelValied() {
		if ((a + b > c) && (b + c > a) && (c + a > b)) {
			return true;
			
		}
		else {
			return false;
		}
	}
	public void getArea() {
		
		
		double sp = (a+b+c)/2; // semi-permiter of triangle.
		double area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
		System.out.println("Area of triangel is : " + area);
	}
	public void getPermiter() {
		double p = a+b+c;
		System.out.println("Permiter of triangle is : " + p);
	}

}

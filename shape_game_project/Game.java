package shape_game_project;
import java.util.*;
public class Game {
	Game(){
		System.out.println("======= Game Started ========");
	}
	
	public Shape selectShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for 2D Shape");
		System.out.println("Press 2 for 3D Shape");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Press 1 for circle");
			System.out.println("Press 2 for rectangle");
			System.out.println("Press 3 for square");
			System.out.println("Press 4 for triangle");
			int sampleChoice = sc.nextInt();
			
			if(sampleChoice == 1) {
				System.out.println("======= Circle ===========");
				System.out.print("Radius of circle is : ");
				double r = sc.nextDouble();
				Circle s = new Circle(r);
				s.getArea();
				s.getPermiter();
				return s;
			}
			else if(sampleChoice == 2) {
				System.out.println("======= Rectangle ===========");
				System.out.println("Length and Breadth of rectangle is : ");
				double l = sc.nextDouble();
				double b = sc.nextDouble();
				Rectangle r = new Rectangle(l,b);
				r.getArea();
				r.getPermiter();
				return r;
			}
			else if (sampleChoice == 3) {
				System.out.println("======= Square ===========");
				System.out.println("Side of Square is : ");
				double a = sc.nextDouble();
				//double b = sc.nextDouble();
				Square s = new Square(a);
				s.getArea();
				s.getPermiter();
				return s;
			}
			else if (sampleChoice == 4) {
				System.out.println("======= Triangle ===========");
				System.out.println("Sides  of triangle is : ");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double c = sc.nextDouble();
				Triangle t = new Triangle(a,b,c);
				t.getArea();
				t.getPermiter();
				return t;
			}
			else {
				System.out.println("Not valid Choice");
				return selectShape();
			}
		}
		else if(choice == 2) {
			System.out.println("Press 1 for cube");
			System.out.println("Press 2 for cuboid");
			System.out.println("Press 3 for sphere");
			System.out.println("Press 4 for cylinder");
			System.out.println("Press 5 for cone");
			int choice2 = sc.nextInt();
			
			if(choice2 == 1) {
				System.out.println("======= Cube ===========");
				System.out.println("Side of cube is ");
				double side = sc.nextDouble();
				Cube c = new Cube(side);
				c.getVolume();
				c.getTSA();
				c.getLSA();
				return c;
			}
			else if(choice2 == 2) {
				System.out.println("======= Cuboid ===========");
				System.out.println("Width , Length and Height of cuboid is ");
				double w = sc.nextDouble();
				double l = sc.nextDouble();
				double h = sc.nextDouble();
				
				Cuboid cu = new Cuboid(w,l,h);
				cu.getVolume();
				cu.getTSA();
				cu.getLSA();
				return cu;
			}
			else if(choice2 == 3) {
				System.out.println("======= Sphere ===========");
				System.out.println("Radius of Sphere is :");
				double radius = sc.nextDouble();
				Sphere sp = new Sphere(radius);
				sp.getVolume();
				sp.getTSA();
				sp.getLSA();
				return sp;
			}
			else if ( choice2 == 4) {
				System.out.println("======= Cylinder ===========");
				System.out.println("Height and Radius of cylinder is : ");
				double h = sc.nextDouble();
				double r = sc.nextDouble();
				Cylinder cy = new Cylinder(h,r);
				cy.getVolume();
				cy.getTSA();
				cy.getLSA();
				return cy;
			}
			else if (choice2 == 5) {
				System.out.println("======= Cone ===========");
				System.out.println("Height and Radius of cone is : ");
				double h = sc.nextDouble();
				double r = sc.nextDouble();
				Cone cone = new Cone(h,r);
				cone.getVolume();
				cone.getTSA();
				cone.getLSA();
				return cone;
			}
			else {
				System.out.println("Not valid Choice");
				return selectShape();
			}
			
		}
		return selectShape();
		
	}

}

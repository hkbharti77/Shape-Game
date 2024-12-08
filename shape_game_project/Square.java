package shape_game_project;

public class Square extends TwoDShape{
	double side;
	
	Square(double side){
		this.side = side;
	}
	
	public void getArea() {
		System.out.println("Area of square is : " + (side*side));
	}
	
	public void getPermiter(){
		System.out.println("Premiter of suare is : " + (4*side));
	}
	

}

package shape_game_project;
import java.util.*;
public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		Game g = new Game();
		do {
			Shape s = g.selectShape();
			System.out.println("Press Y/y for countine to anothe Shape");
			ch = sc.next().charAt(0);
			
		}
		while(ch=='Y'|| ch == 'y');
		
		System.out.println("=======Game is End =========");

	}

}

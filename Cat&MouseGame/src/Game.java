import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("** Cat의 Mouse 잡기 게임을 시작합니다. **");
		Cat c = new Cat(0, 0, 1);
		Mouse m = new Mouse(15, 6, 1);

		char[][] cc = new char[10][20];
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				if (i == c.getY() && j == c.getX()) System.out.print(c.getShape());
				else if (i == m.getY() && j == m.getX()) System.out.print(m.getShape());
				else System.out.print('-');
			}
			System.out.println(" ");
		}
		
		while (true) {
			System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			c.setCatMove(s.charAt(0));
			c.move();
			for(int i = 0; i < 10; i++) {
				for (int j = 0; j < 20; j++) {
					if (!c.collide(m)) {
						if (i == c.getY() && j == c.getX()) System.out.print(c.getShape());
						else if (i == m.getY() && j == m.getX()) System.out.print(m.getShape());
						else System.out.print('-');
					}
					else if(c.collide(m) && i == c.getY() && j == c.getX())	System.out.print(c.getShape());
					else System.out.print('-');
				}
				System.out.println(" ");
			}
			if (c.collide(m)) break;
			m.getCount();
			m.move();
		}
		System.out.println("Cat Wins!!");
	}

}

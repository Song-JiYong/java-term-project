import java.util.Random;

public class Mouse extends GameObject {
	private int count;
	private int left = 1;
	private int down = 2;
	private int up = 3;
	private int right = 4;
	private int MouseMove;
	
	public Mouse(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	
	public void getCount() {
		if (count == 11) count = 1;
		else count++;
	}
	
	@Override
	protected void move() {
		// TODO Auto-generated method stub
		if (count % 2 == 0 && count % 6 != 0) {
			Random rand = new Random(System.currentTimeMillis());
			MouseMove = rand.nextInt(5);
			if (MouseMove == left)
				x = (x > 0 ? x-distance : x);
			else if (MouseMove == down)
				y = (y < 9 ? y+distance : y);
			else if (MouseMove == up)
				y = (y > 0 ? y-distance : y);
			else if (MouseMove == right)
				x = (x < 19 ? x+distance : x);
		}
	}

	@Override
	protected char getShape() {
		// TODO Auto-generated method stub
		return 'm';
	}

}

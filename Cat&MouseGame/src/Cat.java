public class Cat extends GameObject {
	private char CatMove;
	private char left = 'a';
	private char down = 's';
	private char up = 'd';
	private char right = 'f';
	
	public Cat(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	public char getCatMove() {
		return CatMove;
	}

	public void setCatMove(char catMove) {
		CatMove = catMove;
	}

	@Override
	protected void move() {
		// TODO Auto-generated method stub
		if (CatMove == left) 
			x = (x > 0 ? x-distance : x);
		else if (CatMove == down) 
			y = (y < 9 ? y+distance : y);
		else if (CatMove == up)
			y = (y > 0 ? y-distance : y);
		else if (CatMove == right)
			x = (x < 19 ? x+distance : x);
	}
	

	@Override
	protected char getShape() {
		// TODO Auto-generated method stub
		return 'c';
	}

}

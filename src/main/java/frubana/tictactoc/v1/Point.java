package frubana.tictactoc.v1;

public class Point {
	private int x;
	private int y;
	
	
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
		
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point o = (Point) obj;
		return this.getX()== o.getX() && this.getY() == o.getY();
	}
	
	@Override
	public int hashCode() {
		return this.getX() + 10 * this.getY();
	}
	
	
}

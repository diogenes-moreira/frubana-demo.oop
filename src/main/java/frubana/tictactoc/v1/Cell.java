package frubana.tictactoc.v1;

import java.util.ArrayList;
import java.util.Collection;

public class Cell {

	private  Point point;
	private  Piece piece;
	private Collection<Solution> solutions;
	
	public Cell(int i, int j) {
		this.setPoint(new Point(i, j));
		this.setSolutions(new ArrayList<Solution>());
	}
	
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) throws BusyBoxException, WinException {
		if(this.getPiece()!= null) {
			throw new BusyBoxException();
		}
		for (Solution solution : solutions) {
			solution.evaluate();
		}
		this.piece = piece;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Collection<Solution> getSolutions() {
		return solutions;
	}

	public void setSolutions(Collection<Solution> solutions) {
		this.solutions = solutions;
	}

	public void addSolution(Solution solution) {
		this.getSolutions().add(solution);
	}
	
	
}

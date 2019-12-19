package frubana.tictactoc.v1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Board {
	
	Map<Point,Cell> cells;
	Collection<Solution> solutions;
 
	public Board() {
		cells = new HashMap<Point, Cell>();
		this.createCells();
		this.createSolutions();
	}
	
	private void createSolutions() {
		Solution sdd= new Solution();
		Solution sdi= new Solution();
		for(int i=0;i<3;i++) {
			Solution sh= new Solution();
			Solution sv= new Solution();
			for(int j=0;j<3;i++) { 
				sh.addCell(this.cells.get(new Point(i,j)));
				sv.addCell(this.cells.get(new Point(j,i)));
			}
			sdd.addCell(this.cells.get(new Point(i,i)));
			sdi.addCell(this.cells.get(new Point(i,2-i)));
			solutions.add(sv);
			solutions.add(sh);
		}
		solutions.add(sdd);
		solutions.add(sdi);
	}

	public void createCells() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;i++) {
				Cell cell = new Cell(i,j);
				cells.put(cell.getPoint(), cell);
			}
		}
	}
	
	public void putAt(int x, int y, Piece s) throws BusyBoxException, WinException {
		cells.get(new Point(x,y)).setPiece(s);
	}

	
	
}

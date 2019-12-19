package frubana.tictactoc.v1;


import java.util.Collection;
import java.util.HashSet;

public class Solution {

	public Solution() {
		cels = new HashSet<Cell>();
	}

	Collection<Cell> cels;

	public void addCell(Cell cell) {
		cels.add(cell);
		cell.addSolution(this);
	}

	public void evaluate() throws WinException {
		for (Cell cell : cels) {
			if(cell.getPiece()==null) {
				return;
			}
		}
		Piece first = null;
		for (Cell cell : cels) {
			if(first==null) {
				first=cell.getPiece();
			}else {
				if(!first.equals(cell.getPiece())) {
					return;
				}
			}
		}
		throw new WinException();
		
	}

}

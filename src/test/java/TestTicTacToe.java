import static org.junit.Assert.assertTrue;

import org.junit.Test;

import frubana.tictactoc.v1.Board;
import frubana.tictactoc.v1.BusyBoxException;
import frubana.tictactoc.v1.Circle;
import frubana.tictactoc.v1.Cross;
import frubana.tictactoc.v1.Piece;
import frubana.tictactoc.v1.TiedException;
import frubana.tictactoc.v1.WinException;

public class TestTicTacToe {
	
	@Test
	public void winTest() {
		Board b = new Board();
		Piece p = new Cross();
		try {
			b.putAt(0, 0, p);
			b.putAt(1, 1, p);
			b.putAt(2, 2, p);
		} catch ( WinException e) {
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
		}
		
	}

	@Test
	public void win2Test() {
		Board b = new Board();
		Piece p = new Cross();
		try {
			b.putAt(0, 2, p);
			b.putAt(1, 1, p);
			b.putAt(2, 0, p);
		} catch ( WinException e) {
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
		}
		
	}
	
	@Test
	public void win3Test() {
		Board b = new Board();
		Piece p = new Cross();
		try {
			b.putAt(0, 0, p);
			b.putAt(0, 1, p);
			b.putAt(0, 2, p);
		} catch ( WinException e) {
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
		}
		
	}

	@Test
	public void noWin4Test() {
		Board b = new Board();
		Piece cr = new Cross();
		Piece ci = new Circle();
		try {
			b.putAt(0, 0, ci);
			b.putAt(0, 1, cr);
			b.putAt(0, 2, ci);
		} catch (Exception e) {
			assertTrue(false);
		}
		
		assertTrue(true);
	}
	
	
	@Test
	public void TiedTest() {
		Board b = new Board();
		Piece cr = new Cross();
		Piece ci = new Circle();
		try {
			b.putAt(0, 0, ci);
			b.putAt(0, 1, ci);
			b.putAt(0, 2, cr);
			b.putAt(1, 0, cr);
			b.putAt(1, 1, cr);
			b.putAt(1, 2, ci);
			b.putAt(2, 0, ci);
			b.putAt(2, 1, cr);
			b.putAt(2, 2, cr);
		}catch(TiedException e) {
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
		}
	}
		@Test
	public void BusyTest() {
			Board b = new Board();
			Piece ci = new Circle();
			try {
				b.putAt(0, 0, ci);
				b.putAt(0, 0, ci);
			}catch(BusyBoxException e) {
				assertTrue(true);
			} catch (Exception e) {
				assertTrue(false);
			}
		
	}
	
	
}

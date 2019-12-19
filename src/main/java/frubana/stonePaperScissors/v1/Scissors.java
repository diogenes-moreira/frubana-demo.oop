package frubana.stonePaperScissors.v1;

public class Scissors extends State {

	private static Scissors soul;

	public static State instance() {
		if (soul == null) {
			soul = new Scissors();
		}
		return soul;
	}

	public boolean winsTo(State aState) {
		return aState.isPaper();
	}

	public boolean isScissors() {
		return true;
	}

	public boolean equals(Object aObject) {
		try {
			return ((State) aObject).isScissors();
		} catch (Exception a) {
			return false;
		}
	}

}
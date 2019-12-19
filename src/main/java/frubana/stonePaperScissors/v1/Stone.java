package frubana.stonePaperScissors.v1;

public class Stone extends State {

	private static Stone soul;

	public static Stone instance() {
		if (soul == null) {
			soul = new Stone();
		}
		return soul;
	}

	public boolean winsTo(State aState) {
		return aState.isScissors();
	}

	public boolean isRock() {
		return true;
	}

	public boolean equals(Object aObject) {
		try {
			return ((State) aObject).isStone();
		} catch (Exception a) {
			return false;
		}
	}

}
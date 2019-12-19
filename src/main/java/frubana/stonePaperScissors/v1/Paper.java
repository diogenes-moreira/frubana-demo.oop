package frubana.stonePaperScissors.v1;

public class Paper extends State {

	private static Paper soul;

	public static State instance() {
		if (soul == null) {
			soul = new Paper();
		}
		return soul;
	}

	public boolean winsTo(State aState) {
		return aState.isStone();
	}

	public boolean isPaper() {
		return true;
	}

	public boolean equals(Object aObject) {
		try {
			return ((Paper) aObject).isPaper();
		} catch (Exception a) {
			return false;
		}
	}

}

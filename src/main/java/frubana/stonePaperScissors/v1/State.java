package frubana.stonePaperScissors.v1;

public abstract class State {

	public abstract boolean winsTo(State aState);

	public boolean isPaper() {
		return false;
	}

	public boolean isStone() {
		return false;
	}

	public boolean isScissors() {
		return false;
	}

}

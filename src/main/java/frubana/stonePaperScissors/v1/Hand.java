package frubana.stonePaperScissors.v1;

public class Hand {

	private State myState;

	public Hand(State aState) {
		this.setState(aState);
	}

	public void setState(State aState) {
		this.myState = aState;
	}

	public State getState() {
		return this.myState;
	}

	public boolean tied(Hand aHand) {
		return this.getState().equals(aHand.getState());
	}

	public boolean winsTo(Hand oHand) {
		return this.getState().winsTo(oHand.getState());
	}

}
package checkers;

import checkers.Checker;

public class TrapChecker extends Checker {

	public TrapChecker() {
		this.img = "TrapChecker.png";
	}

	public void moveBackwards() {
		this.movePlayer(-1);
	}

}

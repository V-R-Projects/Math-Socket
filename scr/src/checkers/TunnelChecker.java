package checkers;

import checkers.Checker;

public class TunnelChecker extends Checker {

	public TunnelChecker() {
		this.img = "TunnelChecker.png";
	}

	public void moveForwards() {
		this.movePlayer(1);
	}

}

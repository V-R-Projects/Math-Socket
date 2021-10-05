package checkers;

import com.Player;


public class Checker {
	private int position;
	private boolean isPlayer;
	protected String img = null;

	public String getImg() {
		return img;
	}

	public void act(){

	}

	public void movePlayer(int steps, Player p) {
		p.movePlayer(steps);
	}


	public void reciveChallenge() {

	}
}

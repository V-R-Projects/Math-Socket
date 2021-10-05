package checkers;

import checkers.Checker;
import com.GameController;

import javax.swing.*;


public class ChallengeChecker extends Checker {
	
	private Object challengeList;

	public ChallengeChecker() {
		this.img = "ChallengeChecker.png";
	}

	@Override
	public void act() {
		moveForwards(true);
		JOptionPane.showMessageDialog(null, "Casilla Tunel, un espacio hacia adelante");
		GameController.get().draw();
	}

	public void sendChallenge() {
		int challengeNum = (int) Math.random()*10;
		//String challenge = challengeList.getChallenge(challengeNum);
		//Server.send(challenge);
	}
	
	public void reciveChallenge() {
		//Server.recive(response);
		boolean response = true;

		this.moveForwards(response);
	}
	
	public void moveForwards(boolean response) {
		if(response)
			this.movePlayer(1, GameController.get().getPlayer());
	}

}

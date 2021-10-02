package checkers;

import checkers.Checker;

public class ChallengeChecker extends Checker {
	
	private Object challengeList;

	public ChallengeChecker() {
		this.img = "ChallengeChecker.png";
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
			this.movePlayer(1);
	}

}

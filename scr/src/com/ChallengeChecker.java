package com;

public class ChallengeChecker extends Checker {
	
	private Object challengeList;
	
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

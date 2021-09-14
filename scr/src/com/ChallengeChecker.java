package com;

public class ChallengeChecker extends Checker {
	
	private object challengeList;
	
	public void sendChallenge() {
		int challengeNum = Math.random()*10;
		String challenge = challengeList.getChallenge(challengeNum);
		Server.send(challenge);
	}
	
	public void sendChallenge() {
		Server.recive(response);
		this.moveForwards(response);
	}
	
	public void moveForwards(boolean response) {
		if(response)
			this.movePlayer(1);
	}

}

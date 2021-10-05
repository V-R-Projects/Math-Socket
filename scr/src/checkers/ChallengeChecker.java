package checkers;

import Main.Data;
import checkers.Checker;
import com.ChallengeWindow;
import com.GameController;
import connection.Server;

import javax.swing.*;


public class ChallengeChecker extends Checker {
	
	private Object challengeList;

	public ChallengeChecker() {
		this.img = "ChallengeChecker.png";
	}

	@Override
	public void act() {
		Data.getInstance().window = null;
		Data.getInstance().window = new ChallengeWindow(Server.crearReto());

	}

	@Override
	public void reciveChallenge() {
		boolean response = Server.right_answer;

	}



	}

package checkers;

import checkers.Checker;
import com.GameController;

import javax.swing.*;


public class TunnelChecker extends Checker {

	public TunnelChecker() {
		this.img = "TunnelChecker.png";
	}

	@Override
	public void act() {
		moveForwards();
		JOptionPane.showMessageDialog(null, "Casilla Tunel, un espacio hacia adelante");
		GameController.get().draw();
	}

	public void moveForwards() {
		this.movePlayer(1, GameController.get().getPlayer());
	}

}

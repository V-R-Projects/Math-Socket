package checkers;

import checkers.Checker;
import com.GameController;

import javax.swing.*;


public class TrapChecker extends Checker {

	public TrapChecker() {
		this.img = "TrapChecker.png";
	}

	@Override
	public void act(){
		moveBackwards();
		JOptionPane.showMessageDialog(null, "Casilla Trampa, un espacio hacia atras");
		GameController.get().draw();
	}

	public void moveBackwards() {
		this.movePlayer(-1, GameController.get().getPlayer());
	}

}

package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		Popcorn pop = new Popcorn("");
	Microwave mic = new Microwave();
mic.putInMicrowave(pop);
	String flavor = JOptionPane.showInputDialog("what flavor do you want the popcorn to be?");
String m = JOptionPane.showInputDialog("How many minutes do you want to cook your popcorn?");
int mins = Integer.parseInt(m);
mic.setTime(mins);
mic.startMicrowave();
pop.eat();
pop.applyHeat();
pop.pause();

	}

}

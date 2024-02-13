package _11_binary_converter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		JPanel panel= new JPanel();
		JTextField answer = new JTextField(20);
		String convert(String input) {
		    if(input.length() != 8){
		        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		        return "-";
		    }
		    String binary = "[0-1]+";//must contain numbers in the given range
		    if (!input.matches(binary)) {
		        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
		        return "-";   
		    }
		    try {
		        int asciiValue = Integer.parseInt(input, 2);
		        char theLetter = (char) asciiValue;
		        return "" + theLetter;
		    } catch (Exception e) {
		        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		        return "-";
		    }
		}

		                                  

	}

}

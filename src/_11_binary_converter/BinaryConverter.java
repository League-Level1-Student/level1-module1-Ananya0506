package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
JFrame frame;
JPanel panel;
JTextField answer;
JLabel label;
JButton button;
	public static void main(String[] args) {
		BinaryConverter binary = new BinaryConverter();
		binary.run();
				
	}
		public void run() {
			frame = new JFrame();
			frame.setSize(800,800);
			frame.setVisible(true);
			panel = new JPanel();
			panel.setSize(800,800);
			answer = new JTextField(20);
		 label = new JLabel();
		 button = new JButton("convert");
			panel.add(answer);
			panel.add(label);
			panel.add(button);
			frame.add(panel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			button.addActionListener(this);
		
		}
		
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
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton buttonPressed = (JButton) e.getSource();
			String code = answer.getText();
			convert(code);
			System.out.println(convert(code));
	
		}

		                                  

	}



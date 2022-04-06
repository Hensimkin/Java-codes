package graphics;
import java.awt.*;
import javax.swing.*;
import animal.*;
import diet.*;
import food.*;
import mobility.*;
import plants.*;
import utilities.*;
import zoo.*;


public class ZooFrame extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Zoo");
		final JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}

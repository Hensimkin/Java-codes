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
		//JLabel label = new JLabel("Hello World");
		JButton file=new JButton();
		JButton background=new JButton();
		JButton help=new JButton();
		frame.setSize(800,600);//frame size
		file.setText("File");//set buttom name
		background.setText("background");
		//help.setText("help");
		file.setSize(100,100);//butoom size
		background.setSize(100,100);
		//help.setSize(100,100);
		file.setBounds(0,0,100,100);// buttom bounds
		background.setBounds(100,0,100,100);
		//help.setBounds(200,0,100,100);
		file.setVisible(true);//buttom visible
		background.setVisible(true);
		//help.setVisible(true);

		frame.add(file);
		frame.add(background);
		//frame.add(help);
		//frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setVisible(true);
		

	}

}

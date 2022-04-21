package graphics;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Food extends JFrame
{
	Food()
	{
		this.setLayout(null);
		this.setSize(400,250);
		this.setVisible(true);
		this.setTitle("Food for animals");
		JButton lettuce=new JButton("lettuce");
		lettuce.setBounds(10,150,100,40);
		this.add(lettuce);
		JButton cabbage=new JButton("Cabbage");
		cabbage.setBounds(130,150,100,40);
		this.add(cabbage);
		JButton meat=new JButton("Meat");
		meat.setBounds(250,150,100,40);
		this.add(meat);
	}
}

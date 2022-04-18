package graphics;
import mobility.*;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

/**
 * The class that take care of move animal option
 * @author Adir Melker 316614569 and Hen Simkin 208514109
 *
 */

public class MoveAnimalDialog extends JDialog implements ActionListener
{
	
	public MoveAnimalDialog()
	{
		this.setLayout(new GridLayout(4,1));
		this.setSize(400,200);
		this.setVisible(true);
		this.setTitle("Move Animal");
		String animals[]= {"Lion","Bear","Elephant","Giraffe","Turtle"};
		JLabel labelAnimal=new JLabel("select animal");
		this.add(labelAnimal);
		JComboBox allAniaml=new JComboBox (animals);
		allAniaml.addActionListener(this);
		this.add(allAniaml);
		JLabel labelX=new JLabel("enter x (0-800)");
		this.add(labelX);
		JTextField xFiled=new JTextField();
		this.add(xFiled);
		xFiled.addActionListener(this);
		JLabel labelY=new JLabel("enter y (0-600)");
		this.add(labelY);
		JTextField yFiled=new JTextField();
		this.add(yFiled);
		yFiled.addActionListener(this);
		JLabel finish=new JLabel("click to finish");
		this.add(finish);
		JButton move=new JButton("Move");
		this.add(move);
		move.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

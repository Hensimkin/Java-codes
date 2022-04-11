package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

import animal.Animal;

public class AddAnimalDialog extends JDialog implements ActionListener
{
	Animal []array=new Animal[10];
	JComboBox list;
	public AddAnimalDialog()
	{
		//super();
		String animals[]= {"Select Animal Type","Lion","Bear","Elephant","Giraffe","Turtle"};
		//this.setLayout(new GridLayout(1,2));
		this.setSize(300,100);
		this.setVisible(true);
		//this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setTitle("Add Animal");
		list=new JComboBox(animals);
		list.setBounds(10,10,20,40);
		list.addActionListener(this);
		this.add(list);
		JTextField field=new JTextField();
		//field.setPreferredSize(new Dimension(100,20));
		
		//field.setLayout(getLayout());
		JButton button=new JButton("submit");
		//field.setBounds(10,80,20,20);
		button.addActionListener(this);
		this.add(field,BorderLayout.SOUTH);
		//this.add(button);
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==list)
		{
			//System.out.println(list.getSelectedItem());
			
			if(list.getSelectedItem()=="Lion")
			{
				System.out.println("Lion");
			}
			
			if(list.getSelectedItem()=="Bear")
			{
				System.out.println("Bear");
			}
		}
	}
}

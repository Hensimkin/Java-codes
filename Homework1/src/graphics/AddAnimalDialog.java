package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import animal.*;

/**
 * The class that take care of add animal option
 * @author Adir Melker 316614569 and Hen Simkin 208514109
 *
 */
public class AddAnimalDialog extends JDialog implements ActionListener
{
	Animal object;
	JComboBox list;
	JComboBox hor;
	JComboBox ver;
	JComboBox color;
	JButton button;
	JTextField field;
	String type;
	int num1,num2,size;
	Color c;
	/**
	 * Default Contractor that add buttons to the panel 
	 */
	public AddAnimalDialog()
	{
		//super();
		button=new JButton("Accept");
		button.addActionListener(this);
		JLabel label=new JLabel("Choose animal");
		JLabel label2=new JLabel("Choose Horizontal speed");
		JLabel label3=new JLabel("Choose Vertical speed");
		JLabel label4=new JLabel("Enter size of animal 50-300");
		JLabel label5=new JLabel("Select the color of the animal");
		JLabel label6=new JLabel("Press to Finish");
		Integer numbers[]= {1,2,3,4,5,6,7,8,9,10};
		Integer numbers2[]= {1,2,3,4,5,6,7,8,9,10};
		String animals[]= {"Lion","Bear","Elephant","Giraffe","Turtle"};
		String colors[]= {"Natural","Blue","Red"};
		this.setLayout(new GridLayout(6,1));
		this.setSize(400,200);
		this.setVisible(true);
		this.setTitle("Add Animal");
		list=new JComboBox(animals);
		hor=new JComboBox(numbers);
		ver=new JComboBox(numbers2);
		list.addActionListener(this);
		color=new JComboBox(colors);
		field=new JTextField();
		this.add(label);
		this.add(list);
		this.add(label2);
		this.add(hor);
		this.add(label3);
		this.add(ver);
		this.add(label4);
		this.add(field);
		this.add(label5);
		this.add(color);
		this.add(label6);
		this.add(button);
		
	}

	/**
	 * check what the user select (which animal,horizontal and vertical speed,size color) 
	 */
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==list)
		{
			if(list.getSelectedItem()=="Lion")
			{
				type="Lion";
			}
			
			if(list.getSelectedItem()=="Bear")
			{
				type="Bear";
			}
			if(list.getSelectedItem()=="Elephant")
			{
				type="Elephant";
			}
			if(list.getSelectedItem()=="Giraffe")
			{
				type="Giraffe";
			}
			if(list.getSelectedItem()=="Turtle")
			{
				type="Turtle";
			}
		}
		if(e.getSource()==hor)
		{
			num1=(int) hor.getSelectedItem();
		}
		if(e.getSource()==ver)
		{
			num2=(int) ver.getSelectedItem();
		}
		if(e.getSource()==field)
		{
			size=Integer.parseInt(field.getText());
		}
		if(e.getSource()==color)
		{
			if(color.getSelectedItem()=="Blue")
			{
			   c=Color.blue;
			}
			if(color.getSelectedItem()=="Red")
			{
			   c=Color.red;
			}
			if(color.getSelectedItem()=="Red")
			{
			   c=null;
			}
		}
		if(e.getSource()==button)
		{
			if(type=="Lion")
			{
				object=new Lion(size,c,num1,num2);
			}
			dispose();
		}
	}
	
	
	public Animal getAnimal()
	{
		return null;
	}
}

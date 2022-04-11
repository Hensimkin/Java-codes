package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class AddAnimalDialog extends JDialog
{
	public AddAnimalDialog()
	{
		super();
		this.setSize(200,200);
		this.setVisible(true);
		this.setTitle("Add Animal");
	}
}

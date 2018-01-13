package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JButton addName = new JButton();
	JButton viewName = new JButton();
	
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	String name;
	String getName;
	
	ArrayList <String> names = new ArrayList();
	
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.createUI();
		
	}
	
	public void createUI()
	{
	frame.setVisible(true);
	panel.setVisible(true);
	
	addName.setText("Add Name");
	addName.addActionListener(this);
	addName.setVisible(true);
	
	viewName.setText("View Names");
	viewName.addActionListener(this);
	viewName.setVisible(true);
	
	frame.add(panel);
	panel.add(addName);
	panel.add(viewName);
	
	frame.pack();
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(addName))
		{
			name = JOptionPane.showInputDialog("Input a name");
			names.add(name);
		}
		if(e.getSource().equals(viewName))
		{
				for(int i = 0; i < names.size(); i++)
				{
					getName = names.get(i);
					System.out.println("Guest #" + (i + 1) + ": " + getName);
				}
							
					
		}
		
	}
	
	
}

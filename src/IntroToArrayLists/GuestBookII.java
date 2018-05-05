package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBookII implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton();
	JButton viewName = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	String currentName;
	int n = 0;
	String totalNames;
	
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	public static void main(String[] args) {
		GuestBookII g = new GuestBookII();
		g.creatUI();
	}
	
	
	public void creatUI()
	{
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.add(addName);
		panel.add(viewName);
		
		addName.setText("Add Name");
		addName.addActionListener(this);
		
		viewName.setText("View Names");
		viewName.addActionListener(this);
		
		frame.setVisible(true);
		panel.setVisible(true);
		addName.setVisible(true);
		viewName.setVisible(true);
		
		frame.pack();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addName)
		{
			currentName = JOptionPane.showInputDialog("Input a Name");
			names.add(currentName);
		}
		if(e.getSource() == viewName)
		{
			String s = formatNames(names);
			JOptionPane.showMessageDialog(null, s);
		}
		
	}
	
	public String formatNames(ArrayList<String> names)
	{
		for(String i: names)
		{
			n+=1;
			totalNames = totalNames + System.lineSeparator() + "Guest #" + n + ": " + i;
		}
		
		return totalNames;
	}

}

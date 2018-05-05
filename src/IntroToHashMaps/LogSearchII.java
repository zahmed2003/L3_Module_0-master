package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class LogSearchII implements ActionListener{
	
	/* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addEntry = new JButton();
	JButton search = new JButton();
	JButton viewList = new JButton();
	JButton removeEntry = new JButton();
	
	
	public void creatUI()
	{
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(addEntry);
		panel.add(removeEntry);
		panel.add(search);
		panel.add(viewList);
		
		addEntry.setText("Add Entry");
		addEntry.addActionListener(this);
		
		removeEntry.setText("Remove Entry");
		removeEntry.addActionListener(this);
		
		search.setText("Search by ID");
		search.addActionListener(this);
		
		removeEntry.setText("Remove Entry");
		removeEntry.addActionListener(this);
		
		frame.setVisible(true);
		panel.setVisible(true);
		
		
		frame.pack();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}

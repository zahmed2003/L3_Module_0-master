package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener{
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
	
	JButton addEntry = new JButton();
	JButton SearchByID = new JButton();
	JButton ViewList = new JButton();
	HashMap<String, Integer> logs = new HashMap<String, Integer>();
	
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	String name;
	String idS;
	Integer id;
	String searchS;
	Integer search;
	
	public static void main(String[] args) {
		LogSearch ls = new LogSearch();
		ls.createUI();
	}
	
	public void createUI()
	{
		
	frame.setVisible(true);
	panel.setVisible(true);
	
	addEntry.setText("Add Entry");
	addEntry.addActionListener(this);
	addEntry.setVisible(true);
	
	SearchByID.setText("Search by ID");
	SearchByID.addActionListener(this);
	SearchByID.setVisible(true);
	
	ViewList.setText("View List");
	ViewList.addActionListener(this);
	ViewList.setVisible(true);
	
	frame.add(panel);
	panel.add(addEntry);
	panel.add(SearchByID);
	panel.add(ViewList);
	
	frame.pack();
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(addEntry))
		{
			idS = JOptionPane.showInputDialog("Input an ID Number");
			id = Integer.parseInt(idS);
			
			name = JOptionPane.showInputDialog("Input a name");
			
			logs.put(name, id);
		}
		if(e.getSource().equals(SearchByID))
		{
		searchS = JOptionPane.showInputDialog("Input your ID");
		search = Integer.parseInt(searchS);
		for(Integer i: logs.values())
		{
			if(i == search)
			{
				JOptionPane.showMessageDialog(null, logs);
			}
		}
		}
		
	}
}

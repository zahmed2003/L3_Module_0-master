package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener{
	
JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	JLabel label = new JLabel("one towpver");
	
	Stack<String> character = new Stack<String>();
	
	public static void main(String[] args) {
		TextUndoRedo t = new TextUndoRedo();
		t.createUI();
	}
	
	public void createUI()
	{
		
	frame.setVisible(true);
	panel.setVisible(true);
	label.setVisible(true);
	
	frame.setSize(1000, 1000);
	
	frame.add(panel);
	panel.add(label);
	
	
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
}

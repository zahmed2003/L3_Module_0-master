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
	
	char keyPressed;
	char key;
	
	String keyString = "";
	String keyStringO = "";
	
	JLabel label = new JLabel(keyString);
	
	Stack<Character> character = new Stack<Character>();
	
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
	
	frame.addKeyListener(this);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		keyPressed = e.getKeyChar();
		
		if(keyPressed != KeyEvent.VK_BACK_SPACE && keyPressed != KeyEvent.VK_COMMA)
		{
		
		key = keyPressed;
		keyStringO = keyString;
		keyString = keyString + keyPressed;
		
		
		label.setText(keyString);
		}
		
		else if (keyPressed == KeyEvent.VK_BACK_SPACE)
		{
			label.setText("");
			label.setText(keyStringO);
			keyString = keyStringO;
			character.push(key);
			
		}
		
		else if (keyPressed == KeyEvent.VK_COMMA)
		{
			key = character.pop();
			keyString = keyString + key;
			label.setText(keyString);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
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

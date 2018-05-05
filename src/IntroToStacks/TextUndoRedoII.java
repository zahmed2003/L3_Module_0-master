package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;

public class TextUndoRedoII implements KeyListener{

	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> deleted = new Stack<String>();
	
	public static void main(String[] args) {
		TextUndoRedoII t = new TextUndoRedoII();
		t.createUI();
	}
	
	
	public void createUI()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		frame.setSize(500, 500);
		panel.add(label);
		
		frame.setVisible(true);
		panel.setVisible(true);
		label.setVisible(true);
		
		frame.addKeyListener(this);
		label.setEnabled(true);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() != KeyEvent.VK_BACK_SPACE && e.getKeyCode() != KeyEvent.VK_COMMA) {label.setText(label.getText() + e.getKeyChar());}
		else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
		{
		deleted.push(label.getText().substring(label.getText().length() - 1));
		label.setText(label.getText().substring(0, label.getText().length() - 1));
		}
		else {label.setText(label.getText() + deleted.pop());}
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

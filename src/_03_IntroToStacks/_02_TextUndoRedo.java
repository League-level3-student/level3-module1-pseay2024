package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class _02_TextUndoRedo implements KeyListener{
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
	Stack<Character> deleted = new Stack<Character>();
	JFrame jf;
	JButton jb;
	JLabel jl;
	
	_02_TextUndoRedo()
	{
		jf = new JFrame();
		jb = new JButton();
		jl = new JLabel();
		jf.setSize(100,100);
		jf.add(jb);
		jf.add(jl);
		jf.addKeyListener(this);
		jf.setVisible(true);
		jf.pack();
	}
	public static void main(String[] args) {
		new _02_TextUndoRedo();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		// TODO Auto-generated method stub
		if (e.getKeyChar() == 'u') undo();
		else if (e.getKeyCode() == 8) backSpace();
		else 
		{
			jl.setText(jl.getText() + e.getKeyChar());
		}
	}
	void undo()
	{
		
	}
	
	void backSpace()
	{
		deleted.add(jl.getText().substring(0, jl.getText().length() - 1));
		jl.setText(jl.getText().substring(0, jl.getText().length() - 1));
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

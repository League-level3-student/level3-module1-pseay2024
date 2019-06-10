package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener
{
	JFrame jf;
	JPanel jp;
	JLabel jl;
	String word = "";
	public static void main(String[] args)
	{
		HangMan hm = new HangMan();
		boolean living = true;
		while (living == true)
		{
			hm.setup();
			int words = hm.ask();
			Stack<String> ws = hm.search(words);
			hm.start();
			for (int i = 0; i < words; i++)
			{
				String curWord = ws.pop();
				hm.word = curWord;
			}
		}
	}
	
	void start()
	{
		jf.setVisible(true);
	}
	
	Stack<String> search(int w)
	{
		Stack<String> words = new Stack<String>();
		for (int i = 0; i < w; i++)
		{
			words.add(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		return words;
	}
	
	void setup()
	{
		jf = new JFrame();
		jp = new JPanel();
		jl = new JLabel();
		jf.add(jp);
		jp.addKeyListener(this);
		jp.add(jl);
		jf.setVisible(false);
	}
	
	int ask() { return Integer.parseInt(JOptionPane.showInputDialog("HOW MANY WORDS?")); }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

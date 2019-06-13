
package _04_HangMan;

import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	JFrame frame;
	JLabel label1, label2; 
	JPanel panel;
	String word;
	ArrayList<String> displayedWord, hiddenWord;
	int lives = 10;
	
	public void createUI() {
		frame  = new JFrame();
		label1 = new JLabel();
		label2 = new JLabel();
		panel = new JPanel();
		frame.add(panel);
		panel.add(label1);
		panel.add(label2);
		label1.setText(convert(hiddenWord));
		label2.setText("Lives: " + lives);
		frame.setVisible(true);
		frame.pack();
	}
	
	public void setUp() {
		int maxNum = 100;
		String number = JOptionPane.showInputDialog("Enter a number from 0 to " + maxNum);
		int num = Integer.parseInt(number);
		Stack<String> strings = new Stack<String>();
		for(int i = 0; i < num; i++) {
			String random = Utilities.readRandomLineFromFile("dictionary.txt");
			if(strings.contains(random)) {
				strings.pop();
				i--;
			}
			else {
				strings.push(random);
			}
		}
		word = strings.pop();
		displayedWord = new ArrayList<String>();
		hiddenWord = new ArrayList<String>();
		for(int i = 0; i < word.length(); i++) {
			displayedWord.add(word.substring(i, i + 1));
			hiddenWord.add("_");
		}
	}
	
	public String convert(ArrayList<String> array) {
		String returnedWord = "";
		for(int i = 0; i < array.size(); i++) {
			returnedWord = returnedWord + array.get(i);
		}
		return returnedWord;
	}
	
	public void playGame() {
		while(!(convert(hiddenWord).equals(word)) && (lives >= 0)) {
			boolean correctGuess = false;
			String guess = JOptionPane.showInputDialog("Enter a guess");
			for(int i = 0; i < displayedWord.size(); i++) {
				if(displayedWord.get(i).equals(guess)) {
					hiddenWord.set(i, displayedWord.get(i));
					label1.setText(convert(hiddenWord));
					correctGuess = true;
				}
			}
			if(correctGuess == false) {
				lives--;
				label2.setText("Lives: " + lives);
			}
		}
		if(lives < 0) {
			int answer = JOptionPane.showConfirmDialog(null, "Ran out of lives. Do you want to restart?", 
					"Message", JOptionPane.YES_NO_OPTION);
			if(answer == 0) {
				restart();
			}
		}
		if(convert(hiddenWord).equals(word)) {
			int answer = JOptionPane.showConfirmDialog(null, "You guessed the word. Do you want to restart?", 
					"Message", JOptionPane.YES_NO_OPTION);
			if(answer == 0) {
				restart();
			}
		}
	}
	
	public void restart() {
		lives = 10; 
		setUp();
		createUI();
		playGame();
	}
	
	public static void main(String[] args) {
		HangMan hang = new HangMan();
		hang.setUp();
		hang.createUI();
		hang.playGame();
	}
}
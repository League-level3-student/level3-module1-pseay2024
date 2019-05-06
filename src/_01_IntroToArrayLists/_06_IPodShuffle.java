package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	
	int sIndex;
	ArrayList<Song> songs;
	
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		songs = new ArrayList<Song>();
		songs.add(new Song("demo.mp3"));
		songs.add(new Song("demo.mp3"));
		
		sIndex = new Random().nextInt(2);
		
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		JButton jb = new JButton();
		jb.addActionListener(this);
		
		jf.add(jp);
		jp.add(jb);
		
		jf.pack();
		
		jb.setText("Surprise Me!");
		
		jf.setVisible(true);
		
		
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		songs.get(sIndex).play();
	}
}
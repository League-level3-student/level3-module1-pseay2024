package _01_IntroToArrayLists;

import java.util.ArrayList;

public class ListIterationC {
	/*
	 * Class song {
	 * 	double getDuration() {}
	 * }
	 * 
	 * ArrayList<Song> cd = new ArrayList<Song>();
	 * playlist.add(new Song("songA"));
	 * playlist.add(new Song("songB"));
	 * playlist.add(new Song("songC"));
	 * playlist.add(new Song("songD"));
	 * playlist.add(new Song("songE"));
	 * 
	 * double total = 0;
	 * 
	 * for (Song s : cd)
	 * {
	 * 		total += s.getDuration;
	 * }
	 * 
	 * return total;
	 */
	
	//pt 2:
	
	public static void main(String[] args) {
		ArrayList<Student2> ss = new ArrayList<Student2>();
		ss.add(new Student2("Blue", ""));
		ss.add(new Student2("Green", ""));
		ss.add(new Student2("Green", ""));
		double total = 0;
		for (Student2 s : ss)
		{
			total += s.getEyeColor();
		}
		// it is: total/ss.size();
	}
	
	//pt 3:
	
	/*
	 * class Pencil {
	 * 	boolean isBlunt();
	 * }
	 * ArrayList<Pencil> pencilCase;
	 * 
	 * int pencilsthatneedsharpening = 0;
	 * for (Pencil p : pencilCase)
	 * {
	 * 		if (p.isBlunt) pencilsthatneedsharpening++;
	 * 		
	 * }
	 * 
	 * return pencilsthatneedsharpening;
	 */
}

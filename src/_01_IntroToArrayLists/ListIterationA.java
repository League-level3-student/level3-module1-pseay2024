package _01_IntroToArrayLists;
import java.util.ArrayList;
import java.util.Random;

public class ListIterationA {
	public static void main(String[] args) {
		new ListIterationA();
	}
	class Pig { void feed(){} }
	class Bubble { void pop(){} }
	class Song { void play(){} }
	class Ornament {
		void hang()
		{
			String[] color = {"red","blue"};
			System.out.println("hanging an " + color[new Random().nextInt(2)] + " ornament");
		}
	}
	ListIterationA()
	{
		//tester
		ArrayList<Pig> theYard = new ArrayList<Pig>();
		ArrayList<Bubble> bubbleWrap = new ArrayList<Bubble>();
		ArrayList<Song> playlist = new ArrayList<Song>();
		ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();//in Decorator class

		boxOfDecorations.add(new Ornament());
		boxOfDecorations.add(new Ornament());
		boxOfDecorations.add(new Ornament());
		boxOfDecorations.add(new Ornament());
		boxOfDecorations.add(new Ornament());
		boxOfDecorations.add(new Ornament());
		boxOfDecorations.add(new Ornament());
		boxOfDecorations.add(new Ornament());
		boxOfDecorations.add(new Ornament());
		boxOfDecorations.add(new Ornament());
		boxOfDecorations.add(new Ornament());
		
		for ( Pig p : theYard)
		{
			p.feed();
		}
		for ( Bubble p : bubbleWrap)
		{
			p.pop();
		}
		for ( Song p : playlist)
		{
			p.play();
		}
		for ( Ornament p : boxOfDecorations)
		{
			p.hang();
		}
		
	}
}

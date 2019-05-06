package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class Puzzles {
	
	Puzzles()
	{
		//tester
		dinnerDecider();
	}
	
	public static void main(String[] args) {
		new Puzzles();
	}
	
	void arrayOverload()
	{
		ArrayList<String> ss = new ArrayList<String>();
		while(true)
		{
			ss.add("a;lkdjf;lkajdf;lkjas;fkj;lakj;flkjas;dlfkja;ldkjf;alkdsjf;lkajd;flkja;dlkfja;lkdsjf;alksdjf;lakjsdf;lkjas;dlkfj;alskdjf;lakjsdf;lkajsd;flkja;sdlkfj;alskdjf;alksdjf;laksjdf;lakjsd;flkjasd;lfkja;sldkfj;alskdjf;alksjdf;lakjsd;flkajsd;lfkja;sldkfj;alksdjf;lakjsd;flkajsd;lfkja;sdlkfj;alskdjf;alkjsdf;lakjsd;flkjas;dlkfja;lskdjf;laksdjf;laksjf;dlkaj");
		}
		//worked
	}
	
	void bandNameGenerator()
	{
		ArrayList<String> adjs = new ArrayList<String>();
		adjs.add("Slimy");
		adjs.add("Blind");
		ArrayList<String> ns = new ArrayList<String>();
		ns.add("Pants");
		ns.add("Bones");
		System.out.println("new band name: " + adjs.get(new Random().nextInt(adjs.size())) + " " + ns.get(new Random().nextInt(ns.size())));
	}
	
	void comedyCentral()
	{
		ArrayList<String> j = new ArrayList<String>();
		ArrayList<String> p = new ArrayList<String>();
		
		j.add("Why is nine afraid of seven?");
		p.add("because seven eight nine");
		
		j.add("endgame story");
		p.add("telling");
		
		int i = new Random().nextInt(2);
		System.out.println(j.get(i));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.get(i));
	}
	
	void dinnerDecider()
	{
		ArrayList<String> food = new ArrayList<String>();
		food.add("food a");
		food.add("food b");
		System.out.println(food.get(new Random().nextInt(2)));
	}
}

package _01_IntroToArrayLists;

import java.util.ArrayList;

public class ListIterationB {
 /* paper 
  ArrayList<Egg> carton = new ArrayList<Egg>();
  for (Egg e : carton)
  {
  	e.crack();
  }
  */ 
	public static void main(String[] args) {
		Classroom cr = new Classroom();
		cr.nerds = new ArrayList<Student>();
		cr.nerds.add(new Student(1000, "Preston"));
		cr.nerds.add(new Student(0, "Dead Person"));
		System.out.println(cr.getAverageIQ());
	}
	
}
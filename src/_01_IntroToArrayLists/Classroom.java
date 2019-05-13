package _01_IntroToArrayLists;

import java.util.ArrayList;

public class Classroom {
	
	ArrayList<Student> nerds;
	int getAverageIQ()
	{
		int total = 0;
		for (Student s : nerds)
		{
			total += s.subjectiveIntelligenceLevel;
		}
		return (int)total/nerds.size();
	}
}

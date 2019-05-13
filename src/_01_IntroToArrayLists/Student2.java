package _01_IntroToArrayLists;

public class Student2 {
	Student2 (String c, String n)
	{
		eyeColor = c;
		name = n;
	}
	private String eyeColor;
	private String name;
	double getEyeColor()
	{
		switch (eyeColor)
		{
		case "Blue":
			return 2.1;
		case "Green":
			return 2.2;
		case "Brown":
			return 2;
		default:
			return 2.1;
		}
	}
}

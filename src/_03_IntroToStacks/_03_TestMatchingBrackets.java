package _03_IntroToStacks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertEquals(doBracketsMatch("{}"), true);
		assertEquals(doBracketsMatch("{{}}"), true);
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<Character> stuffz = new Stack<Character>();
		for (Character c : b.toCharArray())
		{
			switch (c)
			{
			case '{':
				stuffz.add('{');
				break;
			case '}':
				if (stuffz.size() == 0) return false;
				stuffz.pop();
				break;
			default:
				break;
			}
		}
		if (stuffz.size() != 0) return false;
		return true;
	}

}
package seedu.addressbook.common;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class UtilsTest {

	@Test
	public void isAnyNullTrue() {
		ArrayList<String> allStrings = new ArrayList<String>();
		String nullString = null;
		allStrings.add(nullString);
		assertEquals(Utils.isAnyNull(nullString, allStrings), true);
	}
	
	@Test
	public void isAnyNullFalse() {
		ArrayList<String> allStrings = new ArrayList<String>();
		String emptyString = "";
		allStrings.add(emptyString);
		assertEquals(Utils.isAnyNull(allStrings, emptyString), false);
	}
	
	@Test
	public void elementsAreUniqueTrue() {
		ArrayList<String> allStrings = new ArrayList<String>();
		allStrings.add("abcdef");
		allStrings.add("abcd");
		allStrings.add("ab");
		assertEquals(Utils.elementsAreUnique(allStrings), true);
	}
	
	@Test
	public void elementsAreUniqueFalse() {
		ArrayList<String> allStrings = new ArrayList<String>();
		allStrings.add("abcdef");
		allStrings.add("abc");
		allStrings.add("ab");
		allStrings.add("abcdef");
		assertEquals(Utils.elementsAreUnique(allStrings), false);
	}

}
package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void null_object_returns_true() {
		String nullString = null;
		assertTrue(Utils.isAnyNull(nullString));
	}
	
	@Test
	public void null_object_returns_false() {
		String emptyString = "";
		assertFalse(Utils.isAnyNull(emptyString));
	}
	
	@Test
	public void unique_collections_return_true() {
		ArrayList<String> norepeats = new ArrayList<String>();
		norepeats.add("ee ");
		norepeats.add("l");
		norepeats.add("ee");
		assertTrue(Utils.elementsAreUnique(norepeats));
	}
	
	@Test
	public void nonunique_collections_return_false() {
		ArrayList<String> repeats = new ArrayList<String>();
		repeats.add("");
		repeats.add("l");
		repeats.add("");
		assertFalse(Utils.elementsAreUnique(repeats));
	}

}

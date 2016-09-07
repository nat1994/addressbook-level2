package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {
	
	/*
	 * This method inputs a null object and tests IsAnyNull and should return true
	 */
	@Test
	public void testIsAnyNull_NullObject() {
		Object nullItem = null;
		boolean testResult = Utils.isAnyNull(nullItem);
		assertTrue(testResult);
	}
	
	/*
	 * This method inputs an arraylist of integers and tests IsAnyNull method and should return false
	 */
	@Test
	public void testIfAnyNull_NonNullObject(){
		ArrayList<Integer> nonNullItem = new ArrayList<Integer>();
		nonNullItem.add(1);
		boolean testResult = Utils.isAnyNull(nonNullItem);
		assertFalse(testResult);
	}
	
	/*
	 * This method inputs both a null object and an arraylist of integers and tests IsAnyNull method and should return true
	 */
	@Test
	public void testIfAnyNull_SomeNullSomeNotNull(){
		ArrayList<Integer> nonNullItem = new ArrayList<Integer>();
		nonNullItem.add(2);
		Object nullItem = null;
		boolean testResult = Utils.isAnyNull(nonNullItem, nullItem);
		assertTrue(testResult);
	}
	
	/*
	 * This method inputs an arraylist of two unique integers and tests ElementAreUnique and should return true
	 */

	@Test
	public void testElementsAreUnique_AllElementsAreNotEqual() {
		ArrayList<Integer> weirdList = new ArrayList<Integer>();
		weirdList.add(1);
		weirdList.add(2);
		boolean testResult = Utils.elementsAreUnique(weirdList);
		assertTrue(testResult);
	}
	/*
	 * This method inputs an arraylist of two equal integers and tests ElementAreUnique and should true false
	 */
	@Test
	public void testElementsAreUnique_AllElementsAreEqual(){
		ArrayList<Integer> weirdList2 = new ArrayList<Integer>();
		weirdList2.add(1);
		weirdList2.add(1);
		boolean testResult = Utils.elementsAreUnique(weirdList2);
		assertFalse(testResult);
	}
}
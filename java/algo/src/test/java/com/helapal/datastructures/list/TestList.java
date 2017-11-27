package com.helapal.datastructures.list;

import org.junit.Assert;
import org.junit.Test;

import com.helapal.datastructures.api.List;

public class TestList {

	private void testE2E(List<String> strList) {		
		Assert.assertEquals(0, strList.size());
		
		//Test getting item at possition that is higher then max length
		try{
			@SuppressWarnings("unused")
			String nonExistent = strList.get(2);
			Assert.fail("Exception should have been thrown for wrong index");
		} catch (ArrayIndexOutOfBoundsException ex) {
			//Do nothing
		} catch (Exception e) {
			Assert.fail("Expected error was ArrayIndexOutOfBoundsException, but got" + e);
		}
		
		//Test getting item at possition that is a negative number
		try{
			@SuppressWarnings("unused")
			String nonExistent = strList.get(-2);
			Assert.fail("Exception should have been thrown for wrong index");
		} catch (ArrayIndexOutOfBoundsException ex) {
			//Do nothing
		} catch (Exception e) {
			Assert.fail("Expected error was ArrayIndexOutOfBoundsException, but got" + e);
		}
		
		
		for(int i = 1 ; i <= 10 ; i++) {
			strList.add("Possition" + i);
			Assert.assertEquals(i, strList.size());
		}
		
		for(int i = 1 ; i <= 10 ; i++) {
			Assert.assertEquals("Possition" + i, strList.get(i - 1));
		}
		
		//Test getting item at possition that is a negative number
		try{
			@SuppressWarnings("unused")
			String nonExistent = strList.get(-2);
			Assert.fail("Exception should have been thrown for wrong index");
		} catch (ArrayIndexOutOfBoundsException ex) {
			//Do nothing
		} catch (Exception e) {
			Assert.fail("Expected error was ArrayIndexOutOfBoundsException, but got" + e);
		}
		
		//Test getting item at possition that is higher then max length
		try{
			@SuppressWarnings("unused")
			String nonExistent = strList.get(12);
			Assert.fail("Exception should have been thrown for wrong index");
		} catch (ArrayIndexOutOfBoundsException ex) {
			//Do nothing
		} catch (Exception e) {
			Assert.fail("Expected error was ArrayIndexOutOfBoundsException, but got" + e);
		}
		
	}
	
	@Test
	public void testLinkedListE2E() {
		List<String> strList = new LinkedList<String>();
		testE2E(strList);
	}
}

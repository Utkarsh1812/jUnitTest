package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
//		fail("Not yet implemented");
		jUnitFunction obj = new jUnitFunction();
		int res = obj.addNumber(21,9);
		assertEquals(30,res);
	}

}

package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
//		fail("Not yet implemented");
		jUnitFunction obj = new jUnitFunction();
		String res = obj.addString("Taylor", "Swift");
	    assertEquals("TaylorSwift",res);
	}

}

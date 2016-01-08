package test;

import static org.junit.Assert.*;

import org.junit.Test;

import development.Solution1;

public class TestSolution1 {
	String message = "Hello";
	Solution1 solution1 = new Solution1(message);
	
	@Test
	public void testWriteGood() {

		assertEquals(message, solution1.writeGood());
	}

}

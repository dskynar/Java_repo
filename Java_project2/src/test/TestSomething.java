package test;

import org.junit.AfterClass;
import org.junit.Test;

public class TestSomething {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
    System.out.println("tested");
	}

}

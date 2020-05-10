package JUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class numbers {

	@Test
	public void test1() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(45, 98);
		assertEquals(143,result);
	}
	@Test
	public void test2() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(64, 32);
		assertEquals(48,result);
	}

}

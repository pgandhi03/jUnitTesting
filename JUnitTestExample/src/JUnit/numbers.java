package JUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class numbers {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(45, 98);
		assertEquals(143,result);
	}

}

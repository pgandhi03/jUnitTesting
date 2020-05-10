package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTesting junit=new jUnitTesting();
		String result=junit.addString("hello", "world");
		assertEquals("helloworld",result);
	}

}

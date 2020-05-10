package JUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class string {

	@Test
	public void test() {
		jUnitTesting junit=new jUnitTesting();
		String result=junit.addString("hello", "world");
		assertEquals("helloworld",result);
	}

}

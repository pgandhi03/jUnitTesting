package JUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class string {

	@Test
	public void test1() {
		jUnitTesting junit=new jUnitTesting();
		String result=junit.addString("hello", "world");
		assertEquals("helloworld",result);
	}
	@Test
	public void test2() {
		jUnitTesting junit=new jUnitTesting();
		String result1=junit.addString("hello", "world");
		assertEquals("hello world",result1);
	}

}

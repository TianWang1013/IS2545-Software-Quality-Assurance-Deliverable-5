package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testIncrement {

	@Test
	public void testIncrement() {
		Foo foo = new Foo();
		for (int i = 0; i < 3; i++)
		foo.incrementMeow();
		assertEquals(foo.meow, 3);
	}

}

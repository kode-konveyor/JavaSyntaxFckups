package com.kodekonveyor.syntax;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntegerCache {

	@Test
	public void is_127_equal_to_127() {
		Integer a = 127;
		Integer b = 127;
		assertTrue(a == b);
	}

	@Test
	public void is_128_equal_to_128() {
		Integer a = 128;
		Integer b = 128;
		assertTrue(a == b);
	}

}

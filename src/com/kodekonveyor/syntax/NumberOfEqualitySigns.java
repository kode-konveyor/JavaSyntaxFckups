package com.kodekonveyor.syntax;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberOfEqualitySigns {

	@Test
	public void fourIsNotEqualFour() {
		int x = 4;
		assertEquals(true, x = 4);
	}
}

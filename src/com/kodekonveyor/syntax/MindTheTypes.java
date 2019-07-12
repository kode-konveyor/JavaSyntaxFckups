package com.kodekonveyor.syntax;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MindTheTypes {

	@Test
	public void integerIsNotEqualToDouble() {
		Integer a = 4;
		Double b = 4.0;
		assertEquals(a, b);
	}
}

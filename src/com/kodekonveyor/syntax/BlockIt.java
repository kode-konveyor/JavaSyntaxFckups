package com.kodekonveyor.syntax;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlockIt {

	@Test
	public void scopeOfIf() {
		int y = 0;
		int x = 5;
		if (x > 10)
			x -= 5;
			y = 1;
		assertEquals(0, y);

	}
}

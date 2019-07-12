package com.kodekonveyor.syntax;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MissingBreak {

	@Test
	public void switchWithoutBreak() {
		int x = 4;
		String text = "";
		switch (x) {
		case 4:
			text = "Four";
		case 3:
			text = "Three";
		case 2:
			text = "Two";
		}
		assertEquals("Four", text);
	}
}

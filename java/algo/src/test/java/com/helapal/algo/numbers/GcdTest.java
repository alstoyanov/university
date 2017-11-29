package com.helapal.algo.numbers;

import org.junit.Assert;
import org.junit.Test;

public class GcdTest {

	@Test
	public void TestGcdInt() {
		Assert.assertEquals(4, Gcd.calculate(8, 12));
		Assert.assertEquals(12, Gcd.calculate(24, 36));
		Assert.assertEquals(5, Gcd.calculate(125, 35));

		Assert.assertEquals(4, Gcd.calculate(new int[] { 8, 12, 16 }));
		Assert.assertEquals(5, Gcd.calculate(new int[] { 25, 35, 45 }));
	}
}

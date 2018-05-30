package com.helapal.algo.numbers.primes;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SieveOfEratosthenesTest {

	@Test
	public void test100() {
		List<Integer> primesInHundred = SieveOfEratosthenes.getPrimes(100);
		Assert.assertEquals(25, primesInHundred.size());
	}

	@Test
	public void test1000() {
		List<Integer> primesInHundred = SieveOfEratosthenes.getPrimes(1000);
		Assert.assertEquals(168, primesInHundred.size());
	}

	@Test
	public void test10000() {
		List<Integer> primesInHundred = SieveOfEratosthenes.getPrimes(10000);
		Assert.assertEquals(1229, primesInHundred.size());
	}

	@Test
	public void test100000() {
		List<Integer> primesInHundred = SieveOfEratosthenes.getPrimes(100000);
		Assert.assertEquals(9592, primesInHundred.size());
	}

	@Test
	public void test1000000() {
		List<Integer> primesInHundred = SieveOfEratosthenes.getPrimes(1000000);
		Assert.assertEquals(78498, primesInHundred.size());
	}

	@Test
	public void test10000000() {
		List<Integer> primesInHundred = SieveOfEratosthenes.getPrimes(10000000);
		Assert.assertEquals(664579, primesInHundred.size());
	}

	@Test
	public void testNthPrime() {
		Assert.assertEquals(29, SieveOfEratosthenes.getNthPrime(10));
		Assert.assertEquals(7919, SieveOfEratosthenes.getNthPrime(1000));
		Assert.assertEquals(104729, SieveOfEratosthenes.getNthPrime(10000));
	}
}

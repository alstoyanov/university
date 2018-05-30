package com.helapal.algo.numbers.primes;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
	public static List<Integer> getPrimes(int size) {
		List<Integer> result = new ArrayList<>();
		boolean[] sieve = new boolean[size];

		/*
		 * Start from 2 as it is the first prime number. Stop at the square root
		 * of the lenght. Any number that is not scratched (made to true) will
		 * be guaranteed to be a prime.
		 */
		for (int i = 2; i < Math.sqrt(size); i++) {
			if (!sieve[i]) {
				result.add(i);

				int traverseI = i;
				while (traverseI < size) {
					sieve[traverseI] = true;
					traverseI += i;
				}
			}
		}

		/*
		 * Add any not scratched number after the square of the array size to
		 * the list of primes.
		 */
		for (int i = (int) Math.sqrt(size) + 1; i < size; i++) {
			if (!sieve[i]) {
				result.add(i);
			}
		}

		return result;
	}

	public static int getNthPrime(int i) {
		int multiplier = 10;
		while (true) {
			List<Integer> primes = getPrimes(i * multiplier);
			if (primes.size() >= i) {
				return primes.get(i - 1);
			} else {
				multiplier *= 2;
			}
		}
	}
}

package com.helapal.algo.numbers.primes;

public class BasicPrimeNumber {

	public static boolean isPrime(int number) {
		if (number == 1)
			return false;
		if (number == 2)
			return true;

		boolean result = true;
		int sqrt = (int) Math.round(Math.sqrt(number));
		for (int i = 3; i <= sqrt; i += 2) {
			if (number % sqrt == 0) {
				result = false;
				break;
			}
		}

		return result;
	}

	public static int getNextPrime(int from) {
		for (int i = from + 1;; i++) {
			if (isPrime(i)) {
				return i;
			}
		}
	}
}

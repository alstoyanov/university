package com.helapal.algo.numbers;

import java.math.BigInteger;

public class Gcd {
	public static int calculate(int first, int second) {
		first = Math.abs(first);
		second = Math.abs(second);
		if (first < second) {
			int temp = first;
			first = second;
			second = temp;
		}

		int result = 1;
		while (second > 1) {
			if (first % second == 0) {
				result = second;
				break;
			}
			int temp = first;
			first = second;
			second = temp % second;
		}

		return result;
	}

	public static int calculate(int[] numbers) {
		int gcd = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			gcd = calculate(gcd, numbers[i]);
		}

		return gcd;
	}

	public static long calculate(long first, long second) {
		first = Math.abs(first);
		second = Math.abs(second);
		if (first < second) {
			long temp = first;
			first = second;
			second = temp;
		}

		long result = 1;
		while (second > 1) {
			if (first % second == 0) {
				result = second;
				break;
			}
			long temp = first;
			first = second;
			second = temp % second;
		}

		return result;
	}

	public static long calculate(long[] numbers) {
		long gcd = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			gcd = calculate(gcd, numbers[i]);
		}

		return gcd;
	}

	public static BigInteger calculate(BigInteger first, BigInteger second) {
		return first.gcd(second);
	}

	public static BigInteger calculate(BigInteger[] numbers) {
		BigInteger gcd = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			gcd = calculate(gcd, numbers[i]);
		}

		return gcd;
	}

}

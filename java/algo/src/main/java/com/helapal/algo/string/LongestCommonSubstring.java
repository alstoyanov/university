package com.helapal.algo.string;

import com.helapal.tagging.DynamicProgramming;

public class LongestCommonSubstring implements DynamicProgramming{
	
	public static int lcStr(String s1, String s2) {
		int lengths[][] = new int[s1.length()][s2.length()];
		int max = 0;

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					if (i * j == 0) {
						lengths[i][j] = 1;
					} else {
						lengths[i][j] = lengths[i - 1][j - 1] + 1;
						if (max < lengths[i][j]) {
							max = lengths[i][j];
						}
					}
				} else {
					lengths[i][j] = 0;
				}
			}
		}

		return max;
	}
}

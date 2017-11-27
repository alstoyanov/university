package com.helapal.algo.string;

import com.helapal.tagging.DynamicProgramming;

public class LongestCommonSubsequence implements DynamicProgramming{
	
	public static int longestPalindromSeq(String s) {
		return lcSeq(s, StringCommons.reverse(s));
	}

	public static int lcSeq(String s1, String s2) {
		int lengths[][] = new int[s1.length() + 1][s2.length() + 1];
		int max = 0;

		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					lengths[i][j] = Math.max(
							Math.max(lengths[i][j - 1], lengths[i - 1][j]) , 
							lengths[i - 1][j - 1] + 1);
					if (max < lengths[i][j]) {
						max = lengths[i][j];
					}
				} else {
					lengths[i][j] = Math.max(lengths[i][j - 1], lengths[i - 1][j]);
				}
			}
		}

		return max;
	}
}

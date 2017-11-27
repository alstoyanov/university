package com.helapal.dynamicprogramming;

import com.helapal.algo.string.LongestCommonSubsequence;
import com.helapal.algo.string.StringCommons;

public class LongestSequencePalindrom {

	public static int longestPalindrom(String s) {
		return LongestCommonSubsequence.lcSeq(s, StringCommons.reverse(s));
	}

}

package com.helapal.dynamicprogramming;

import com.helapal.algo.string.LongestCommonSubstring;
import com.helapal.algo.string.StringCommons;

public class LongestPalindrom {

	public static int longestPalindrom(String s) {
		return LongestCommonSubstring.lcStr(s, StringCommons.reverse(s));
	}

}

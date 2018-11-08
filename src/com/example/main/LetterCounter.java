package com.example.main;

public class LetterCounter {

	public LetterCounter() {

	}

	/**
	 * Return number in this txt, sequenced by ASCII values.
	 * 
	 * For example "abca" will return an int[256] array, which ret[97] = 2 ret[98] =
	 * 1 ret[99] = 1 for 'a''s value in ASCII is 97
	 * 
	 * @param txt : txt is where we count letters in
	 * @return: Return an array that hold count of the letter. The index of this
	 *          array is the ASCII number of the letter. If txt is empty or null, it
	 *          will return an array, which values set to 0.
	 */
	public int[] countOfChar(String txt) {
		int[] ret = new int[256];
		if (txt == null) {
			return ret;
		}
		for (int i = 0; i < txt.length(); i++) {
			ret[txt.charAt(i)]++;
		}
		return ret;
	}
}

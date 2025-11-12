package math;

import java.util.Arrays;

public class Anagram {

	private static boolean getResult(String s, String t) {

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		Arrays.sort(tChar);
		Arrays.sort(sChar);

		return Arrays.equals(sChar, tChar);
	}

	public static void main(String[] args) {

		System.out.println(getResult("listen", "silent"));
	}

}

package math;

import java.util.Arrays;

public class Anagram {

	private static boolean getProfit(String s, String t) {

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		boolean match = false;
		
		Arrays.sort(tChar);
		Arrays.sort(sChar);
		
		return Arrays.equals(sChar,tChar);
//		for(char ss:sChar) {
//			for(char tt:tChar) {
//				match = false;
//				System.out.println(ss +":" + tt);
//				if(ss==tt) {
//					match =  true;
//					break;
//				}
//			}
//			if(!match) {
//				break;
//			}
//		}
		
		//return match;
	}

	public static void main(String[] args) {

		System.out.println(getProfit("aga", "ag"));
	}
	
}

package math;

import java.util.*;

public class LongestSubString {

	private static List getResult(int[] t) {
		List<String> l = new ArrayList<String>();
		for(int i=0;i<t.length;i++) {
			for(int j=i+1;j<t.length;j++) {
				for (int k=j+1;k<t.length;k++) {
					if(t[i]+t[j]+t[k] == 0) {
						l.add("["+t[i]+","+t[j]+","+t[k]+"]");
					}
				}
			}
		}
		return l;
	}
	 
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(getResult(nums));
	}
	
//	private static List getResult(int[] t) {
//		List<String> l = new ArrayList<String>();
//		for(int i=0;i<t.length;i++) {
//			for(int j=i+1;j<t.length;j++) {
//				for (int k=j+1;k<t.length;k++) {
//					if(t[i]+t[j]+t[k] == 0) {
//						l.add("["+t[i]+","+t[j]+","+t[k]+"]");
//					}
//				}
//			}
//		}
//		return l;
//	}
}


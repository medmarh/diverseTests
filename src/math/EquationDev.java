package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EquationDev {

	public static void main(String[] args) {
		Integer arr[] = new Integer[]{ 12, 23, 12, 4, 5, 6, 4, 7, 8, 3, 9, 1, 2 };
		System.out.println(getResult(arr));

	}

	private static Boolean getResult(Integer[] nums) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(nums);
		
		Boolean b = false;
		int q ;
		Map map = new TreeMap();
		for (int j = 0; j < nums.length; j++) {
			Integer x = 0;
			q = nums[j];
			b = false;
			for (int i = j+1; i < list.size(); i++) {
				if (q == nums[i]) {
					b = true;
					x = q;
					//list.remove(i);
					break;
				} 
			}
			if(x != 0) { map.put(x, true);} else map.put(q, false);
		}
		System.out.println("les element qui se repetent: " + map);
//		for(int k = 0; k<t.size(); k++) {
//			System.out.println(t.get(k));
//		}
//		System.out.println("les element qui ne se repetent pas: ");
//		for(int k = 0; k<c.size(); k++) {
//			System.out.println(c.get(k));
//		}
		return b;
	}
}

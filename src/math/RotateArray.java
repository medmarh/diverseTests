package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class RotateArray {

	private static List<Integer> getResult(int k) {
		Integer[] numbers = { 0, 131, 0, -5, 2, 0 };

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));
		List<Integer> list2 = new ArrayList<Integer>();                    

		list2 = list.subList(k+1,list.size());
		list2.addAll(list.subList(0, k+1));
		return list2;
	}

	public static void main(String[] args) {

		System.out.println(getResult(2));
	}

}
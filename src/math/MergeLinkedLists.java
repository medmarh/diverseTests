package math;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeLinkedLists {

	private static List<Integer> getResult() {
		Integer[] numbers1 = {3,5,7};
		Integer[] numbers2 = {2,3,6};
		List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(numbers1));
		List<Integer> list2 = new LinkedList<Integer>(Arrays.asList(numbers2));
	
		list1.addAll(list2);
		list1.sort(Comparator.naturalOrder());
		return list1;
	}

	public static void main(String[] args) {

		System.out.println(getResult());
	}

}

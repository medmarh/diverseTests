package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

	private static Integer getResult() {
		Integer[] numbers = { 121, 131, 232, 4443, 12321, 123 };

		List<Integer> l = new ArrayList<Integer>(Arrays.asList(numbers));
		l.sort(Comparator.naturalOrder());

		return l.get(l.size()-2);
	}

	public static void main(String[] args) {

		System.out.println(getResult());
	}

}

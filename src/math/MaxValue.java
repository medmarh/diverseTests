package math;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxValue {

	public static void main(String[] args) {
		Integer[] numbers = { 121, 131, 232, 4443, 12321, 123 };
		int max = 0;

		for (int i = numbers.length; i > 0; i--) {
			max = Math.max(numbers[i - 1], max);
		}
		System.out.println(max);
		
		//using stream
		OptionalInt m = Arrays.stream(numbers).mapToInt(Integer::intValue)
				.max();
		System.out.println(m.orElseThrow(() -> new RuntimeException("Array is empty")));
	}
}

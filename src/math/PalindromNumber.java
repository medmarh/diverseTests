package math;

public class PalindromNumber {

	public static void main(String[] args) {
		Integer[] numbers = { 121, 131, 232, 4443, 12321, 123 };
		for (int i = numbers.length; i > 0; i--) {
			String p = new StringBuilder(numbers[i - 1].toString()).reverse().toString();
			if (Integer.parseInt(p) == numbers[i - 1]) {
				System.out.println(p);
			}
		}

	}
}

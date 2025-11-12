package math;

public class ReverseString {

	public static void main(String[] args) {
		String s = "myString";
		String reversedString = "";

		char[] charArray = s.toCharArray();
		for (int i = charArray.length; i > 0; i--) {
			reversedString = reversedString + charArray[i - 1];
		}
		System.out.println(reversedString);
		
		// using stringbuilder
		reversedString = new StringBuilder(s).reverse().toString();
		System.out.println(reversedString);
	}
}

// https://www.geeksforgeeks.org/recursion-practice-problems-solutions/

import java.util.ArrayList;

public class RecursionAlgorithms {
	public static void main(String[] args) {
//		System.out.println(palindromeNumber(12321, 0));
//		System.out.println(palindromeNumber(1451, 0));
//		System.out.println(palindromeNumber(2002, 0));
//
//		System.out.println("-".repeat(30));
//
//		System.out.println(palindromeString("12321", 0));
//		System.out.println(palindromeString("1451", 0));
//		System.out.println(palindromeString("2002", 0));
		
		printAllSubsets(new int[]{1, 2, 3}, 0, new boolean[]{false, false, false});
	}
	
	public static int fact(int n) {
		if (n <= 1)
			return 1;
		
		return n * fact(n - 1);
	}
	
	public static boolean palindromeNumber(int number, int index) {
		int length = (number + "").length();
		
		if (index >= length / 2)
			return true;
		
		int rightDigit = number % (int) Math.pow(10, index + 1);
		rightDigit /= (int) Math.pow(10, index);
		
		int leftDigit = number / (int) Math.pow(10, length - 1 - index);
		leftDigit %= 10;
		
		return (rightDigit == leftDigit) && (palindromeNumber(number, index + 1));
	}
	
	public static boolean palindromeString(String word, int index) {
		if (index >= word.length() / 2)
			return true;
		
		return (word.charAt(index) == word.charAt(word.length() - 1 - index)) && palindromeString(word, index + 1);
	}
	
	public static void printAllSubsets(int[] numbers, int index, boolean[] used) {
		if (index >= numbers.length) {
			System.out.print("{ ");
			for (int i = 0; i < numbers.length; i++)
				if (used[i])
					System.out.print(numbers[i] + " ");
			System.out.println("}");
			
			return;
		}
		
		used[index] = false;
		printAllSubsets(numbers, index + 1, used);
		
		used[index] = true;
		printAllSubsets(numbers, index + 1, used);
	}
}

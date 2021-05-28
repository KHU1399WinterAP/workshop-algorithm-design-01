public class SearchingAlgorithms {
	public static void main(String[] args) {
		System.out.println(linearSearch(new int[]{16, 4, 42, 23, 8, 15}, 23));
		System.out.println(binarySearch(new int[]{4, 8, 15, 16, 23, 42}, 23, 0, 5));
	}
	
	private static int linearSearch(int[] numbers, int key) {
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] == key)
				return i;
		
		return -1;
	}
	
	private static int binarySearch(int[] numbers, int key, int start, int end) {
		if (end < start)
			return -1;
		
		int middle = (start + end) / 2;
		
		if (key < numbers[middle])
			return binarySearch(numbers, key, start, middle - 1);
		
		if (key > numbers[middle])
			return binarySearch(numbers, key, middle + 1, end);
		
		return middle;
	}
}

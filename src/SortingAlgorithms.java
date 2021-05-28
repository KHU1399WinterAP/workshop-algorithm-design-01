// https://www.geeksforgeeks.org/sorting-algorithms/

public class SortingAlgorithms {
	public static void main(String[] args) {
		int[] numbers = {5, 4, 2, 1, 3};
		mergeSort(numbers, 0, numbers.length - 1);
		print(numbers);
	}
	
	private static void bubbleSort(int[] numbers) {
		int n = numbers.length;
		
		for (int i = 0; i < n; i++) {
			boolean hasChanged = false;
			
			for (int j = 0; j < n - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					
					hasChanged = true;
				}
			}
			
			if (!hasChanged)
				break;
		}
	}
	
	private static void selectionSort(int[] numbers) {
		int n = numbers.length;
		
		for (int i = 0; i < n; i++) {
			int index = 0;
			
			for (int j = 1; j < n - i; j++) {
				if (numbers[index] < numbers[j])
					index = j;
			}
			
			int temp = numbers[index];
			numbers[index] = numbers[n - 1 - i];
			numbers[n - 1 - i] = temp;
		}
	}
	
	private static void insertionSort(int[] numbers) {
		int n = numbers.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}
	
	private static void mergeSort(int[] numbers, int start, int end) {
		if (start == end)
			return;
		
		// Separation
		int length = end - start + 1;
		int middle = start + length / 2;
		
		mergeSort(numbers, start, middle - 1);
		mergeSort(numbers, middle, end);
		
		// Merge
		int i = start;
		int j = middle;
		int index = start;
		
		int[] result = new int[numbers.length];
		System.arraycopy(numbers, 0, result, 0, numbers.length);
		
		while (i <= middle - 1 && j <= end) {
			if (numbers[i] < numbers[j]) {
				result[index] = numbers[i];
				i++;
			} else {
				result[index] = numbers[j];
				j++;
			}
			
			index++;
		}
		
		while (i <= middle - 1) {
			result[index] = numbers[i];
			i++;
			index++;
		}
		
		while (j <= end) {
			result[index] = numbers[j];
			j++;
			index++;
		}
		
		numbers = result;
		System.arraycopy(result, 0, numbers, 0, numbers.length);
	}
	
	private static void print(int[] numbers) {
		System.out.print(numbers[0]);
		for (int i = 1; i < numbers.length; i++)
			System.out.print(", " + numbers[i]);
		System.out.println();
	}
}

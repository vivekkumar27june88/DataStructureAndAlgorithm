package dsa.sorting;

public class SelectionSort<T extends Comparable<T>> {

	void sort(T[] arr, boolean ascending) {

		for (int i = 0; i < arr.length; ++i) {
			int minOrMaxIndex = i;
			for (int j = i + 1; j < arr.length; ++j) {
				if ((ascending == true)
						&& (arr[j].compareTo(arr[minOrMaxIndex]) < 0)) {
					minOrMaxIndex = j;
				} else if ((ascending == false)
						&& (arr[j].compareTo(arr[minOrMaxIndex]) > 0)) {
					minOrMaxIndex = j;
				}
			}

			if (minOrMaxIndex != i) {
				T temp = arr[i];
				arr[i] = arr[minOrMaxIndex];
				arr[minOrMaxIndex] = temp;
			}
		}
	}

	static public void DriverProgramForSelectionSort() {

		Integer[] arr1 = new Integer[] {10, -7, 4, 9, 40, 100, 23, 1, -5, 40};
		System.out.printf("%20s", "Original Array is : ");
		for (Integer item : arr1) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");

		SelectionSort<Integer> ss = new SelectionSort<Integer>();
		ss.sort(arr1, true);

		System.out.printf("%20s", "Sorted Array is : ");
		for (Integer item : arr1) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");

		Integer[] arr2 = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.printf("%20s", "Original Array is : ");
		for (Integer item : arr2) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");

		ss.sort(arr2, true);

		System.out.printf("%20s", "Sorted Array is : ");
		for (Integer item : arr2) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");
	}
}

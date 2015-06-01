package dsa.sorting;

public class BubbleSort<T extends Comparable<T>> {

	/**
	 * @param arr
	 * @param ascending
	 */
	public void sort(T[] arr, boolean ascending) {

		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (ascending == true && (arr[i].compareTo(arr[j]) > 0)) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} else if (ascending == false && (arr[i].compareTo(arr[j]) < 0)) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public void sortOptimized(T[] arr, boolean ascending) {

		for (int i = 0; i < arr.length - 1; ++i) {
			boolean itemExchanged = false;
			for (int j = i + 1; j < arr.length; ++j) {
				if (ascending == true && (arr[i].compareTo(arr[j]) > 0)) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					itemExchanged = true;
				} else if (ascending == false && (arr[i].compareTo(arr[j]) < 0)) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					itemExchanged = true;
				}
			}
			
			if(itemExchanged == false) {
				break;
			}
		}
	}
	
	public static void DriverProgramForBubbleSort() {

		Integer[] arr1 = new Integer[] {10, -7, 4, 9, 40, 100, 23, 1, -5, 40};
		System.out.printf("%20s", "Original Array is : ");
		for (Integer item : arr1) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");

		BubbleSort<Integer> bs = new BubbleSort<Integer>();
		bs.sort(arr1, true);

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
		
		bs.sortOptimized(arr2, true);

		System.out.printf("%20s", "Sorted Array is : ");
		for (Integer item : arr2) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");
	}

}

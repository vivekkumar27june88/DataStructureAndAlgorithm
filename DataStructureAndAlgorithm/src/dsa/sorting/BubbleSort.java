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

		Integer[] arr1 = new Integer[10];
		arr1[0] = 10;
		arr1[1] = -7;
		arr1[2] = 4;
		arr1[3] = 9;
		arr1[4] = 40;
		arr1[5] = 100;
		arr1[6] = 23;
		arr1[7] = 1;
		arr1[8] = -5;
		arr1[9] = 40;
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
		
		Integer[] arr2 = new Integer[10];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		arr2[5] = 6;
		arr2[6] = 7;
		arr2[7] = 8;
		arr2[8] = 9;
		arr2[9] = 10;
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

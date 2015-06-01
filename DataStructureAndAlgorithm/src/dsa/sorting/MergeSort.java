package dsa.sorting;

public class MergeSort<T extends Comparable<T>> {

	public void sort(T[] arr, T[] sortedArr, int left, int right) {

		if (left < right) {

			int mid = (left + right) / 2;
			sort(arr, sortedArr, left, mid);
			sort(arr, sortedArr, mid + 1, right);
			merge(arr, sortedArr, left, mid + 1, right);
		}
	}

	public void merge(T[] arr, T[] sortedArr, int left, int mid, int right) {

		int sortedArrIndex = left;
		int leftEnd = mid - 1;
		int size = right - left;
		int l = left;
		while (left <= leftEnd || mid <= right) {
			if (left > leftEnd) {
				while (mid <= right) {
					sortedArr[sortedArrIndex++] = arr[mid++];
				}
				break;
			}

			if (mid > right) {
				while (left <= leftEnd) {
					sortedArr[sortedArrIndex++] = arr[left++];
				}
				break;
			}

			if (arr[left].compareTo(arr[mid]) <= 0) {
				sortedArr[sortedArrIndex++] = arr[left++];
			} else {
				sortedArr[sortedArrIndex++] = arr[mid++];
			}
		}
		
		for(int i = 0; i <= size; ++i){
			arr[l] = sortedArr[l];
			++l;
		}
	}

	static public void DriverProgramForMergeSort() {

		Integer[] arr1 = new Integer[] { 10, -7, 4, 9, 40, 100, 23, 1, -5, 40 };
		Integer[] sortedArr = new Integer[10];
		System.out.printf("%20s", "Original Array is : ");
		for (Integer item : arr1) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");

		MergeSort<Integer> ms = new MergeSort<Integer>();
		ms.sort(arr1, sortedArr, 0, arr1.length - 1);

		System.out.printf("%20s", "Sorted Array is : ");
		for (Integer item : sortedArr) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");

		Integer[] arr2 = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.printf("%20s", "Original Array is : ");
		for (Integer item : arr2) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");

		ms.sort(arr2, sortedArr, 0, arr2.length - 1);

		System.out.printf("%20s", "Sorted Array is : ");
		for (Integer item : sortedArr) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");
	}
}

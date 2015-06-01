package dsa.sorting;

public class InsertionSort<T extends Comparable <T>> {

	public void sort(T[] arr, boolean ascending) {

		for(int i = 1; i < arr.length; ++i) {
			
			T key = arr[i];
			int j = 0;
			for(j = i - 1; j >=0; --j) {
				if((ascending == true) && (arr[j].compareTo(key) > 0)) {
					arr[j+1] = arr[j];
				}
				else if((ascending == false) && (arr[j].compareTo(key) < 0)) {
					arr[j+1] = arr[j];
				}
				else {
					break;
				}
			}
			if(j+1 <= (i - 1)) {
				arr[j+1] = key;
			}
		}
	}
	
	static public void DriverProgramForInsertionSort() {

		Integer[] arr1 = new Integer[] {10, -7, 4, 9, 40, 100, 23, 1, -5, 40};
		System.out.printf("%20s", "Original Array is : ");
		for (Integer item : arr1) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");

		InsertionSort<Integer> is = new InsertionSort<Integer>();
		is.sort(arr1, true);

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
		
		is.sort(arr2, true);

		System.out.printf("%20s", "Sorted Array is : ");
		for (Integer item : arr2) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");
	}

}
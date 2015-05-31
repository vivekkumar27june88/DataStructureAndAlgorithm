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

		InsertionSort<Integer> is = new InsertionSort<Integer>();
		is.sort(arr1, true);

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
		
		is.sort(arr2, true);

		System.out.printf("%20s", "Sorted Array is : ");
		for (Integer item : arr2) {
			System.out.printf("%-5d", item);
		}
		System.out.println("");
	}

}
import dsa.sorting.BubbleSort;

public class DataStructureAndAlgorithm {

	public static void main(String[] args) {
		
		DataStructureAndAlgorithm sda = new DataStructureAndAlgorithm();
		sda.DriverProgramForBuubleSort();
	}

	void DriverProgramForBuubleSort() {

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

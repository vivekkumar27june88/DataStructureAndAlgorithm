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
}

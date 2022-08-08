package recursion;

public class QuickSort_3 {
	
	public static void swap(int arr[], int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	public static int partition(int arr[], int s, int e) {
		int pivot = arr[s], count = 0;
		for(int i = s+1; i <= e; i++) if(arr[i] < pivot) count++;
		int pivotIndex = s + count;
		swap(arr, s, pivotIndex);
		int i = s, j = e;
		while(i < pivotIndex && j > pivotIndex) {
			if(arr[i] < pivot) i++;
			else if(arr[j] >=  pivot) j--;
			else swap(arr, i++, j--);
		}
		return pivotIndex;
	}

	public static void quickSort(int arr[], int s, int e) {
		if(s >= e) return;
		int pivot = partition(arr, s, e);
		quickSort(arr, s, pivot-1);
		quickSort(arr, pivot+1, e);
	}
	public static void main(String[] args) {
		int arr[] = new int[] {1,9,8,-3,28,4,-3,92,10,5,7};
		quickSort(arr, 0, arr.length-1);
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");
	}
}

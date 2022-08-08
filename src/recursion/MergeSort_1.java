package recursion;

public class MergeSort_1 {
	public static void merge(int arr1[], int arr2[], int arr[]){
		int i = 0, j = 0, k = 0;
		while(i < arr1.length && j < arr2.length) {
			if((arr1[i] > arr2[j])) arr[k++] = arr2[j++];
			else arr[k++] = arr1[i++];
		}
		while(i < arr1.length) arr[k++] = arr1[i++];
		while(j < arr2.length) arr[k++] = arr2[j++];
    }
    
    public static void mergeSort(int arr[]){
    	if(arr.length <= 1) return;
    	int arr1[] = new int[arr.length/2];
    	int arr2[] = new int[arr.length- arr1.length];
    	for(int i = 0; i < arr1.length; i++) arr1[i] = arr[i];
    	for(int i = arr.length/2; i < arr.length; i++) arr2[i-arr.length/2] = arr[i];
    	mergeSort(arr1);
    	mergeSort(arr2);
    	merge(arr1,arr2, arr);
    }

	public static void main(String[] args) {
		int a[] = new int[]{1,2,3,5,2,1,8,9,4,6,8,3,5,2};
		mergeSort(a);
		for(int i = 0; i < a.length; i++) System.out.print(a[i]+" ");
	}
}

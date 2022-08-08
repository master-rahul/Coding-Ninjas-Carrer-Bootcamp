package recursion;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int value) {
		
		if(arr.length == 0) return -1;
		if(arr[arr.length/2] == value) return arr.length/2;
		else if(arr[arr.length/2] > value) {
			int arr1[] = new int[arr.length/2];
			for(int i = 0; i < arr.length/2; i++) arr1[i] = arr[i];
			int n = binarySearch(arr1, value);
			if(n == -1) return n;
			else return arr.length/2 - (arr.length/2 -n);
		}else {
			int arr1[];
			if(arr.length % 2 == 0) arr1 = new int[arr.length/2-1];
			else arr1 = new int[arr.length/2];
			for(int i = arr.length/2 +1; i < arr.length; i++) arr1[i-(arr.length/2)-1] = arr[i];
			int n = binarySearch(arr1, value);
			if(n == -1) return n;
			else return arr.length/2 +  n+1;
		}
		
	}
	public static int binarySearch(int arr[], int value, int start, int end) {
		if(start > end) return -1;
		if(arr[(start+end)/2] == value) return (start+end)/2;
		else if(arr[(start+end)/2] > value) return binarySearch(arr, value, start, (start+end)/2 -1);
		else return binarySearch(arr, value, (start + end)/2 +1, end);
	}
	
	public static void main(String[] args) {	
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(binarySearch(arr,4));
		System.out.println(binarySearch(arr,4, 0, 4));
	}
}

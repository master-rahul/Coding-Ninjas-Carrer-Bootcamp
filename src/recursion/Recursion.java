package recursion;

public class Recursion {
	
	public static int factorial(int n) {
		if(n == 0) return 1;
		return n * factorial(n-1);
	}
	
	public static int sumOfNNaturalNumber(int n) {
		if(n == 0) return 0;
		return n + sumOfNNaturalNumber(n-1);
	}
	
	public static void print1ToN(int n) {
		if(n == 0) return;
		print1ToN(n-1);
		System.out.print(n+" ");
	}
	
	public static int fibonacciSeries(int n) {
		if(n == 0 || n== 1) return n;
		return fibonacciSeries(n-1) + fibonacciSeries(n-2);
	}
	
	public static boolean checkSortedArray(int[] arr, int i) {
		if(i == arr.length -1) return true;
		if(arr[i] > arr[i+1]) return false;
		return checkSortedArray(arr,i+1);
	}
	
	public static boolean checkSortedArray(int[] arr) {
		if(arr.length == 1) return true;
		if(arr[0] > arr[1]) return false;
		int[] smallArray = new int[arr.length-1];
		for(int i = 1; i < arr.length; i++) smallArray[i-1] = arr[i];
		return checkSortedArray(smallArray);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(sumOfNNaturalNumber(10));
		print1ToN(5);
		System.out.println("\n"+fibonacciSeries(20));
		int arr[] =  new int[] {1,1,3,4,5,4};
		System.out.println(checkSortedArray(arr,0));
		System.out.println(checkSortedArray(arr));
	}
}

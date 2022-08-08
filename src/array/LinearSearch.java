package array;

import java.util.Scanner;

public class LinearSearch {
	public static Scanner s = new Scanner(System.in);
	public static int linearSearch(int arr[], int x) {
			for(int i = 0; i < arr.length; i++) if(x == arr[i]) return i;
	        return -1;
	 }
	public static int[] takeInput() {
		System.out.println("Enter size of array :");
		int size = s.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter element at "+i+"th index :");
			array[i] = s.nextInt();
		}
		return array;
	}
	public static void main(String[] args) {
		int arr[] = takeInput();
		int num = s.nextInt();
		System.out.println(linearSearch(arr,num));
		s.close();
	}
	public void he() {
		int a = s.nextInt();
		System.out.println(a);
	}

}

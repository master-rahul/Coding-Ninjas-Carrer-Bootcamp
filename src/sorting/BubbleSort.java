package sorting;

import java.util.Scanner;

public class BubbleSort {
	public static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		System.out.println("Enter size :");
		int size = s.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) array[i] = s.nextInt();
		return array;
		
	}
	public static void swap(int array[], int i , int j) {
		array[i] = array[i] + array[j];
		array[j] = array[i] - array[j];
		array[i] = array[i] - array[j];
	}
	public static void bubbleSort(int array[]) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]) swap(array, j , j+1);
			}
		}
	}
	public static void printArray(int array[]) {
		for(int i : array) System.out.print(i +" ");
	}
	public static void main(String[] args) {
		int array[] = takeInput();
		bubbleSort(array);
		printArray(array);
	}
}

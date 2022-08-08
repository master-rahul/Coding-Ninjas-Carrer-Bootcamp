package array;

import java.util.Scanner;

public class InsertionSort {
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

	public static void printArray(int array[]) {
		for(int i : array) System.out.print(i +" ");
		System.out.println();
	}
	public static void insertionSort1(int[] array) {
		for(int i = 1; i < array.length; i ++) {
			int j = i-1;
			while(j >= 0) {
				if(array[j] > array[i]) swap(array,i,j);
				else break;
				if(j == 0) break;
				i--;
				j--;
			}
		}	
	}
	public static void insertionSort2(int[] array) {
		for(int i = 1; i < array.length; i ++) {
			int j = i-1;
			int t = array[i];
			while(array[j] > t && j >= 0) array[j-- + 1] = array[i];
			array[j+1] = t;
		}	
	}
	public static void insertionSort(int[] array) {
	    	int maxSortedIndex = 0, minUnsortedIndex = maxSortedIndex + 1;
	        while(maxSortedIndex < array.length-1){
	            minUnsortedIndex = maxSortedIndex + 1;
	            int i = maxSortedIndex;
	            int j = minUnsortedIndex;
	            while(i >= 0){
	                if(array[i] > array[j]) swap(array, i, j);
	                else break;  
	                if(i == 0) break;
	                i--;
	                j--;
	            }
	            maxSortedIndex++; 
	        }
	    }
	public static void main(String[] args) {
		int array[] = takeInput();
		int array1[] = array;
		int array2[] = array;
		insertionSort(array);
		printArray(array);
		insertionSort1(array1);
		printArray(array1);
		insertionSort2(array2);
		printArray(array2);
	}
}

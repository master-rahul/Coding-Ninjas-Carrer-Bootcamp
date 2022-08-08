package array;
import java.util.Scanner;
public class SelectionSort {
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
	public static void selectionSort(int array[]) {
		int minIndex = -1, minValue = Integer.MAX_VALUE;
		for(int i = 0; i < array.length -1; i++) {
			minIndex = i;
			minValue = Integer.MAX_VALUE;
			for(int j = i; j < array.length; j++) {
				if(array[j] < minValue) {
					minIndex = j;
					minValue = array[j];
				}
			}
			if(i != minIndex) swap(array,i,minIndex);
		}
	}
	public static void printArray(int array[]) {
		for(int i : array) System.out.print(i +" ");
	}
	public static void main(String[] args) {
		int array[] = takeInput();
		selectionSort(array);
		printArray(array);
	}
}

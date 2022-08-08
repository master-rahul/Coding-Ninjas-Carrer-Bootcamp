package array;
import java.util.Scanner;

public class MergeSortedArray {
	public static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		System.out.println("Enter size :");
		int size = s.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) array[i] = s.nextInt();
		return array;
	}
	public static void printArray(int[] arr) {
        for (int element : arr) System.out.print(element + " ");
	        System.out.println();
	}
	public static int[] merge(int arr1[], int arr2[]) {
    	int array[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
    	while(i < arr1.length && j < arr2.length){
            if(arr1[i] >= arr2[j]) array[k++] = arr2[j++];
            else array[k++] = arr1[i++];
        }
        while(i < arr1.length) array[k++] = arr1[i++];
        while(j < arr2.length) array[k++] = arr2[j++];
        return array;
    }
	public static void main(String[] args) {
		int array[] = takeInput();
		int array1[] = takeInput();
		int array2[] = merge(array, array1);
		printArray(array2);
		
	}
}

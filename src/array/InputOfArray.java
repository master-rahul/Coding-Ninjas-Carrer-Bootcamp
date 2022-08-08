package array;
import java.util.Scanner;
public class InputOfArray {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = s.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter element at "+i+"th index :");
			array[i] = s.nextInt();
		}
		s.close();
		return array;
	}
	public static void printArray(int array[], int size) {
		for(int i = 0 ; i < size; i++) System.out.print(i +": "+array[i]+",  ");

	}
	public static void main(String[] args) {
		int arr[] = takeInput();
		printArray(arr,arr.length);
	}
	
}

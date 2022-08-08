package array;
import java.util.Scanner;
public class LargestOfN {
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
	public static int findMaximum(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) if(max < arr[i]) max = arr[i];
		return max;
	}
	public static void main(String[] args) {
		int arr[] = takeInput();
		int max = findMaximum(arr);
		System.out.println("Max: "+ max);
	}

}

package array;
import java.util.Scanner;
public class PrintAllPairs {
	public static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = s.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = s.nextInt();
		}
		s.close();
		return array;
	}
	public static void allPairs(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) System.out.println("("+arr[i] +","+arr[j]+")");
		}
	}
	public static void main(String[] args) {
		int arr[] = takeInput();
		allPairs(arr);
	}
}

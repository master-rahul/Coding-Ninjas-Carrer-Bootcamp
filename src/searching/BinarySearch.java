package searching;
import java.util.Scanner;
public class BinarySearch {
	public static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		System.out.println("Enter size :");
		int size = s.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) array[i] = s.nextInt();
		return array;
	}
	public static int binarySearch(int array[], int value) {
		int s = 0, e = array.length -1, mid = 0;
		while(s <= e) {
			mid = (s+e)/2;
			if(array[mid] == value) return mid;
			else if(array[mid] > value) e = --mid;
			else s = ++mid;
		}
		return -1;
	}
	public static int binarySearch(int array[], int s, int e, int value) {
		if(s > e) return -1;
		int mid = (s+e)/2;
		if(array[mid] == value) return mid;
		else if(array[mid] > value) return binarySearch(array, s, mid-1, value);
		else return binarySearch(array, mid+1, e, value);
	}
	public static void main(String[] args) {
		int array[] = takeInput();
		System.out.println("Enter search item :");
		int value = s.nextInt();
		System.out.println(binarySearch(array,value));
		System.out.println(binarySearch(array, 0, array.length-1,value));
	}
}

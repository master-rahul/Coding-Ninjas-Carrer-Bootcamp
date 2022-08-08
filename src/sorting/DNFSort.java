package sorting;
import java.util.Scanner;
public class DNFSort {
	public static void swap(int []arr, int i , int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	public static void dnfSort(int[] arr){
		int low = 0, high = arr.length -1, mid = 0;
        while(mid <= high){
            if(arr[mid] == 0) swap(arr, mid++, low++);
            else if(arr[mid] == 2) swap(arr, mid, high--);
            else mid++;
        }
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		dnfSort(arr);
		s.close();
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" "); 
	}
}

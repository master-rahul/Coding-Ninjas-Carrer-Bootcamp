import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class SubsetSumOfArray{

	
    public static void main (String[] args) {
    	int arr[] = new int[] {4,3,3,9,6,6,9,9,9,5,5,3,8,4,8};
    	int arr1[] = new int[arr.length];
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	for(int i = 0; i < arr.length; i++) {
    		if(min > arr[i]) min = arr[i];
    		if(max < arr[i]) max = arr[i];
    	}
    	int f_arr[] = new int[(max - min)+1];
    	for(int i = 0; i < arr.length; i++) f_arr[arr[i]-min]++;
    	for(int i = 1; i < f_arr.length; i++) f_arr[i] += f_arr[i-1];
    	for(int i = 0; i < f_arr.length; i++) f_arr[i]--;
    	for(int i = 0; i < f_arr.length; i++) System.out.print(f_arr[i]+" ");
    	System.out.println();
    	for(int i = arr.length-1; i >= 0; i--) {
    		int num = arr[i];
    		int n = num - min;
    		int n1 = f_arr[n];
    		arr  [n1] = num;
    		f_arr[n]-= 1;
    	}
    	
    	for(int i = 0; i < arr.length; i++) System.out.print(arr1[i]+" ");
    	
    	
    }
}

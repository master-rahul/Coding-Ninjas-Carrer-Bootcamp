package test4;

import java.util.Scanner;

public class SplitArray {
	static Scanner s = new Scanner(System.in);
	
	private static boolean splitArrayHelper(int arr[], int index, int l_sum, int r_sum){
        if(index == arr.length) return l_sum == r_sum;
        if(arr[index] % 5 == 0) {
            l_sum += arr[index];
            return splitArrayHelper(arr, index+1, l_sum, r_sum);
        }
        else if(arr[index] % 3 == 0) {
            r_sum += arr[index];
            return splitArrayHelper(arr, index+1, l_sum, r_sum);
        }else{
            boolean a = splitArrayHelper(arr,index+1, l_sum +arr[index], r_sum);
            if(a) return a;
            return splitArrayHelper(arr, index+1, l_sum, r_sum+arr[index]);
        }
    }
	
	public static boolean splitArray(int input[]) {
		return splitArrayHelper(input, 0, 0, 0);	
	}
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(splitArray(input));
	}
}	

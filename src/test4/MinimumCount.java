package test4;

import java.util.Scanner;

public class MinimumCount {
	
	public static int minCount(int n){
		if(n == 0) return 0;
        if(n < 0) return -1;
        int arr[] = new int[n];
        for(int i = 1; i <= arr.length; i++) {
            if(i*i > n) break;
            arr[i-1] = minCount(n - (i*i));
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > -1 && arr[i] < min) min = arr[i]; 
        return min + 1;   
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		System.out.println(minCount(num));
	}
}

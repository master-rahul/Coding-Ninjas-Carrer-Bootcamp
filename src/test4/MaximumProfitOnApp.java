package test4;

import java.util.Scanner;
import java.util.Arrays;

public class MaximumProfitOnApp {
	
	public static int maximumProfit(int budget[]) {
		Arrays.sort(budget);
        int num = Integer.MIN_VALUE;
        for(int i =0; i < budget.length; i++){
            int n = budget[i] *(budget.length-i);
            if(n > num) num = n;
        }
		return num;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++) input[i] = s.nextInt();
		s.close();
		System.out.println(maximumProfit(input));
	}
}

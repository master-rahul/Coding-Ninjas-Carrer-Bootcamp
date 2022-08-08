package test1;

import java.util.Scanner;

public class NumberStarPattern1 {
	public static void main(String[] args) {
		// Write your code here
		Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int i = 1, pos = 1;
        while(i <= n){
            int j = n;
            while(j > 0) {
                if(j == pos)System.out.print("*");
                else System.out.print(j);
                j--;
            }
            System.out.println();
            pos++;
            i++;
        }
        s.close();
	}
}

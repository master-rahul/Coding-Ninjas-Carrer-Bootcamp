package test2;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        a.close();
        int i = 1, j = 1, s = -1, e = -1, p = 0;
        while(i <= n){
        	if(i == 2) {
        		s = n;
        		e = n+1;
        	}
            j = 1;
            p = 0;
            while(j <= 2*n){
                if(j <= n) p++;
                else if(j == n+1) ;
                else p--;
                if(j >= s && j <= e) System.out.print("*");
                else System.out.print(p);
                j++;
            }
            s--;
            e++;
            System.out.println();
            i++;
        }
	}
}

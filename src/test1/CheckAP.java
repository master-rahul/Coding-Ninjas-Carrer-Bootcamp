package test1;

import java.util.Scanner;

public class CheckAP {
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 0 || n == 1 || n == 2) { 
            System.out.println(true);
            s.close();
            return;
        }
        int p = s.nextInt();
        int p1 = s.nextInt();
        int d = p1 - p;
        int i = 3;
        while(i <= n){
           	int t = s.nextInt();
        	if(t - p1 != d){
               System.out.println(false);
               s.close();
            	return; 
            }
            p1 = t;
            i++;
        }
        s.close();
        System.out.println(true);
        
	}
}

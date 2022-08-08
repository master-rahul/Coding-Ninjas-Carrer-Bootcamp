package fundamentals;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count = 1;
        while(count <= 10){
            System.out.println(a*count++);
        }
		s.close();
	}
}

package fundamentals;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count = 2;
        while(count <= num/2){
            if(num % count == 0) System.out.print(count + " ");
            count++;
        }
        s.close();
    }

}

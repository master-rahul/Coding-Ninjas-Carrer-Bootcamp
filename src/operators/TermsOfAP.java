package operators;

import java.util.Scanner;

public class TermsOfAP {
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		int i = 1, count= 1;
        while(count <= n){
            if((3*i+2) %4 == 0) i++;
            else {
                System.out.print(3*i+2 +" ");
                i++;
                count++;
            }
        }
        s.close();
    }
}

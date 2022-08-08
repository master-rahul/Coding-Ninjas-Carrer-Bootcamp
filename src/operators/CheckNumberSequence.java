package operators;

import java.util.Scanner;

public class CheckNumberSequence {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        boolean isDec = true;
        boolean result = true;
        while(--n > 0){
            int c = s.nextInt();
            if(p == c){
                result = false;
                break;
            }else if(p > c){
                if(!isDec) {
                    result = false;
                    break;
                }
            }else{
                if(isDec) isDec = false;
            }
            p = c;
        }
        System.out.println(result);
        s.close();
	}
}

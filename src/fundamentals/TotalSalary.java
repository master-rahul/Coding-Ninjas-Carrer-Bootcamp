package fundamentals;

import java.util.Scanner;
import java.lang.Math;

public class TotalSalary {
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        String s1 = s.next();
        char c = s1.charAt(0);
        int t = 0;
        if(c == 'A') t = 1700;
        else if(c =='B') t = 1500;
        else t = 1300;
        
        float hra = (float)(b*20.0f)/100.0f;
        float da = (float)(b*50.0f)/100.0f;
        float pf = (float)(b*11.0f)/100.0f;
        System.out.println(Math.round(b + t + hra + da -pf));
        s.close();
	}

}

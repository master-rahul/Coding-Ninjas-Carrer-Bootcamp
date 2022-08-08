package fundamentals;
import java.util.Scanner;


public class FahrenheitToCelsius {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        while(a <= b){
            System.out.println(a +" "+ (int)((a-32)*(5.0/9)));
            a +=c;
        }
		s.close();
	}
}

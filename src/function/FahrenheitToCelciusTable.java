package function;
import java.util.Scanner;
public class FahrenheitToCelciusTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		s.close();
		
		printFahrenheitTable(start,end,step);
	}
	public static void printFahrenheitTable(int start, int end, int step) {
		while(start <= end){
            System.out.println(start +"\t"+ (int)((start-32.0)* (5.0/9)));
            start += step;
        }
		
	}
}

package operators;

public class ContinueKeyword {
	public static void main(String[] args) {
		int n = 5;
		int i = 0;
		while( i <= n) {
			i++;
			if(i == 3) continue;
			System.out.println(i);
			
		}
		System.out.println("Outside While");
		
		for( i = 1; i <= n; i++) {
			if(i == 1) continue;
			System.out.println(i);
		}
		System.out.println("Outside For");
	}
}

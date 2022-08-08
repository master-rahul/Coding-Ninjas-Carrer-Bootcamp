package operators;

public class ForLoops {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) System.out.print(i);
		System.out.println();
		for(int i = 1, j = 100; i < j; i <<= 1) System.out.print(i);
		System.out.println();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++)
				System.out.println("i:"+i+", j:"+j);
		}
	}
}

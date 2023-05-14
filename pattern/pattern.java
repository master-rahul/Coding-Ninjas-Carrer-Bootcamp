import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		squarePattern(n);
		triangularStarPattern(n);
		triangularNumberPattern(n);
		reverseNumberPattern(n);
		alphaPattern(n);
		characterPattern(n);
		interstingAlphabets(n);
		mirrorImageNumberPattern(n);
		invertedNumberPattern(n);
		starPattern(n);
		triangleOfNumbers(n);
		diamondOfStars(n);
		halfDiamondStars(n);
		parallelogramPattern(n);
		sumPattern(n);
		oddSquare(n);
		numberStarPattern(n);
		numberStarPattern1(n);
	}
	
	public static void squarePattern(int n) {
		System.out.println("squarePattern\n");
		String ss = Integer.toString(n);;
		StringBuilder sss = new StringBuilder("");
		StringBuilder ss1 = new StringBuilder("");
		for(int i = 0; i < n; i++) {sss.append(ss);}
		for(int j = 0; j < n; j++) {
			ss1.append(sss);
			ss1.append("\n");
		}
		System.out.println(ss1);
	}
	
	public static void triangularStarPattern(int n) {
		System.out.println("triangularStarPattern\\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				s.append("*");
			}
			s.append("\n");
		}
		System.out.println(s);
	}	
	
	public static void triangularNumberPattern(int n) {
		System.out.println("triangularNumberPattern\\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 1; i <=n ; i++) {
			for(int j = 1; j <= i; j++) {
				s.append(Integer.toString(i));
			}
			s.append("\n");
		}
		System.out.println(s);
	}
	
	public static void reverseNumberPattern(int n) {
		System.out.println("reverseNumberPattern\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 1; i <= n; i++) {
			for(int j = i; j > 0; j--) {
				s.append(Integer.toString(j));
			}
			s.append("\n");
		}
		System.out.println(s);
	}
	
	public static void alphaPattern(int n) {
		System.out.println("alphaPattern\n");
		StringBuilder s =  new StringBuilder("");
		for(int i = 1; i <=n ; i++) {
			for(int j = 1; j <= i; j++) {
				s.append((char)('A' + i -1));
			}
			s.append("\n");
		}
		System.out.println(s);
		
	}
	
	public static void characterPattern(int n) {
		System.out.println("characterPattern\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				s.append((char)('A' + j));
			}
			s.append("\n");
		}
		System.out.println(s);
	}
	
	public static void interstingAlphabets(int n) {
		System.out.println("interstingAlphabets\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				s.append((char)('A' + (n-i-1)+j));
			}
			s.append("\n");
		}
		System.out.println(s);
	}
	
	public static void mirrorImageNumberPattern(int n) {
		System.out.println("mirrorImageNumberPattern\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 1; i <= n; i++) {
			for(int j = 0 ; j < n-i; j++) s.append(" ");
			for(int k = 1 ; k <= i ; k++) s.append(Integer.toString(k));
			s.append("\n");
		}
		System.out.println(s);
	}
	public static void invertedNumberPattern(int n) {
		System.out.println("invertedNumberPatter\n");
		StringBuilder s = new StringBuilder("");
		for(int i = n ; i > 0; i--) {
			for(int j = 0; j < i; j++) 
				s.append(Integer.toString(i));
			s.append("\n");
		}
		System.out.println(s);
	}
	
	public static void starPattern(int n) {
		System.out.println("starPattern\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) s.append(" ");
			for(int k = 1 ; k < 2*(n -(n-i)); k++) s.append("*");
			s.append("\n");
		}
		System.out.println(s);
	}
	
	public static void triangleOfNumbers(int n) {
		System.out.println("triangleOfNumbers\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) s.append(" ");
			int z = 0;
			for(int k = 1 ; k < 2*(n -(n-i)); k++) {
				
				if(k <= (n-(n-i))) {
					s.append(Integer.toString(i+k-1));
					z = i +k-1;
				}
				else {
					s.append(Integer.toString(--z));
				}
			}
			s.append("\n");
		}
		System.out.println(s);
	}
	
	public static void diamondOfStars(int n) {
		System.out.println("diamondOfStars\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 1; i <= n; i++) {
			if(i <= n/2 + 1) {
				for(int j = 1; j <= (n/2 - i+1); j++ ) s.append(" ");
				for(int k = 1; k < 2 * i; k++) s.append("*");
				s.append("\n");
			}else {
				for(int j = 1; j <= (i - n/2-1); j++) s.append(" ");
				for(int k = 1; k <= 2* (n - i) + 1; k++) s.append("*");
				s.append("\n");
			}
		}
		System.out.println(s);
		
	}
	
	public static void halfDiamondStars(int n) {
		 System.out.println("halfDiamaonStars\n");
		 StringBuilder s = new StringBuilder("");
		 s.append("*\n");
		 for(int i = 1 ; i < 2* n; i++) {
			 s.append("*");
			 int z = 0;
			 if(i <= n) {
				 for(int j = 1; j <= i; j++) { z= j; s.append(Integer.toString(j));}
				 for(int k = 1; k <= i-1; k++) s.append(--z);
			 }else {
				 for(int j = 1; j <= n - (i-n); j++) {z = j; s.append(Integer.toString(j));}
				 for(int k = 1; k <= n -(i-n)-1; k++) s.append(--z);
				 
			 }
			 s.append("*\n");
		 }
		 s.append("*\n");
		 System.out.println(s);
	}
	
	public static void parallelogramPattern(int n) {
		System.out.println("parallelogramPattern\n");
		StringBuilder s = new StringBuilder("");
		StringBuilder ss = new StringBuilder("");
		for(int i = 0; i < n; i++) s.append("*");
		s.append("\n");
		for(int j = 1; j <= n; j++) {
			for(int k = 1; k < j; k++) ss.append(" ");
			ss.append(s);
		}
		System.out.println(ss);
	}
	
	public static void sumPattern(int n) {
		System.out.println("sumPattern\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 1; i <= n; i++) {
			s.append(Integer.toString(1));
			for(int j = 2; j <= i; j++) {
				s.append("+");
				s.append(Integer.toString(j));
			}
			s.append("=");
			s.append(Integer.toString((i*(i+1))/2));
			s.append("\n");	
		}
		System.out.println(s);
	}
	
	public static void oddSquare(int n) {
		System.out.println("oddSquare\n");
		StringBuilder s = new StringBuilder("");
		int k = 1;
		for(int i = 1; i <= n; i++) {
			k = i;
			for(int j = 1; j <=n ; j++) {
				if((2*k -1) > (2*n-1)) k = 1;
				s.append(Integer.toString(2*k - 1));
				k++;
				
			}
			s.append("\n");
		}
		System.out.println(s);
	}
	
	public static void numberStarPattern(int n) {
		System.out.println("numberStarPattern\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 1; i <= n; i++) {
			int k = 1;
			for(int j = 1; j <= 2*n; j++) {
				
				if(j <= n) {
					if(j > n-i+1 && j < n+i-1 && i != 1) {
						s.append("*");
						k++;
					}else s.append(k++);
				}else {
					if(j > n-i && j < n+i && i != 1) {
						s.append("*");
						k--;
					}else s.append(--k);
				}
			
			}
			s.append("\n");
		}
		
		System.out.println(s);
	}
	
	public static void numberStarPattern1(int n) {
		System.out.println("numberStarPattern1\n");
		StringBuilder s = new StringBuilder("");
		for(int i = 1; i <= n; i++) {
			for(int j = 5; j >= 1; j--) {
				if(j == n-(n-i)) s.append("*");
				else s.append(j);
			}
			s.append("\n");
		}
		System.out.println(s);
	}
}






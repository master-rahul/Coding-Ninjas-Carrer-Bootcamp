package _2DArrays;

import java.util.Scanner;

public class _2DArrays {
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		//rowWiseSum();
		//largestRowOrColumn();
		//sumOfBoundariesAndDiagonals();
		//wavePrint();
		spiralPrint();
	}
	public static void rowWiseSum() {
		System.out.println("RowWiseSum : ");
		int m = s.nextInt();
		int n = s.nextInt();
		int matrix[][] = new int[m][n];
		if(m == 0) return;
		for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) matrix[i][j] = s.nextInt();
		for(int i = 0; i < m; i++) {
			int sum = 0;
			for(int j = 0; j < n; j++) sum += matrix[i][j];
			System.out.print(sum +" ");
 		}
		System.out.println();	
	}
	public static void largestRowOrColumn() {
		System.out.println("LargestRowOrColumn : ");
		int m = s.nextInt();
		int n = s.nextInt();
		int matrix[][] = new int[m][n];
		if(matrix.length == 0) {System.out.println("row 0 "+Integer.MIN_VALUE); return;}
		for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) matrix[i][j] = s.nextInt();
		int maxSum = Integer.MIN_VALUE;
		int index = 0;
		boolean v = false;
		for(int i = 0; i < m; i++) {
			int rowSum = 0;
			for(int j = 0; j < n; j++) rowSum += matrix[i][j];
			if(rowSum > maxSum) {
				index = i;
				maxSum = rowSum;
			}
		}
		for(int i = 0; i < n; i++) {
			int colSum = 0;
			for(int j = 0; j < m; j++) colSum += matrix[j][i];
			if(colSum > maxSum) {
				v = true;
				index = i;
				maxSum = colSum;
			}
		}
		System.out.println((v?"col":"row")+" "+ index +" "+maxSum);	
	}
	public static void sumOfBoundariesAndDiagonals() {
		System.out.println("SumOfBoundariesAndDiagonals : ");
		int m = s.nextInt();
		int n = m;
		int matrix[][] = new int[m][m];
		for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) matrix[i][j] = s.nextInt();
		int sum = 0;
		for(int i = 0; i < m; i++) { 
			for(int j = 0; j < n; j++) if(i == 0 || j == 0 || i == m-1 || j == n-1 || i==j || i+j== n-1) sum += matrix[i][j]; 		
		}
		System.out.println(sum);
	}
	public static void wavePrint() {
		System.out.println("WavePrint : ");
		int m = s.nextInt();
		int n = s.nextInt();
		int matrix[][] = new int[m][n];
		for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) matrix[i][j] = s.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i%2 == 1) System.out.print(matrix[m-j-1][i] +" ");
				else System.out.print(matrix[j][i]+" ");
			}
		}
	}
	public static void spiralPrint() {
		System.out.println("SpiralPrint : ");
		int m = s.nextInt();
		int n = s.nextInt();
		if(m == 0) return;
		int matrix[][] = new int[m][n];
		for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) matrix[i][j] = s.nextInt();
		int top = 0, right = n-1, bottom = m-1, left = 0, count = 1;
		while(top <= bottom && left <= right && count <= n*m) {
			for(int i = left; i <= right && count <= n*m; i++, count++) System.out.print(matrix[top][i]+" ");
			top++; 
			for(int i = top; i <= bottom && count <= n*m; i++, count++) System.out.print(matrix[i][right]+" ");
			right--;
			for(int i = right; i >= left && count <= n*m; i--, count++) System.out.print(matrix[bottom][i]+" ");
			bottom--;
			for(int i = bottom; i >= top && count <= n*m; i--, count++) System.out.print(matrix[i][left]+" ");
			left++;
		}
	}

}

package test4;

import java.util.Scanner;

public class Print2DArray {
	static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void print2DArray(int input[][]) {
        int n1 = input.length;
        int n = n1;
        while( n > 0){
            int m = n;
            while(m > 0){
                for(int i =0; i < input[0].length; i++) System.out.print(input[n1-n][i]+" ");
                System.out.println();
                m--;
            }
            n--;
        }
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		print2DArray(input);
	}
}

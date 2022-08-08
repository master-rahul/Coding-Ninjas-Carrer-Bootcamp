package array;
import java.util.Scanner;
public class PrintSpiral {
	
	public static Scanner  s = new Scanner(System.in);
	
	public static int[][] takeInput(){
		int row = s.nextInt();
		int col = s.nextInt();
		int[][] arr = new int[row][col];
		for(int i = 0; i < row; i++) 
			for(int j = 0; j < col; j++) arr[i][j] = s.nextInt();
		return arr;
	}

	public static void spiralPrint(int matrix[][]){
        if(matrix.length == 0) return;
		int sum = 0, product = matrix.length * matrix[0].length;
        int rS = 0, rE = matrix[0].length -1, cS = 0, cE = matrix.length-1;
        
        while(sum < product){
            for(int i = rS; i <= rE && sum < product; i++, sum++) System.out.print(matrix[cS][i]+" ");
            cS++;
            for(int i = cS; i <= cE && sum < product; i++, sum++) System.out.print(matrix[i][rE]+" ");
            rE--;
            for(int i = rE; i >= rS && sum < product; i--, sum++) System.out.print(matrix[cE][i]+" ");
            cE--;
            for(int i = cE; i >= cS && sum < product; i--, sum++) System.out.print(matrix[i][rS]+" ");
            rS++;
        }
            
	}
	public static void main(String[] args) {
		int arr[][] = takeInput();
		spiralPrint(arr);
	}
}
	

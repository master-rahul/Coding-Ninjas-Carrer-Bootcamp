package array;
import java.util.Scanner;
public class BasicsOf2DArrays {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int arr[][] = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) arr[i][j] = s.nextInt();
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		s.close();
		int[][] arr1 = {{1,2,3},{5,6,7},{2,3,4},{0,9,8}};
		System.out.println(arr1);
		for(int i = 0; i < arr1.length; i++) System.out.println(arr1[i]);
	}

}

package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestRowOrColumn {
	public static void findLargest(int arr[][]){
		int sum = Integer.MIN_VALUE, sum1 = Integer.MIN_VALUE;
        int row =0, col = 0;
        if(arr.length == 0 ) {
            System.out.println("row "+row+" "+sum1);
            return;
        }
		for(int i = 0; i < arr[0].length; i++) {
			int temp = 0;
			for(int j = 0; j < arr.length; j++) temp += arr[j][i];
			if(temp > sum) {
                sum = temp;
                col = i;
            }
		}
        for(int i = 0; i < arr.length; i++) {
			int temp = 0;
			for(int j = 0; j < arr[0].length; j++) temp += arr[i][j];
			if(temp > sum1) {
                sum1 = temp;
                row = i;
            }
		}
        if(sum >sum1) System.out.println("column "+col+" "+sum);
        else System.out.println("row "+row+" "+sum1);
	}
	
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            LargestRowOrColumn.findLargest(mat);
            System.out.println();

            t -= 1;
        }
    }
}

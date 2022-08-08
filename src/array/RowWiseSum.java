package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RowWiseSum {

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

    public static void rowWiseSum(int[][] mat) {
		int sum = 0; 
        for(int i = 0; i < mat.length; i++){
            sum= 0;
            for(int j = 0; j < mat[0].length; j++) sum+= mat[i][j];
            System.out.print(sum+" ");
        }
        System.out.println();
	}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            rowWiseSum(mat);
            System.out.println();

            t -= 1;
        }
    }
}
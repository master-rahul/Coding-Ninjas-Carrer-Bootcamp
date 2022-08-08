package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalSumOnTheBoundariesAndDiagonals {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < n; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }

    public static void totalSum(int[][] mat) {
		int sum = 0; 
        if(mat.length == 0){
            System.out.println(0);
            return;
        }
        for(int i = 0; i < mat.length; i++)
            sum += mat[i][0] + mat[i][mat[i].length-1]+mat[0][i]+ mat[mat.length-1][i];
        sum -= mat[0][0] + mat[0][mat.length-1]+mat[mat.length-1][0]+mat[mat.length-1][mat.length-1];
        int i = 1, j = 1;
        while(i < mat.length-1) sum += mat[i][j] +mat[i++][mat.length-1-j++];
        if(mat.length %2 == 1) sum -= mat[mat.length/2][mat.length/2];
        System.out.println(sum); 
        
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            totalSum(mat);
            System.out.println();

            t -= 1;
        }
    }
}

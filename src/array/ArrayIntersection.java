package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayIntersection {
	public static void intersections(int arr1[], int arr2[]) {
	    	
	        for(int i = 0; i < arr1.length; i++){
	            for(int j = 0; j < arr2.length; j++){
	                if(arr1[i] == arr2[j]) {
	                    	arr2[j] = Integer.MIN_VALUE;
	                    	System.out.print(arr1[i]+" ");
	                    	break;
	                }
	            }
	        }
	        System.out.println();
	    }
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            ArrayIntersection.intersections(input1, input2);
            System.out.println();

            t -= 1;
        }
    }
}

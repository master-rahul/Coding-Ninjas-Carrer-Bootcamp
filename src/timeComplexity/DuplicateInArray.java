package timeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DuplicateInArray {
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

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println();
	}
	
	  	public static int findDuplicate1(int[] arr) {
	  		int m = 0;
	  		for(int i = 0; i < arr.length; i++) m ^= arr[i];
	  		for(int i = 0; i < arr.length-1 ; i++) m ^= i;
	  		return m;
		 }
		 public static int findDuplicate2(int[] arr) {
		 	Arrays.sort(arr);
		 	for(int i = 1; i < arr.length; i++) if(arr[i-1] == arr[i]) return arr[i];
		 	return -1;
		 }
	    public static int findDuplicate3(int[] arr) {
	       	int m = 0;
	        for(int i = 0; i < arr.length; i++) m += arr[i];
	        return m -(((arr.length-2)*(arr.length-1))/2);
		}
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	int t = Integer.parseInt(br.readLine().trim());

    	while(t > 0) {

    		int[] input = takeInput();
        	System.out.println(findDuplicate1(input));
        	System.out.println(findDuplicate2(input));
        	System.out.println(findDuplicate3(input));


        	t -= 1;
    	}
    }
}

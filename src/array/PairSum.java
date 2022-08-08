package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PairSum {
	public static int pairSum(int arr[], int x) {
        int count = 0;
    	for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++) if(arr[i]+arr[j] ==x) count++;
        }
        return count;
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
	    public static int pairSum1(int[] arr, int num) {
	    	Arrays.sort(arr);
	        int i = 0, j = arr.length -1,count = 0;
	        while(i < j){
	            if(arr[i] + arr[j] > num) j--;
	            else if(arr[i] + arr[j] < num) i++;
	            else {
	            	if(arr[i] == arr[j]) {
	            		count += ((j-i)*(j-i+1))/2;
	            		break;
	            	}else {
	            		
	            	}
	            }
	        }
	        return count;
	    }
	
	
	    public static void main(String[] args) throws NumberFormatException, IOException {
	        int t = Integer.parseInt(br.readLine().trim());
	
	        while(t > 0) {
	
	            int[] input = takeInput();
	            int x = Integer.parseInt(br.readLine().trim());
	           // System.out.println(PairSum.pairSum(input, x));
	            System.out.println(PairSum.pairSum1(input, x));
	
	            t -= 1;
	        }
	    }
}
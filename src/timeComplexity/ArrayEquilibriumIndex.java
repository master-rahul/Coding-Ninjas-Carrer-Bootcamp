package timeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ArrayEquilibriumIndex {
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
    
    public static int arrayEquilibriumIndex(int[] arr){  
        if(arr.length < 1) return -1;
		for(int i = 1; i < arr.length; i++) arr[i] = arr[i-1] + arr[i];
        if(arr[arr.length-1] == 0 || arr.length == 1) return 0;
		for(int i = 1; i < arr.length; i++)
            if(arr[i-1] == arr[arr.length-1]- arr[i]) return i;
        return -1;
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr = takeInput();
            System.out.println(arrayEquilibriumIndex(arr));

            t -= 1;
        }
    }

}

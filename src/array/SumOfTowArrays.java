package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTowArrays {

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
    
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	int carry = 0, i = arr1.length-1, j = arr2.length-1, k = output.length-1;
        while(i >= 0 && j >= 0){
			output[k--] = (arr1[i] + arr2[j] + carry)%10;
            carry = (arr1[i--] + arr2[j--] + carry)/10;
        }
        while(i >= 0){
			output[k--] = (arr1[i]  + carry)%10;
            carry = (arr1[i--] + carry)/10;
        }
        while(j >= 0){
			output[k--] = (arr2[j]  + carry)%10;
            carry = (arr2[j--] + carry)/10;
        }
        output[0] = carry;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr1 = takeInput();
            int[] arr2 = takeInput();

            int[] output = new int[1 + Math.max(arr1.length, arr2.length)];

            sumOfTwoArrays(arr1, arr2, output);
            printArray(output);

            t -= 1;
        }
    }
}
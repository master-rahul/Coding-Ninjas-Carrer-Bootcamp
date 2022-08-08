package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeMergeTwoSortedArray {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] merge(int arr1[], int arr2[]) {
    	int array[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
    	while(i < arr1.length && j < arr2.length){
            if(arr1[i] >= arr2[j]) array[k++] = arr2[j++];
            else array[k++] = arr1[i++];
        }
        while(i < arr1.length) array[k++] = arr1[i++];
        while(j < arr2.length) array[k++] = arr2[j++];
        return array;
    }
    
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

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            int[] ans = merge(input1, input2);
            printArray(ans);

            t -= 1;
        }
    }
}
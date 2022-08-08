package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortZeroesAndOne {
    public static void sortZeroesAndOne(int[] arr) {
    	int i = 0, j = arr.length -1;
        while(i < j){
            if(arr[i] == 0) {
                i++;
                continue;
            }
            if(arr[j] ==0){
				arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }else j--;
        }
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

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            SortZeroesAndOne.sortZeroesAndOne(input);
            printArray(input);

            t -= 1;
        }
    }

    
}

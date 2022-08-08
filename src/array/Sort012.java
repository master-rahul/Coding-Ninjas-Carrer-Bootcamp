package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort012 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void sort012(int[] arr){
		int low = 0, high = arr.length -1, mid = 0;
        while(mid <= high){
            if(arr[mid] == 0) swap(arr, mid++, low++);
            else if(arr[mid] == 2) swap(arr, mid, high--);
            else mid++;
        }
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

            int[] input = takeInput();
            Sort012.sort012(input);
            printArray(input);

            t -= 1;
        }
    }
}
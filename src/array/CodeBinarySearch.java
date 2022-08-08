package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CodeBinarySearch {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public static int binarySearch(int[] array, int value) {
		int s = 0, e = array.length -1, mid = 0;
		while(s <= e) {
			mid = (s+e)/2;
			if(array[mid] == value) return mid;
			else if(array[mid] > value) e = --mid;
			else s = ++mid;
		}
		return -1;
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
        int[] input = takeInput();
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int x = Integer.parseInt(br.readLine().trim());
            System.out.println(CodeBinarySearch.binarySearch(input, x));

            t -= 1;
        }
    }
}

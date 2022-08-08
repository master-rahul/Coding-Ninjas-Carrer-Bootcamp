package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CodeInsertionSort {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public static void swap(int array[], int i , int j) {
		array[i] = array[i] + array[j];
		array[j] = array[i] - array[j];
		array[i] = array[i] - array[j];
	}
	public static void insertionSort1(int[] array) {
		// TODO Auto-generated method stub
		for(int i = 1; i < array.length; i ++) {
			int j = i-1;
			while(j >= 0) {
				if(array[j] > array[i]) swap(array,i,j);
				else break;
				if(j == 0) break;
				i--;
				j--;
			}
		}
		
	}
	public static void insertionSort(int[] array) {
		int maxSortedIndex = 0, minUnsortedIndex = maxSortedIndex + 1;
        while(maxSortedIndex < array.length-1){
        	minUnsortedIndex = maxSortedIndex + 1;
	        int i = maxSortedIndex;
	        int j = minUnsortedIndex;
	        while(i >= 0){
	           if(array[i] > array[j]) swap(array, i, j);
	           else break;  
	           if(i == 0) break;
	           		i--;
	                j--;
	        }
	           maxSortedIndex++; 
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
            int array[] = input;
            CodeInsertionSort.insertionSort1(array);
            CodeInsertionSort.insertionSort(input);
            printArray(input);
            printArray(array);

            t -= 1;
        }
    }

	
}

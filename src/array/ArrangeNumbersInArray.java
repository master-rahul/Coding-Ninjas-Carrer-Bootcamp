package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArrangeNumbersInArray {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void arrange(int[] arr, int n) {
        int k = 1;
        System.out.println(arr);
		for(int i = 0; i < arr.length; i++){
            if((i <= n/2) && (n%2 == 1)){
                arr[i] = k;
                k += 2;
            }else if((i == (n/2)+1) && (n%2 == 1)){
                k-=3;
                arr[i] = k;
            }else if(i < n/2){
                 arr[i] = k;
                k += 2;
            }else if(i == n/2){
				k-=1;
                arr[i] = k;
            }
            else{
                k -= 2;
                arr[i] = k;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int element : arr)  System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());
        while(t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            System.out.println(arr);
            ArrangeNumbersInArray.arrange(arr, n);
            printArray(arr);
            t -= 1;
        }
    }
}
import java.util.Arrays;
public class TripletSum {	

	public static int tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
        int count = 0, i = 0, j = arr.length-1;
        while(i < j-1){
            int sum = arr[i] + arr[j];
            if(sum > num) j--;
            else if (arr[i] == arr[j]){
            	count += ((j-i) * (j-i-1))/2;
                break;
            }
            else{
                int k = i +1, st =1;
                while(k <j){
                    
                    if(sum + arr[k] == num) {
                        count++;
                    	k++;
                    }
                    else if(sum + arr[k] > num){
                        j--;
                        st = 0;
                        break;
                    }else k++;
                }
                if(st == 1 && sum + arr[--k] <= num) i++;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		int arr[] = {2 ,-5 ,8 ,-6, 0, 5 ,10, 11, -3};
		System.out.println(tripletSum(arr, 10));
	}
}

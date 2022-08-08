package recursion;

public class QuickSort_2 {
	
	public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
	
	static int partition(int[] arr, int low, int high)
	{
	     
	    int pivot = arr[high];
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	        if (arr[j] < pivot)
	        {
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	public static void quickSort(int[] input, int s, int e) {
		if(s >= e) return;
		int i = partition(input, s, e);
        quickSort(input,s,i-1);
        quickSort(input,i+1,e);
	}

	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length - 1);
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,0,-1, 4, 2, 10, -2 , 4 , 932 , 32432};
		quickSort(arr);
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");
	}

}

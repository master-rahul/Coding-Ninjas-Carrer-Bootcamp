package recursion;

public class QuickSort {
	
	public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    
    public static void merge(int[] a1, int[] a2, int[] a3, int n){
    	int k = 0;
        for(int i = 0; i < a1.length; i++) a3[i] = a1[i];
        for(int i = a1.length+1; i < a3.length; i++) a3[i] = a2[k++];
    }
    
	public static void quickSort(int[] input) {
		if(input.length <= 1) return;
        int index = 0, c = 0, k =0;
        for(int i = 1; i < input.length; i++) if(input[index] > input[i]) c++;
        swap(input, c, index);
        int x = 0, y = input.length-1;
        while(x < c && y > c){
            if(input[x] < input[c]) x++;
            else if(input[y] >= input[c] ) y--;
            else {
            	swap(input,x,y);
            	x++; 
            	y--;
            }
        }
        int arr1[] = new int[c];
        for(int i = 0; i < arr1.length; i++) arr1[i] = input[i];
        int arr2[] = new int[input.length - arr1.length -1];
        for(int i = c+1; i < input.length; i++) arr2[k++] = input[i];
        quickSort(arr1);
        quickSort(arr2);
        merge(arr1, arr2, input, c);
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,0,-1, 4, 2, 10, -2 , 4 , 932 , 32432};
		quickSort(arr);
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");
	}
}

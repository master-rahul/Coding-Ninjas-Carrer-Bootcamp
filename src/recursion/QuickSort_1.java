package recursion;

public class QuickSort_1 {
	public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    
    
	public static void quickSort(int[] input, int s, int e) {
		if(s >= e) return;
        int index = s, c = 0;
        
        for(int i = s+1; i <= e; i++) if(input[index] > input[i]) c++;
        swap(input, s+c, index);
        int x = s, y = e;
        c = c+s;
        while(x < c && y > c){
            if(input[x] < input[c]) x++;
            else if(input[y] >= input[c] ) y--;
            else {
            	swap(input,x,y);
            	x++; 
            	y--;
            }
        }
        quickSort(input,s ,c-1 );
        quickSort(input,c+1 ,e );
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

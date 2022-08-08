package array;

public class PrimitiveAndNonPrimitives {
	public static void increment(int i) {
		i++;
	}
	public static void printArray(int array[], int size) {
		for(int i = 0 ; i < size; i++) System.out.print(array[i]+" ");

	}
	public static void incrementArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) arr[i]++;
	}
//	
	public static void mul(int [] arr)
	{
	    for(int i=0;i<5;i++)
	    arr[i]*=i;

	}
	public static void main (String[] args) {
	    int arr[]={1,2,3,4,5};
	    mul(arr);
	    for(int i=0;i<5;i++)
	    {
	        System.out.print(arr[i]);
	    }
	}
}

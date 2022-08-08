package sorting;

public class MergeSort {
	
	public static void merge(int arr[], int si, int ei){
        int i = si, j = (si+ei)/2 +1, k =0 ;
        int arr1[] = new int[ei-si+1];
        while(i <= (si +ei)/2 && j <= ei){
            if(arr[i] > arr[j]) arr1[k++] = arr[j++];
            else arr1[k++] = arr[i++];
        }
        while(i <= (si+ei)/2) arr1[k++] = arr[i++];
        while(j <= ei) arr1[k++] = arr[j++];
        for(int l = si; l <= ei; l++) arr[l] = arr1[l -si];
    }
    
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei) return;
        mergeSort(arr,si, (si+ei)/2);
        mergeSort(arr,(si+ei)/2+1, ei);
        merge(arr, si, ei);
    }

	public static void main(String[] args) {
		int a[] = new int[]{1,2,3,5,2,1,8,9,4,6,8,3,5,2};
		mergeSort(a,0,a.length-1);
		for(int i = 0; i < a.length; i++) System.out.print(a[i]+" ");
	}
}


public class test {
	
	public static boolean checking(int arr[], int s, int e) {
		boolean c = false;
		for(int i = 0; i < s; i++) {
			if(arr[i]%5 == 0) {
				c = true;
				break;
			}
		}
		if(c == false) {
			for(int i = e+1; i < arr.length; i++) {
				if(arr[i]%5 == 0) {
					c = true;
					break;
				}
			}
		}
		if(c == true) {
			for(int i = s; i <= e; i++) {
				if(arr[i] %5 == 0) return false;
			}
			for(int i = 0; i < s; i++) {
				if(arr[i]%3 == 0&& arr[i]%5 != 0) {
					return false;
				}
			}
			for(int i = e+1; i < arr.length; i++) {
				if(arr[i]%3 == 0&& arr[i]%5 != 0) {
					return false;
				}
			}	
		}
		c = false;
		for(int i = s; i <= e; i++) {
			if(arr[i] %5 == 0) {
				c = true;
			}
		}
		if(c == true) {
			for(int i = s; i <= e; i++) {
				if(arr[i] %3 ==0 && arr[i]%5 != 0) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	public static boolean checking(int[] arr, int a) {
		boolean c = false;
		for(int i =0; i<= a; i++) {
			if(arr[i] %5 == 0) {
				c = true;
				break;
			}
		}
		if(c == true) {
			for(int i =a+1; i< arr.length; i++) {
				if(arr[i] %5 == 0) return false;
			}
			for(int i =0; i<= a; i++) {
				if(arr[i] %3 == 0 && arr[i]%5 != 0) return false;
			}
		}else {
			for(int i =a+1; i< arr.length; i++) {
				if(arr[i] %5 == 0) {
					c = true;
					break;
				}
			}
			if(c == true) {
				for(int i =a+1; i< arr.length; i++) {
					if(arr[i] %3 == 0 && arr[i]%5 != 0) return false;
				}
			}
		}
		
		return true;
	}
	
	 public static boolean checkSum(int arr[]){
	        int arr1[] = new int[arr.length];
	        arr1[0] = arr[0];
	        for(int i =1 ; i < arr1.length; i++) arr1[i] += arr[i] + arr1[i-1];
	        if(arr1[arr1.length-1]%2 != 0)return false;
	        int num = arr1[arr1.length-1]/2;
	        int a= 0, b = 0,status = 0;
	        for(int i = 0; i < arr1.length; i++) {
	        	int j = i-1;
	        	a = i;
	        	b = i;
	        	if(arr1[i] == num) {
	        		status  =  2;
	        		break;
	        	}
	        	while( j >= 0) {
	        		if(arr1[i] - arr1[j] == num) {
	        			b = j;
	        			status = 1;
	        			break;
	        		}
	        		j--;
	        	}
	        	if(status !=  0) {
	        		//System.out.println("yaha");
	        		break;
	        	}
	        }
	       // System.out.println("yaha");
	        if(status == 0) return false;
	        else if(status ==  1)return checking(arr,a,b+1);
	        else return checking(arr, a);
	    }
	    
	



		public static boolean splitArray(int input[]) {
			boolean check = checkSum(input);
			return check;
			
		}
		public static void main(String[] args) {
			int arr[] = new int[] {1,2,3,4};
			System.out.println(splitArray(arr));
		}
}

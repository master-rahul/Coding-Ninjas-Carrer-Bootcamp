package Arrays;

import java.util.*;


public class Arrays {
	public static Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		//sumOfArray();
		//linearSearch();
		//arrangeNumbers();
		//swapAlternative();
		//findUnique();
		//findDuplicate();
		//arrayIntersection();
		//pairSum();
		//tripletSum();
		//sort01();
		//sort01Dutch();
		//binarySearch();
		//selectionSort();
		//bubbleSort();
		//insertionSort();
		//merge2SortedArray();
		//pushZerosToEnd();
		//rotateArrayToLeft();
		//secondLargestArray();
		//checkArrayRotation();
		//sort012();
		//sort012Dutch();
		//sumOfTwoArrays();
		
	}
	public static void sumOfArray() {
		System.out.println("SumOfArray : ");
		int n = s.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i++) sum += s.nextInt();
		System.out.println(sum);
	}
	
	public static void linearSearch() {
		System.out.println("LinearSearch : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] += s.nextInt();
		int m = s.nextInt();
		for(int i = 0; i < n; i++) if(arr[i] == m) {System.out.println(true); return;}
		System.out.println(false);
	}
	public static void arrangeNumbers() {
		System.out.println("ArrangeNumbers : ");
		int n = s.nextInt();
		int odd = 1;
		int even = n%2==0?n: n-1;
		for(int i = 0; i < n; i++) {
			if(odd <= n) {
				System.out.print(odd+" ");
				odd +=2;
			}else {
				System.out.print(even+ " ");
				even -= 2;
			}
		}
	}
	public static void swapAlternative() {
		System.out.println("SwapAlternative : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		for(int i = 0; i+1 < n; i+=2) {
			arr[i] += arr[i+1];
			arr[i+1] = arr[i] - arr[i+1];
			arr[i] = arr[i] - arr[i+1];
		}
		for(int i =0 ; i < n; i++) System.out.print(arr[i] +" ");
	}
	public static void findUnique() {
		System.out.println("FindUnique : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		int result = 0;
		for(int i = 0; i < n; i++) {
			result = result ^ arr[i];
		}
		System.out.println(result);
	}
	public static void findDuplicate() {
		System.out.println("FindDuplicate : ");
		Map<Integer, Integer> map = new HashMap<>();
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		for(int i = 0; i < n; i++) {
			if(map.containsKey(arr[i])) map.remove(arr[i]);
			else map.put(arr[i], 0);
		}
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(arr[i])) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
	public static void arrayIntersection() {
		System.out.println("ArrayIntersection : ");
		int n = s.nextInt();
		int arr1[] = new int[n];
		for(int i = 0; i < n; i++) arr1[i] = s.nextInt();
		int m = s.nextInt();
		int arr2[] = new int[m];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < m; i++) {
			arr2[i] = s.nextInt();
			if(map.containsKey(arr2[i])) map.put(arr2[i], map.get(arr2[i])+1);
			else map.put(arr2[i], 1);
		}
		for(int i = 0; i < n; i++) {
			if(map.containsKey(arr1[i])) {
				System.out.print(arr1[i]+" ");
				map.put(arr1[i], map.get(arr1[i])-1);
				if(map.get(arr1[i]) == 0) map.remove(arr1[i]);
			}
		}
		
	}
	
	public static void pairSum() {
		System.out.println("PairSum : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		int x = s.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		List<List<Integer>> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int num = arr[i];
			if(map.containsKey(num)) {
				for(int j = 0; j < map.get(num); j++) {
					List<Integer> itemList = new ArrayList<>();
					itemList.add(x - num);
					itemList.add(num);
					list.add(itemList);
				}	
			}
			if(map.containsKey(x - num)) map.put(x - num, map.get(x - num)+1);
			else map.put(x-num, 1);
		}
		System.out.println(list.toString());
	}
	public static void tripletSum() {
		System.out.println("TripletSum : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		int x = s.nextInt();
		List<List<Integer>> list = new ArrayList<>();
		int count = 0;
		for(int i = 0; i < n; i++) {
			int xx = x - arr[i];
			Map<Integer, Integer> map = new HashMap<>();
			for(int j = 0; j != i && j < n; j++) {
				if(map.containsKey(arr[j])) {
					count += map.get(arr[j]);
					for(int k = 0; k < map.get(arr[j]); k++) {
						List<Integer> listItem = new ArrayList<>();
						listItem.add(arr[i]);
						listItem.add(arr[j]);
						listItem.add(xx - arr[j]);
						list.add(listItem);
					}
				}
				if(map.containsKey(xx-arr[j])) map.put(xx-arr[j], map.get(xx-arr[j])+1);
				else map.put(xx-arr[j], 1);
			}
		}
		System.out.println(list.toString()+" :: "+count);
	}
	public static void sort01() {
		System.out.println("Sort01 : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		int left = 0, right = n-1;
		while(left < right) {
			if(arr[left] == 0 && arr[right] == 0) left++;
			else if(arr[left] == 0 && arr[right] == 1) {left++; right--;}
			else if(arr[left] == 1 && arr[right] == 0) {arr[left++] = 0; arr[right--] = 1;}
			else right--;
		}
		for(int i = 0; i < n; i++) System.out.print(arr[i] + " ");
	}
	public static void sort01Dutch() {
		System.out.println("Sort01Dutch : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		int low = 0, high = n-1;
		while(low <= high) {
			if(arr[low] == 0) low++;
			else {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high--] = temp;
			}
		}
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void binarySearch() {
		System.out.println("BinarySearch : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		int m = s.nextInt();
		int left = 0, right = n-1, mid = (left + right)/2;
		while(left < right) {
			mid = (left + right)/2;
			if(arr[mid] == m) {
				System.out.println(mid+1);
				return;
			}else if(arr[mid] > m) right = mid-1;
			else left = mid + 1;
		}
		System.out.println("-1");
	}
	public static void selectionSort() {
		System.out.println("SelectionSort : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		for(int i = 0; i < n-1; i ++) {
			int smallestNumberIndex = i;
			for(int j = i+1; j < n; j++) if(arr[j] < arr[smallestNumberIndex]) smallestNumberIndex = j;
			if(i != smallestNumberIndex) {
				arr[i] += arr[smallestNumberIndex];
				arr[smallestNumberIndex] = arr[i] - arr[smallestNumberIndex];
				arr[i] = arr[i] - arr[smallestNumberIndex];
			}
		}
		for(int i = 0; i < n; i++) System.out.print(arr[i] +" ");
		System.out.println();
	}
	public static void bubbleSort() {
		System.out.println("BubbleSort : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		for(int i = 0; i < n-1; i++) {
			for(int j = 1; j < n-i; j++) {
				if(arr[j-1] > arr[j]) {
					arr[j-1] += arr[j];
					arr[j] = arr[j-1] - arr[j];
					arr[j-1] = arr[j-1] - arr[j];
				}
			}
		}
		for(int i = 0; i < n; i++) System.out.print(arr[i] +" ");
		System.out.println();
	}
	public static void insertionSort() {
		System.out.println("InsertionSort : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		for(int i = 1; i < n; i++) {
			int j = i;
			while(j >= 1) {
				if(arr[j] < arr[j-1]) {
					arr[j] += arr[j-1];
					arr[j-1] = arr[j] - arr[j-1];
					arr[j] = arr[j] - arr[j-1];
					j--;
				}
				else break;
			}
		}
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void merge2SortedArray() {
		System.out.println("Merge2SortedArray : ");
		int n = s.nextInt();
		int arr1[] = new int[n];
		for(int i = 0; i < n; i++) arr1[i] = s.nextInt();
		int m = s.nextInt();
		int arr2[] = new int[m];
		for(int i = 0; i < m; i++) arr2[i] = s.nextInt();
		int arr3[] = new int[m+n];
		int index1 = 0, index2 = 0, index3 = 0;
		while(index1 < arr1.length && index2 < arr2.length) {
			if(arr1[index1] > arr2[index2]) arr3[index3++] = arr2[index2++];
			else if(arr1[index1] < arr2[index2]) arr3[index3++] = arr1[index1++];
			else arr3[index3++] = arr1[index1++];
		}
		for(int i = index1; i < arr1.length; i++) arr3[index3++] = arr1[i];
		for(int i = index2; i < arr2.length; i++) arr3[index3++] = arr2[i];
		for(int i = 0; i < arr3.length; i++) System.out.print(arr3[i]+" ");
		System.out.println();
	}
	public static void pushZerosToEnd() {
		System.out.println("PushZerosToEnd : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0; i < n; i++) arr[i] = s.nextInt();
		int zero = 0;
		for(int num = 0; num < n && zero < n; num++) {
			if(num == zero && arr[zero] != 0) zero++;
			else if(arr[zero] == 0 && arr[num] != 0) {
				arr[zero] += arr[num];
				arr[num] = arr[zero] - arr[num];
				arr[zero] = arr[zero] - arr[num];
				zero++;
			}
			else if(arr[zero] !=0 && zero != num) zero++;
		}
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void reverse(int[] arr,int  i,int  j) {
		while(i < j) {
			arr[i] += arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i++] - arr[j--];
		}
		
	}
	public static void rotateArrayToLeft() {
		System.out.println("RotateArrayToLeft : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		int d = s.nextInt();
		
/*		
 		O(n*a)
 		for(int i = a; i > 0; i--) {
			int num = arr[0];
			for(int j = 1; j < n; j++)  arr[j-1] = arr[j];
			arr[n-1] = num;
		}
*/
/*
 		O(n)
		int temp[] = new int[d];
		for(int i = 0; i < d; i++) temp[i] = arr[i];
		for(int i = d; i < n; i++) arr[i-d] = arr[i];
		for(int i = n-d; i < n; i++) arr[i] = temp[i-(n-d)];
		for(int i = 0; i < n; i++) System.out.print(arr[i] +" ");
*/
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, n-d-1);
		reverse(arr, n-d, n-1);
		for(int i = 0; i < n; i++) System.out.print(arr[i] +" ");
		System.out.println();
	}
	public static void secondLargestArray() {
		System.out.println("SecondLargerstArray : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			if(arr[i] < largest && secondLargest < arr[i]) secondLargest = arr[i];
		}
		System.out.println(secondLargest);
				
	}
	public static void checkArrayRotation() {
		System.out.println("CheckArrayRotation : ");
		int n = s.nextInt();
		int rotatedTimes = 0;
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		for(int i = 1; i < n; i++) if(arr[i] < arr[i-1]) {rotatedTimes = i; break;}
		System.out.println(rotatedTimes);
	}
	public static void sort012() {
		System.out.println("Sort012 : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		int zero = -1, one = -1, two = -1;
		for(int i = 0; i < n-1; i++) {
			if(arr[i] == 0 && zero == -1) zero = i;
			if(arr[i] == 1 && one == -1) one = i;
			if(arr[i] == 2 && two == -1) two = i;
			if(arr[i] == 2 && arr[i+1] == 0) {
				if(one == -1) {
					arr[two] = 0;
					arr[i+1] = 2;
					two++;
					zero = 0;
				}else {
					arr[one] = 0;
					arr[two] = 1;
					arr[i+1] = 2;
					zero = 0;
					one++;
					two++;
				}
			}else if(arr[i] == 2 && arr[i+1] == 1) {
				if(one == -1) {
					arr[two] = 1;
					arr[i+1] = 2;
					one = two;
					two++;
				}else {
					arr[two] = 1;
					arr[i+1] = 2;
					two++;
				}
				
			}else if(arr[i] == 1 && arr[i+1] == 0) {
				if(two == -1) {
					arr[one] = 0;
					arr[i+1] = 1;
					one++;
				}else {
					arr[one] = 0;
					arr[two] = 1;
					arr[i+1] = 2;
					one++;
					two++;
				}
				
			}
		}
		for(int i = 0;i < n; i++) System.out.print(arr[i]+" ");;
		System.out.println();
	}
	public static void sort012Dutch() {
		System.out.println("Sort012Dutch : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = s.nextInt();
		int low = 0, mid = 0, high = n-1;
		while(low <= mid && mid <= high) {
			if(arr[mid] == 2) {
				int temp = arr[high];
				arr[high--] = arr[mid];
				arr[mid] = temp;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				int temp = arr[low];
				arr[low++] = arr[mid];
				arr[mid++] = temp;
 			}
		}
		for(int i = 0; i < n; i++) System.out.print(arr[i] +" ");
		System.out.println();
	}
	public static void sumOfTwoArrays() {
		System.out.println("SumOfTwoArrays : ");
		int n = s.nextInt();
		int arr1[] = new int[n];
		for(int i = 0; i < n; i++) arr1[i] = s.nextInt();
		int m = s.nextInt();
		int arr2[] = new int[m];
 		for(int i = 0; i < m; i++) arr2[i] = s.nextInt();
 		int o = m>n ? m+1 : n+1;
 		int out[] = new int[o];
 		int carry = 0, a1 = n-1, a2 = m-1;
 		o--;
 		while(a1 >= 0 && a2 >= 0) {
 			out[o--] = (arr1[a1] + arr2[a2] + carry) %10;
 			carry = (arr1[a1--] + arr2[a2--] + carry) /10;
 		}
 		while(a1 >= 0) {
 			out[o--] = (arr1[a1] + carry) %10;
 			carry = (arr1[a1--] + carry) /10;
 		}
 		while(a2 >= 0) {
 			out[o--] = (arr2[a2] + carry) %10;
 			carry = (arr2[a2--] + carry) /10;
 		}
 		if(carry != 0) out[0] = carry;
 		for(int i = 0; i < out.length; i++) System.out.print(out[i]);
 		System.out.println();
	}
	
	
	
	
	
	
	
	
}

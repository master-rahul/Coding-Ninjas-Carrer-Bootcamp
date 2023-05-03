package Arrays;

import java.security.PublicKey;
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
		sort01();
		
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
}

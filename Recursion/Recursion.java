package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.io.IOException;

public class Recursion{
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException {
		System.out.println("Welcome to Recursion : ");
		//calculatePower();
		//numberOfDigits();
		//printFirstNNaturalNumber();
		//sumOfArray();
		//checkNumberInArray();
		//firstIndexOfNumber();
		//lastIndexOfNumber();
		//removeX();
		//removeDuplicates();
		//mergeSort_1();
		//mergeSort_2();
		//quickSort();
		//towerOfHanoi();
		//geometricProgression();
		//checkPalindrome();
		//sumOfDigits();
		//multiplyTwoNumbers();
		//countZeros();
		//stringToInteger();
		//pairStar();
		//checkAB();
		stairCase();
	}
	public static void swap(int[] arr, int i, int j) {
		if(i==j) return;
		arr[i] += arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}
	public static void calculatePower() throws IOException {
		System.out.println("Calculate Power : ");
		int x = Integer.parseInt(reader.readLine());
		int n = Integer.parseInt(reader.readLine());
		System.out.println(calculatePower(x, n));
	}
	public static int calculatePower(int x, int n) {
		if(n == 0) return 1;
		if(n > 0) return x * calculatePower(x, n-1);
		else return x * calculatePower(x, n+1) * -1;
	}
	public static void numberOfDigits() throws IOException{
		System.out.println("Number of Digits : ");
		int n = Integer.parseInt(reader.readLine());
		System.out.println(numberOfDigits(n));
	}
	public static int numberOfDigits(int n) {
		if(n == 0) return 0;
		return numberOfDigits(n/10) +1;
	}
	public static void printFirstNNaturalNumber() throws IOException{
		System.out.println("PrintFirstNNaturalNuber : ");
		int n = Integer.parseInt(reader.readLine());
		printFirstNNaturalNumber(n);
		System.out.println();
	}
	public static void printFirstNNaturalNumber(int n) {
		if(n == 0) return;
		printFirstNNaturalNumber(n-1);
		System.out.print(n+" ");
	}
	public static void sumOfArray() throws IOException{
		System.out.println("SumOfArray : ");
		int n = Integer.parseInt(reader.readLine());
		String[] arrString = reader.readLine().split(" ");
		int[] arr = new int[arrString.length];
		for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(arrString[i]);
		System.out.println(sumOfArray(n, arr));
	} 
	public static int sumOfArray(int n, int[] arr) {
		if(n == 0) return 0;
		return arr[n-1] + sumOfArray(n-1, arr);
	}
	public static void checkNumberInArray() throws IOException {
		System.out.println("CheckNumberInArray : ");
		int n = Integer.parseInt(reader.readLine());
		String[] arrString = reader.readLine().split(" ");
		int[] arr = new int[arrString.length];
		int x = Integer.parseInt(reader.readLine());
		for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(arrString[i]);
		System.out.println(checkNumberInArray(n, arr, x));
	}
	public static boolean checkNumberInArray(int n, int[] arr, int x) {
		if(n == 0) return false;
		if(arr[n-1] == x) return true;
		return checkNumberInArray(n-1, arr, x);
	}
	public static void firstIndexOfNumber() throws IOException {
		System.out.println("FirstIndexOfNumber : ");
		int n = Integer.parseInt(reader.readLine());
		String[] arrString = reader.readLine().split(" ");
		int[] arr = new int[arrString.length];
		int x = Integer.parseInt(reader.readLine());
		for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(arrString[i]);
		System.out.println(firstIndexOfNumber(0, arr, x));
	}
	public static int firstIndexOfNumber(int i, int[] arr, int x) {
		if(i == arr.length) return -1;
		if(arr[i] == x) return i;
		return firstIndexOfNumber(i+1, arr, x);
	}
	public static void lastIndexOfNumber() throws IOException {
		System.out.println("LastIndexOfNumber : ");
		int n = Integer.parseInt(reader.readLine());
		String[] arrString = reader.readLine().split(" ");
		int[] arr = new int[arrString.length];
		int x = Integer.parseInt(reader.readLine());
		for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(arrString[i]);
		System.out.println(lastIndexOfNumber(n, arr, x));
	}
	public static int lastIndexOfNumber(int n, int[] arr, int x) {
		if(n == 0) return -1;
		if(arr[n-1] == x) return n-1;
		return lastIndexOfNumber(n-1, arr, x);
	}
	public static void removeX() throws IOException{
		System.out.println("RemoveX : ");
		String s = reader.readLine();
		char c = reader.readLine().charAt(0);
		System.out.println(removeX(s,c));
	}
	public static String removeX(String s, char c) {
		if(s.length() == 0) return "";
		String s1 = "";
		if(s.charAt(0) != c) s1 += s.charAt(0);
		return s1 + removeX(s.substring(1), c);	
	}
	public static void removeDuplicates() throws IOException{
		System.out.println("RemoveDuplicates : ");
		String s = reader.readLine();
		System.out.println(removeDuplicates(s));
	}
	public static String removeDuplicates(String s) { 
		 if(s.length() <= 1) return s;
		 if(s.charAt(0) == s.charAt(1)) return removeDuplicates(s.substring(1));
		 else return s.charAt(0) + removeDuplicates(s.substring(1));
	}
	public static void mergeSort_1() throws IOException {
		System.out.println("MergeSort_1 : ");
		int n = Integer.parseInt(reader.readLine());
		String[] arrString = reader.readLine().split(" ");
		int[] arr = new int[arrString.length];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(arrString[i]);
		int[] ans = mergeSort_1(arr);
		System.out.println("------------------------------");
		for(int i : ans) System.out.print(i+" ");
	}
	public static int[] mergeSort_1(int[] arr){
		if(arr.length <= 1) return arr;
		int mid = arr.length/2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		for(int i = 0; i < mid; i++) left[i] = arr[i];
		for(int i = mid; i < arr.length; i++) right[i-mid] = arr[i];
		return merge_1(mergeSort_1(left), mergeSort_1(right));
	}
	public static int[] merge_1(int[] left, int[] right){
		for(int i = 0; i < left.length; i++) System.out.print(left[i] +" ");
		System.out.print("-- ");
		for(int i = 0; i < right.length; i++) System.out.print(right[i]+" ");
		System.out.print(" :: ");
		int[] arr = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;
		while(i < left.length && j < right.length) {
			if(left[i] >= right[j]) arr[k++] = right[j++];
			else arr[k++] = left[i++];
		}
		while(i < left.length) arr[k++] = left[i++];
		while(j < right.length) arr[k++] = right[j++];
		for(int l = 0; l < arr.length; l++) System.out.print(arr[l]+" ");
		System.out.println();
		return arr;
	}
	public static void mergeSort_2() throws IOException {
		System.out.println("MergeSort_2 : ");
		int n = Integer.parseInt(reader.readLine());
		String[] arrString = reader.readLine().split(" ");
		int[] arr = new int[arrString.length];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(arrString[i]);
		mergeSort_2(arr, 0, arr.length -1);
		for(int i : arr) System.out.print(i+" ");
	}
	public static void mergeSort_2(int[] arr, int l, int r){
		if(l == r) return;
		int m = (l+r)/2;
		mergeSort_2(arr, l , m);
		mergeSort_2(arr, m+1, r);
		merge_2(arr, l, m, r);
	}
	public static void merge_2(int[] arr, int l, int m, int r) {
		int[] temp = new int[r-l+1];
		int k = 0, i = l, j = m+1;
		while(i <= m && j <= r) {
			if(arr[i] > arr[j]) temp[k++] = arr[j++];
			else temp[k++] = arr[i++];
		}
		while(i <= m) temp[k++] = arr[i++];
		while(j <= r) temp[k++] = arr[j++];
		for(int n = l; n <= r; n++) arr[n] = temp[n-l];
	}
	public static void quickSort() throws IOException {
		System.out.println("QuickSort_2 : ");
		int n = Integer.parseInt(reader.readLine());
		String[] arrString = reader.readLine().split(" ");
		int[] arr = new int[arrString.length];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(arrString[i]);
		quickSort(arr, 0, arr.length-1);
		for(int i : arr) System.out.print(i+" ");
	}
	public static void quickSort(int[] arr, int l, int r) {
		if(l >= r) return;
		int pivot = partition(arr, l, r);
		quickSort(arr, l, pivot-1);
		quickSort(arr, pivot+1, r);
	}
	public static int partition(int[] arr, int l, int r) {
		int num = arr[l], count = 0;
		for(int i = l; i <= r; i++) if(arr[i] < num) count++;
		int pivot = count + l;
		swap(arr, l, pivot);
		int i = l, j = pivot +1;
		while(i < pivot && j <= r) {
			if(arr[j] > num) j++;
			else if(arr[i] < num) i++;
			else swap(arr, i++, j++);
		}
		for( i = 0; i < arr.length; i++) System.out.print(arr[i] +" ");
		System.out.println("::: "+ pivot +" L : "+l+", R : "+ r);
		return pivot;
		
	}
	public static void towerOfHanoi() throws IOException {
		System.out.println("TowerOfHanoi : ");
		int num = Integer.parseInt(reader.readLine());
		towerOfHanoi(num, 'a', 'b', 'c');
	}
	public static void towerOfHanoi(int n, char a, char b, char c){
		if(n == 0) return;
		towerOfHanoi(n-1, a, c, b);
		System.out.println(a+" to "+c);
		towerOfHanoi(n-1, b, a, c);
	}
	public static void geometricProgression() throws IOException {
		System.out.println("GeometricProgression  :");
		int n = Integer.parseInt(reader.readLine());
		System.out.println(String.format("%.6f",geometricProgression(n)));
	}
	public static double geometricProgression(int n) {
		if(n == -1) return 0.0;
		return 1 / Math.pow(2, n) + geometricProgression(n-1); 
	}
	public static void checkPalindrome() throws IOException {
		System.out.println("CheckPalindrome : ");
		String s = reader.readLine();
		System.out.println(checkPalindrome(s));
	}
	public static boolean checkPalindrome(String s){
		if(s.length() <= 1) return true;
		if(s.charAt(0) != s.charAt(s.length()-1)) return false;
		return checkPalindrome(s.substring(1, s.length()-1));
 	}
	public static void sumOfDigits() throws IOException {
		System.out.println("SumOfDigits : ");
		int n = Integer.parseInt(reader.readLine());
		System.out.println(sumOfDigits(n));
	}
	public static int sumOfDigits(int n){
		if(n == 0) return 0;
		return n%10 + sumOfDigits(n/10);
	}
	public static void multiplyTwoNumbers() throws IOException {
		System.out.println("MultiplyTwoNumbers : ");
		int n = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());
		System.out.println(multiplyTwoNumbers(n, m));
	}
	public static int multiplyTwoNumbers(int n, int m) {
		if(n == 0) return 0;
		return m + multiplyTwoNumbers(n-1, m);
	}
	public static void countZeros() throws IOException {
		System.out.println("CountZeros : ");
		int n = Integer.parseInt(reader.readLine());
		System.out.println(countZeros(n));
	}
	public static int countZeros(int n){
		if(n < 9 && n != 0) return 0;
		if(n < 9 && n == 0) return 1;
		return countZeros(n/10) + (n%10 == 0? 1: 0);
	}
	public static void stringToInteger() throws IOException {
		System.out.println("StringToInteger : ");
		String s = reader.readLine();
		System.out.println(stringToInteger(s));
	}
	public static int stringToInteger(String s) {
		if(s.length() == 0) return 0;
		return stringToInteger(s.substring(0, s.length()-1)) * 10 + (s.charAt(s.length()-1) -'0');
	}
	public static void pairStar() throws IOException {
		System.out.println("PairStar : ");
		String s = reader.readLine();
		System.out.println(pairStar(s));
	}
	public static String pairStar(String s) {
		if(s.length() <= 1) return  s;
		if(s.charAt(0) == s.charAt(1)) return s.charAt(0) + "*" + pairStar(s.substring(1));
		return s.charAt(0) + pairStar(s.substring(1));
	}
	public static void checkAB() throws IOException {
		System.out.println("CheckAB : ");
		String s = reader.readLine();
		System.out.println(checkAB(s));
	}
	public static boolean checkAB(String s) {
		if(s.length() == 0) return true;
		if(s.charAt(0) != 'a') return false;
		if(s.length() > 2 && s.substring(0, 3).equals("abb")) return checkAB(s.substring(3));
		return checkAB(s.substring(1));
	}
	public static void stairCase() throws IOException {
		System.out.println("StairCase : ");
		int n = Integer.parseInt(reader.readLine());
		System.out.println(stairCase(n));	
	}
	public static int stairCase(int n){
		if(n == 0) return 1;
		if(n < 0) return 0;
		return stairCase(n-1) + stairCase(n-2) + stairCase(n-3);
	} 
}


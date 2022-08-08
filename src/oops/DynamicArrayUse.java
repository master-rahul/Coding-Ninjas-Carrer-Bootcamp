package oops;

public class DynamicArrayUse {
	
	public static void main(String[] args) {
		
		DynamicArray arr1 = new DynamicArray(5);
		for(int i = 0; i < 5; i++) arr1.add(10+i);
		System.out.println(arr1.size());
		System.out.println(arr1.getIndex(4));
		arr1.add(5);
		arr1.add(6);
		arr1.add(7);
		arr1.add(8);
		System.out.println(arr1.size());
		arr1.add(9);
		System.out.println(arr1.size());
		arr1.print();
		System.out.println(DynamicArray.numberOfArrays);
		arr1.removeLast();
		arr1.print();
		arr1.setIndex(0, 99);
		arr1.print();
	}

}
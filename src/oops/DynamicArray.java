package oops;

public class DynamicArray {
	
	private int array[];
	private int index = 0;
	static int numberOfArrays = 0;
	
	DynamicArray(int size){
		numberOfArrays++;
		this.array = new int[size];
	}
	
	void add(int num) {
		if(array.length - 1  == index) {
			array[index++] = num;
			int temp[] = new int[array.length*2];
			for(int i = 0; i < index; i++) temp[i] = array[i];
			this.array = temp;
		}else array[index++] = num;
	}
	
	int size() {
		return array.length;
	}
	
	boolean isEmpty() {
		if(index == 0) return true;
		else return false;
	}
	
	int getIndex(int index) {
		if(index > this.index) return -1;
		return array[index];
	}
	
	void removeLast() {
		if(index != 0) array[--index] = 0;
	}
	
	void print() {
		
		for(int i = 0; i < index; i++) System.out.print(array[i]+" ");
		System.out.println();
	}
	
	void setIndex(int index, int value) {
		if(index > this.index) return;
		else array[index] = value;
	}
}

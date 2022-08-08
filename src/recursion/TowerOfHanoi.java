package recursion;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int disk, char source, char auxiliary, char destination) {
		if(disk == 1) {
		//	System.out.println("Disk "+disk+" : "+source+" to "+destination);
			return;
		}
		towerOfHanoi(disk-1, source, destination, auxiliary);
		//System.out.println("Disk "+disk+" : "+source+" to "+destination);
		towerOfHanoi(disk-1, auxiliary, source, destination);
	}
	
	public static void main(String[] args) {
		towerOfHanoi(35, 'a','b','c');
	}
}

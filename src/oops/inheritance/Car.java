package oops.inheritance;

public class Car extends Vehicle{
	int numDoors;
	int maxSpeed;
	
	public Car() {
		super(0);
		System.out.println("Cars constructor");
	}
	public Car(String var, String color, int maxSpeed, int numDoors) {
		super(0);
		setVar(var);
		this.color = color;
		this.maxSpeed  = maxSpeed;
		this.numDoors = numDoors;
	}
	public void print() {
		super.print();
		System.out.println("Vehicle : "+color +", "+maxSpeed+" "+numDoors);
	}
}

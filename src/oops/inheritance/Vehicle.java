package oops.inheritance;

public class Vehicle {
	
	private String var;
	protected String color;
	protected int maxSpeed;
	
	public Vehicle() {
		System.out.println("Vehicles constructor");
	}
	public Vehicle(int a) {
		System.out.println("Vehicles constructor");
	}
	
	public void print() {
		System.out.println("Vehicle : "+color +", "+maxSpeed);
	}
	
	public void setVar(String s) {
		var = s;
	}
	public String setVar() {
		return var;
	}
	
}

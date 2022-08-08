package oops;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	Fraction(){}
	
	Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	private void simplify() {
		int gcd = 1;
		for(int i = 1; i <= Math.min(numerator, denominator); i++ ) 
			if(numerator % i == 0 && denominator % i == 0) gcd = i;
		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}
	
	void increment() {
		numerator = numerator + denominator;
		simplify();
	}
	
	void print() {
		if(this.denominator == 1) System.out.println(numerator);
		else System.out.println(numerator +"/"+denominator);
	}
	
	void setNumerator(int numerator) {
		this.numerator = numerator;
		simplify();
	}
	
	void setDenominator(int denominator) {
		if(denominator != 0) this.denominator = denominator; 
		else this.denominator = 1;
		simplify();
	}
	
	void add(Fraction f1) {
		this.numerator = this.numerator * f1.denominator + f1.numerator * this.denominator;
		this.denominator = this.denominator * f1.denominator;
		simplify();
	}
	
	Fraction add1(Fraction f1, Fraction f2) {
		this.numerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
		this.denominator = f1.denominator * f2.denominator;
		this.simplify();
		return this;
	}
	
	static Fraction add(Fraction f1, Fraction f2) {
		Fraction f3 = new Fraction();
		f3.numerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
		f3.denominator = f1.denominator * f2.denominator;
		f3.simplify();
		return f3;
	}
}

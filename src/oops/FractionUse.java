package oops;

public class FractionUse {
	
	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(3,4);
//		f1.print();
//		f1.increment();
//		f1.print();
//		f1.setDenominator(10);
//		f1.setNumerator(28);
//		f1.print();
//		f1.increment();
//		f1.print();
		Fraction f2 = new Fraction(3,4);
//		Fraction f3 = Fraction.add(f1,f2);
//		f3.print();
//		f3.add(f1);
//		f3.print();
//		f3.increment();
//		f3.print();
		Fraction f4 = new Fraction();
		f4 = f4.add1(f1, f2);
		f4.print();
	}

}

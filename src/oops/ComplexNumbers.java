package oops;

public class ComplexNumbers {
	int real;
    int imaginary;
    
    ComplexNumbers(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    void plus(ComplexNumbers c1){
        this.real += c1.real;
        this.imaginary += c1.imaginary;
    }
    
    void multiply(ComplexNumbers c1){
        int a = this.real;
        int b = this.imaginary;
        this.real = this.real * c1.real - this.imaginary * c1.imaginary ;
        this.imaginary = a * c1.imaginary + c1.real * b;
    }
    
    void print(){
        System.out.println(real +" + i"+imaginary);
    }
	
}


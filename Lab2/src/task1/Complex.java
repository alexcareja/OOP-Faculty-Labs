package task1;

public class Complex {
    private int real;
    private int imaginary;

    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex(){
        this(0,0);
    }

    Complex(Complex n){
        this.real =  n.real;
        this.imaginary = n.imaginary;
    }

    int getReal(){
        return this.real;
    }

    int getImaginary(){
        return this.imaginary;
    }

    void setReal(int real){
        this.real = real;
    }

    void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }

    void addWithComplex(Complex x){
        this.real += x.real;
        this.imaginary += x.imaginary;
    }

    void showNumber(){
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

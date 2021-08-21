package week3.Day1;

public class Calculator {
	int c = 0;
	public void add(int a, int b) {
		c = a+b;
		System.out.println(c);
	}

	public void add(int a, int b, int c) {
		int c1 = a+b+c;
		System.out.println(c1);
	}

	public void multiply(int a, int b) {
		int c2 = a*b;
		System.out.println(c2);
	}

	public void multiply(int a, double b) {
		double c3 = a*b;
		System.out.println(c3);
	}

	public void subtract(int a, int b) {
		int c4 = a-b;
		System.out.println(c4);
	}

	public void subtract(double a, double b) {
		double c5 = a-b;
		System.out.println(c5);
	}

	public void divide(int a, int b) {
		int c6 = a/b;
		System.out.println(c6);
	}

	public void divide(double a, int b) {
		double c7 = a/b;
		System.out.println(c7);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.add(1, 2);
		calc.add(10, 10, 50);
		calc.divide(25.5, 10);
		calc.subtract(45.8, 78.5);
		calc.multiply(5, 860);

	}

}

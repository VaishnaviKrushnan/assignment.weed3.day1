package week3.Day1;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("Overriding the deposit method inside Axis Bank class");
	}

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.fixed();
		axis.savings();


	}

}

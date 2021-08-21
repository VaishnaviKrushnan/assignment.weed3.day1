package week3.Day1;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Inside Desktop Size method from desktop class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desk = new Desktop();
		desk.desktopSize();
		desk.computerModel();

	}

}

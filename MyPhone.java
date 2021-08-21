package week3.Day1;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************Inside Android Phone Method *******************************");
		AndroidPhone androidPhone = new AndroidPhone();
		androidPhone.makeCall();
		androidPhone.saveContact();
		androidPhone.sendMsg();
		androidPhone.takeVideo();
		
		System.out.println("*********************** Inside SmartPhone Method *****************************");
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.makeCall();
		smartPhone.saveContact();
		smartPhone.sendMsg();
		smartPhone.takeVideo();

	}

}

package chap05;

interface PhoneInterface{
	final int TIMEOUT = 10000;
	abstract void sendCall();				//abstract 생략가능
	abstract void receiveCall();			//abstract 생략가능
	default void printLogo() {				//생략하면 abstract가 되니까 default 라고 붙여주는 것
		System.out.println("**Phone**");
	}
}	

public class SamsungPhone implements PhoneInterface { //SamsungPhone에 빨간줄은 implements PhoneInterface명령어를 쓰고 구현을 해두지 않아서
													  //add implement해주기
	@Override
	public void sendCall() {
		System.out.println("띠리리리링~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
		System.out.println(phone.TIMEOUT);
	}



}

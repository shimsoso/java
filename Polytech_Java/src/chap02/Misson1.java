package chap02;

public class Misson1 {

	public static void main(String[] args) {
		boolean result;
		result = 3==5;
		System.out.println(result);
		System.out.println("=================");
		
		int a = (int) 3.5; // 캐스팅 연산자
		
		int plain = 10;
		int key = 8;
		int cyper = plain ^ key; //암호화 문장
		System.out.println("cyper = " + cyper);		
		System.out.println("plain = " + (cyper^key));
		//암호문에 key 값으로 원본화 시킴
		System.out.println("=================");
		System.out.println(10 >> 1); //shift 연산자
		System.out.println(10 << 1); //shift 연산자
		
		System.out.println("=================");
		var v = 30;
		System.out.println(v);
	}

}

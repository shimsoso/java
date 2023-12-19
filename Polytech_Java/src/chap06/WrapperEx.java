package chap06;

public class WrapperEx {

	public static void main(String[] args) {
		//Integer i = new Integer(10); //박싱
		Integer i = 10;				   //오토박싱
		Integer i1 = new Integer("10");
		System.out.println(i);
		System.out.println(i1);
		
		char c1 = '4';
		char c2 = 'A';
		if(Character.isDigit(c1))		System.out.println("c1 = 숫자입니다");
		if(Character.isAlphabetic(c2))	System.out.println("c2 = 알파벳 입니다");
		
		
		
	}

}

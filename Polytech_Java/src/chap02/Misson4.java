package chap02;

import java.util.Scanner;

public class Misson4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int num = scan.nextInt();
		int tennum = num/10;
		int onenum = num%10;
		
		// 조건연산자
		
//	 	String msg = (tennum == onenum) ? "YES! 10의 자리와 1의 자리가 같습니다." :
//			"NO! 같지 않습니다.";
//	 	
//	 	System.out.println(msg);
//		
		
		//조건식 if문 활용
		
		String msg;
		
		if (tennum == onenum)
			msg = "YES! 십의 자리와 일의 자리가 같습니다.";
		
		else
			msg = "NO! 같지 않습니다.";
		
		
		
		scan.close();

	}

}

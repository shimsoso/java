package chap02;

import java.util.Scanner;
//Scanner 클래스를 이용하여 원화를 입력 받아 달러를 바꾸어 다음 예시와 같이
//출력하는 프로그램을 작성하라
//$1 = 1100 으로 가정하고 계산하라.

//원화 입력 (단위 원) >> 3300
//3300원은 $3.0 입니다. 

public class Misson3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원화 입력 (단위 원)>>");
		int won = scan.nextInt();
		System.out.println(won+"원은 " + (double)won/1100 + "$ 입니다.");
		
		scan.close();
		
	}

}

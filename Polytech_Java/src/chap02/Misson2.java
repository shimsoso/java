package chap02;

import java.util.Scanner;


public class Misson2 {

	public static void main(String[] args) {
		//자동 import : Ctrl + Shift + O
		//한줄 복사 : Ctrl + Alt + 방향키
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력할 내용을 적어주세요 >>");
		String msg = scan.next();//입력했을때 첫번째 아이를 가져오는 역할
		System.out.println("msg = " + msg);

		
		
		System.out.print("입력할 숫자를 적어주세요 >>");
		int num = scan.nextInt();//입력했을때 첫번째 아이를 가져오는 역할
		System.out.println("num = " + num);
		
	}
}

package chap03;

import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		//1. While 문 사용
		System.out.println("토익점수 >> ");
		int toeic = scan.nextInt();
		
		while(true) { //true를 사용하면 무한루프가 됨
			if(toeic>700) break;
			System.out.println("공부를 하세요!");
			System.out.println("시험을 보세요!");
			System.out.println("토익점수 >> ");
			toeic = scan.nextInt();			
		}
		
		System.out.println("드디어 토익 탈출!");

	}

}

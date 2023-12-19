package chap03;

import java.util.Random;
import java.util.Scanner;

// user 와 com이 있다.
// user는 1,2,3 - 가위바위보
// com 은 random 하게 컴퓨터가 생성한다.
// 1회의 게임을 하고 누가 이겼는지 화면에 출력하라!
// if 또는 switch 중에 결정해서 프로그램 작성

public class Mission02 {

	public static void main(String[] args) {
		/*
		 1) Math.random() 메소드를 활용해서 난수를 생성 
		 int com = (int)(1 + Math.random()*3);//1~3사이의 난수*/
		 
		/* 
		2) Random() 클래스의 nextInt, nextDouble.. */
		 Random rand = new Random();	
		 int count = 0;
		 
		 while(true) {
			 count ++;
			 if(count > 3) break;
			 int com = 1 + rand.nextInt(3);
			 
			 Scanner scan = new Scanner(System.in);
			 System.out.print("가위(1), 바위(2), 보(3) >> ");
			 int user = scan.nextInt();
			 
			 System.out.println("user는 " + user);
			 System.out.println("com은 " + com);
			
			 if (user == 1) {
				 if (com == 1) 				System.out.println("비겼습니다.");
				 else if (com == 2) 		System.out.println("졌습니다");
				 else 						System.out.println("이겼습니다.");
			 }
			 
			 if (user == 2) {
				 if (com == 1) 				System.out.println("이겼습니다.");
				 else if (com == 2) 		System.out.println("비겼습니다.");
				 else 						System.out.println("졌습니다.");
			 }
			 
			 if (user == 3) {
				 if (com == 1) 				System.out.println("졌습니다.");
				 else if (com == 2) 		System.out.println("이겼습니다.");
				 else 						System.out.println("비겼습니다.");
			 }
		 }
		
	}
}	

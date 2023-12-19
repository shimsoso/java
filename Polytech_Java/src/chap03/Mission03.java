package chap03;

import java.util.Random;
import java.util.Scanner;

//UP and DOWN 게임
//사용자 : 1~99까지의 값을 입력
//컴퓨터 : 1~99까지의 값을 입력
//사용자가 컴퓨터 값을 맞추면 게임 성공!
//사용자>컴퓨터 down 시켜!
//사용자<컴퓨터 up 시켜!

//trial = 7회
//성공 : 이겼다!! , 실패 : 서로횟수출력!!  실패했다!!

public class Mission03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();	
		
		int count = 0;
		final int TRY_NUMBER = 10;
		boolean state = true;
		int com = 1 + rand.nextInt(99);
		
		while(true) {
			count++;
			if (count > TRY_NUMBER) {
				state = false;
				break;
			}
			rand.setSeed(System.currentTimeMillis());
			System.out.println(System.currentTimeMillis());
			
			
			
			System.out.println("숫자 맞춰보기! >>");
			int user = scan.nextInt();
			
			if (user > com)							System.out.println("DOWN!!");
			else if (user < com)					System.out.println("UP!!");
			else	{								System.out.println("딩동댕!");
			
				break;
			}
		
		}
		
		
		System.out.println("=========================");
		if(state) 				System.out.println("승리");
		else					System.out.println("패배");
		
		scan.close();
	}
		
		
		
}


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

public class Mission031 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();	
		
		//1. 컴퓨터 값을 생성한다.
		rand.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		int com = 1 + rand.nextInt(99);
		final int TRY_NUMBER = 7; 	//앞에 final을 붙이면 변경이 불가능한 상수값이 되는 것임. 
		
		int count = 0; 				// 시도횟수를 위한 카운트
		boolean state = true;		//상태변수 (성공이라고 가정)
		
		//3. 반복을 한다 (try_number횟수까지, 성공할때까지)
		while(true) {
			//2. 게임을 한다.
			count++;
			if (count > TRY_NUMBER) {
				state = false;
				break;
			}
			
			System.out.println("숫자 맞춰보기! >>");
			int user = scan.nextInt(); 
			
			if (user > com)							System.out.println("DOWN!!");
			else if (user < com)					System.out.println("UP!!");
			else break;	
			
		
		}
		
		
		System.out.println("=========================");
		if(state) 				System.out.println("승리");
		else					System.out.println("패배 시도횟수는 " + (count-1));
		
		scan.close();
	}
		
		
		
}


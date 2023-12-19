package chap03;

import java.util.Scanner;

public class Mission08 {
//while문을 이용하여 정수를 여러 개 입력 받고 평균을 출력하라. -1이 입력되면 입력을 종료한다.
	public static void main(String[] args) {
				
		
		int sum=0; int count=0; //총합, 정수의 갯수
		double average = 0.0; 	//평균
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시고 마지막에 -1을 입력하세요 >> ");
		int n=scan.nextInt();
		
		while(n!=-1) {
			sum += n;			//sum = sum+n
			count++;
			n = scan.nextInt(); //와일문 루프를 위해서
		}
		if(count>0) {
			System.out.print("정수의 개수는" + count + "개이며");
			average = (double)sum/count; //정수 정수 계산은 정수만 나옴. 그래서 sum과 count 둘 중 하나만 double로 바꿔줌(큰 수를 따라가기 때문)
			System.out.println("평균은" + average + "");
		}
		else
			System.out.println("입력된 정수가 없습니다.");
		
	}

}

package chap02;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//65376
		System.out.print("금액을 입력하시오 >> ");
		int num = scan.nextInt();
		int 오만 = num/50000;
		int res = (num%50000);
		int 만 = (num/10000)-5;
		int 천 = (num%10000)/1000;
		int 백 = ((num%1000)-(num%100))/100;
		int 오십 = (((num%100)-(num%10))/10)/5;
		int 십 = res/10;
		res = (num%10);
		int 일 = res/1000;
		
		System.out.println("오만원권" + 오만 + "매");
		System.out.println("만원권" + 만 + "매");
		System.out.println("천원권" + 천 + "매");
		System.out.println("백원" + 백 + "매");
		System.out.println("오십원" + 오십 + "매");
		System.out.println("십원" + 십 + "매");
		System.out.println("일원" + 일 + "매");
	}

}

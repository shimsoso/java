package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx2 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		//1.StringTokenizer 이용한 프로그램
		while(true) {
			int count = 0; //어절의 갯수를 0으로 초기화
			System.out.print(">>");
			String a = scan.nextLine();
			if(a.equals("그만"))		{
				System.out.println("종료합니다");
				break;
			}
			st = new StringTokenizer(a, " ");
//			while(st.hasMoreTokens()) {
//				st.nextToken();
//				count++;
//			}
			System.out.println("어절 개수 : " + st.countTokens());
		}
		
		//2.split 이용한 프로그램
//		while(true) {
//			System.out.print(">>");
//			String a = scan.nextLine();
//			
//			if(a.equals("그만"))	{
//				System.out.println("종료합니다");
//				break;
//			
//			String s []  = a.split(" ");
//			System.out.println("어절 개수 : " + s.length);
//		}
		
	
				
	}

}

package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx2 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		//1.StringTokenizer �̿��� ���α׷�
		while(true) {
			int count = 0; //������ ������ 0���� �ʱ�ȭ
			System.out.print(">>");
			String a = scan.nextLine();
			if(a.equals("�׸�"))		{
				System.out.println("�����մϴ�");
				break;
			}
			st = new StringTokenizer(a, " ");
//			while(st.hasMoreTokens()) {
//				st.nextToken();
//				count++;
//			}
			System.out.println("���� ���� : " + st.countTokens());
		}
		
		//2.split �̿��� ���α׷�
//		while(true) {
//			System.out.print(">>");
//			String a = scan.nextLine();
//			
//			if(a.equals("�׸�"))	{
//				System.out.println("�����մϴ�");
//				break;
//			
//			String s []  = a.split(" ");
//			System.out.println("���� ���� : " + s.length);
//		}
		
	
				
	}

}

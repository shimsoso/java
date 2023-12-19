package chap06;

import java.util.StringTokenizer;

//남자들의 체중의 평균을 구하라
public class StringTokenizerEx1 {
	
	public static void main(String[] args) {
		
		String data = " 홍길동, 010-1234-5678, 서울시, 학생";
		String data1 = "홍길동,남,65,170/김세영,여,57,164/이장군,남,80,190/김명수,남,77,167/홍미영,여,64,165";
		
		StringTokenizer st = new StringTokenizer(data,",");
		StringTokenizer st1 = new StringTokenizer(data1,"/");
		
		
//		while(st.hasMoreTokens()) {
//			System.out.println("이름 : " + st.nextToken());
//			System.out.println("번호 : " + st.nextToken());
//			System.out.println("주소 : " + st.nextToken());
//			System.out.println("직업 : " + st.nextToken());
//			
//		}
		int sum = 0;
		int count = 0;
		
		while(st1.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st1.nextToken(), ",");
			while(st2.hasMoreTokens()) {
				if(st2.nextToken().equals("남")) {
					count++;
					sum+=Integer.parseInt(st2.nextToken()) ;
					
				}
			
			}
			
		}
		System.out.println("남자들의 평균 체중 : " + ((double)sum)/count);
		
	}
}

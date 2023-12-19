package chap03;

//1. while문 활용 : 1~10까지의 수를 합산하여 결과값(sum)을 출력하시오.

public class Mission04 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0; //누적합 (초기화는 항상 0)
		 do{
			sum += num;
			num++;
		 }while (num<=10);
		//2. for문 활용 
//		int sum = 0;
//		for(int num=1; num<=10; num++)
//			sum += num;
//		
		System.out.println("sum = " + sum);
	}

}

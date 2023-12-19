package chap03;

//1. while문 활용 : 1~10까지의 수를 합산하여 결과값(sum)을 출력하시오.

public class Mission05 {

	public static void main(String[] args) {
		
		//1. 1~100까지의 숫자중의 13의 배수만 합산하라.
		
		int sum = 0;
		for(int num=1; num<=100; num++)
			if(num%13==0) sum += num;
		
		//2. 1~100까지의 숫자중의 13이 되기 전까지만 합산하라.
		
		sum=0;
		for(int num=1; num<=100; num++) {
			if(num%13==0) break;
			sum += num;
		}
		
		//3. 1~100까지의 숫자 중의 13을 제외한 숫자만 합산하라.
		
		sum=0;
		for(int num=1; num<=100; num++) {
			if(num%13==0) continue;
			sum += num;
		}
		
		System.out.println("sum = " + sum);
	}

}

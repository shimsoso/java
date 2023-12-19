package chap03;


public class Mission11 {

	public static void main(String[] args) {
		 int lotto_num[] = new int [7]; //7개의 방
		 String names[] = {"삼겹살", "치킨", "족발"};
		 
		 //배열에 값 입력
		 for(int i=0; i<7; i++)  {//번호가 6번까지이기 때문에 i<7
			 lotto_num[i] = (int)(1 + Math.random() * 45);   //i번째의 방에 1~45까지의 i의 값을 랜덤으로 입력
			 for(int j=0; j<i; j++)
				 if(lotto_num[i] == lotto_num[j]) i--; //i와 j 의 값이 같으면 다시 돌려야하는데 그대로 가버리면 i값이 
			 										   //1++ 되버리므로 i-- 해서 돌려줌
		 }
		 //배열에 값 출력
		 for(int num : lotto_num)
			 System.out.printf("%5d", num); //배열의 공식같은 것.
		 
		 System.out.println();
		 
		 for(String name : names)
			 System.out.println(name + "  ");
	}

}

package chap03;

public class Selection_Sort {

	public static void main(String[] args) {
		int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
		
		
		
			//최소값 알고리즘
			System.out.println("정렬 전 :");
			
			for(int iu : iu_height) 				//iu_height집에서 iu방 한 칸 한 칸의 값을 꺼내옴
				System.out.print(iu + " ");
				System.out.println();
					
				//3.단계별로 반복하기
				for(int i=0; i <7; i++)
				{
				int min = iu_height[0]; 			//iu_height 0번방에 들어있는 값이 최소라고 가정
				int min_index = 0; 					//0번방이 최소값이라고 가정했으므로 셋팅해두기
				for(int j=1; j<8; j++)
					if(min > iu_height[j]) {
						min = iu_height[j];			
						min_index = j;
					}
				
				
				//교환 알고리즘
				int temp = iu_height[min_index];
				iu_height[min_index] = iu_height[0];
				iu_height[0] = temp;
				}
				
				System.out.println("정렬 후 :");
				for(int iu : iu_height) 				
					System.out.print(iu + " ");
				System.out.println();
		
			
	}

}

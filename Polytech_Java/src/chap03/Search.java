package chap03;

import java.util.Scanner;

public class Search {

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
				
//=============================================================================================
				//탐색 알고리즘
				System.out.println("순차탐색================");
				Scanner scan = new Scanner(System.in);
				System.out.print("검색키값 >> ");
				int key = scan.nextInt();
				int key_index = -1;						//키인덱스는 검색된 값의 인덱스값, -1인경우 실패로 가정
				
				//순차탐색 (Sequential Search)
				
				
				for(int i=0; i<8; i++)
					if(iu_height[i]==key)
						key_index = i;
				
				if(key_index == -1) System.out.println("검색실패!");
				else				System.out.println("검색성공! : " + key_index + "번방에 있습니다.");
				
				//이진탐색 (Binary Search)
				System.out.println("이진탐색================");
				int low = 0, high = 7; 			//low, high 초기화
				int middle = 0;					//중간방의 인덱스
				
				System.out.print("검색키값 이진탐색 ver >> ");
				key = scan.nextInt();
				key_index = -1;
				
				while(low<=high)
				{
					
					middle = (low + high) / 2;
					System.out.println("[low]" + low + "[high]" + high + 
							"[middle]" + middle + "[value]" + iu_height[middle]);
					
					if(key == iu_height[middle]) {
						key_index = middle;
						break;
					}
					else if(key > iu_height[middle])
						low = middle + 1;
						
					else if (key < iu_height[middle])
						high = middle - 1;
				}
				if(key_index == -1) System.out.println("검색실패!");
				else				System.out.println("검색성공! : " + key_index + "번방에 있습니다.");
				
				System.out.println("원소의 갯수 : " + iu_height.length);
				
				for(int i =0; i < iu_height.length; i++)
					System.out.println(iu_height[i] + " ");
				
				
	}

}

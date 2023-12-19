package chap03;

import java.util.Random;
import java.util.Scanner;

public class Mission0328 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
			
			int com = rand.nextInt(100);
			int count = 0;
			int max = 99;
			int min = 0;
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			System.out.println(min + "-" + max);
			
			while(true) {
					count++;
					System.out.print(count + ">>");
					int user = scan.nextInt();
					
					if (user>com) 		{		System.out.println("더 낮게");
												max = user;
												System.out.println(min + "-" + max);
					}
					else if (user<com) 	{		System.out.println("더 높게");
												min = user;
												System.out.println(min + "-" + max);
					}
					else {						System.out.println("맞았습니다.");
							break;
					}
			}
			
			System.out.print("다시하시겠습니까(y/n)>>");
			String text = scan.next();
					
			if(text.equals("n")) {
				System.out.println("게임종료");
					break;
			}
					else continue;
			
			
		}
		
	}
	

}

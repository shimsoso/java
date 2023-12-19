package chap03;

public class Mission06 {

	public static void main(String[] args) {
		
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++)			System.out.print("*"); //별그리고
			System.out.println();								   //밑으로 한 줄
		}
		
		System.out.println("======================");
		
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++)			System.out.print("*"); //별그리고
			System.out.println();								   //밑으로 한 줄
		}
		
		System.out.println("======================");
		
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=6-x; y++)			System.out.print("*"); //별그리고
			System.out.println();								   //밑으로 한 줄
		}

	}

}

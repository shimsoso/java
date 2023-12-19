package chap01;

public class helloworld {
		public static int sum(int n, int m) {
			return n+m;
		}

		public static void main(String[] args) {
		// 한줄주석
		/* 영역주석 */
		// 주석 단축키 : ctrl +/
		// 실행 ctrl + f11
			int a = 10;
			int b = 20;
			int s = sum(a, b);
			System.out.println("Hello World!");
			System.out.println("a+b = " + s);
		}


}
	
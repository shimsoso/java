package chap01;

// 미션 1 : 주어진 섭씨 온도를 화씨 온도로 바꾸는 메소드를 작성하라.
// F = (9/5)*C + 32
// C : 15도라고 가정

public class Misson1 {
	public static double CtoF(double c) {
		return (9.0/5.0)*c + 32;
	}

	public static void main(String[] args) {
		double c = 14;
		System.out.println("화씨온도 : " + CtoF(c));

	}

}

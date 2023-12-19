package chap05;

//추상클래스 정의
abstract class Shape2{		//2. 괄호 안에 abstract를 달아줬으므로 class에도 달아줌
	abstract void draw(); //1. draw 가 구현이 안되있으므로 abstract를 달아줌
}

//추상클래스를 상속받아서 재정의해서 사용
class Circle1 extends Shape2{

	@Override
	void draw() {
		System.out.println("원그리기");
	}
}

class Line1 extends Shape2{

	@Override
	void draw() {
		System.out.println("선그리기");		
	}
}

class Rect1 extends Shape2{

	@Override
	void draw() {
		System.out.println("사각형그리기");		
	}
}

public class ShapeEx1 {

	public static void main(String[] args) {
		Shape2 s = new Circle1();
		s.draw();
	}

}

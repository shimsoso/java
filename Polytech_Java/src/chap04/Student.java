package chap04;

public class Student {
	//String형의 학과와 정수형의 학번을 필드로 선언
	//Student 클래스의 main() 메소드에서  Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력
	
	int id;
	String dept;
	
	
	public static void main(String[] args) {
		Student student = new Student();
		student.dept="스마트소프트웨어";
		student.id=20330011;
		System.out.println(student.dept + " : " + student.id);
	}
}

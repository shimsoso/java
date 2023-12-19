package chap05;

class Person{
	String name;
	int id;
	public Person(String name) {
		this.name = name;
	}
}
class Student3 extends Person{
	String grade;
	String depart;
	public Student3(String name) {
		super(name);
	}
}

public class UpcastingEx {

	public static void main(String[] args) {
		//Upcasting
		Person p = new Student3("심소영"); 
		System.out.println(p.name);
//		System.out.println(p.grade); 	//실행안됨
		Student3 s = new Student3("홍길동");
		System.out.println(s.grade);
		
		//Downcasting
		Student3 s2 = (Student3)p;
		System.out.println(s2.name);
		s2.depart = "하이테크";
		System.out.println(s2.depart);//실행되지요
		
		if(p instanceof Person) System.out.println("Person");
		else					System.out.println("Person 아니야");
	}

}

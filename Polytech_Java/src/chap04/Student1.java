package chap04;

public class Student1 {
	private String dept;
	private int id;
	
	public Student1() {}
	
	public Student1(String dept) {
		this.dept = dept;
	}
	public Student1(int id) {
		this.id = id;
	}
	public Student1(String dept, int id) {
		super();
		this.dept = dept;
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student1 [dept=" + dept + ", id=" + id + "]";
	} //화면에 출력하기 위한 함수
	
	
	
}

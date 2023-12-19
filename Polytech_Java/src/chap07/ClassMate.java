package chap07;

import java.util.ArrayList;

class Student {
	String name;
	int id;
public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


@Override
public String toString() {
	return "ClassMate [name=" + name + ", id=" + id + "]";
}
}

public class ClassMate {
	String class_name;
	static ArrayList<Student1> al = new ArrayList<Student1>();
	public static void main(String[] args) {
			Student1 s1 = new Student1("심소영", 1);
			al.add(s1);
			s1 = new Student1("김여원", 2);
			al.add(s1);
			System.out.println(al.get(1).getName());

	}

}

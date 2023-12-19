package chap07;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student2> map = new HashMap<>();

		map.put("황기태", new Student2(1, "010-111-1111"));
		map.put("이재문", new Student2(2, "010-222-2222"));
		map.put("김남윤", new Student2(1, "010-333-3311"));
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 이름?");
			String name = scan.nextLine();
			if(name.equals("exit")) break;
			System.out.println(map.get(name));
		}
	}

}

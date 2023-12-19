package chap07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Chap07Ex05 {

	public static void main(String[] args) {
		HashMap<String, Student1> h = new HashMap<String, Student1>();
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		Student1 s;
		
		System.out.println("학생이름, 학과, 학번, 학점평균을 콤마로 구분하여 입력하세요.");
		for(int i =0; i<4; i++) {
			st= new StringTokenizer(scan.nextLine(),",");
			while(st.hasMoreTokens()) {
				String name =st.nextToken().trim();
				String dept = st.nextToken().trim();
				int id = Integer.parseInt(st.nextToken().trim());
				double score = Double.parseDouble(st.nextToken().trim());
				s = new Student1(name, dept, id, score);
				h.put(name,s);
			}
		}

//		for(Student5 ss: a) {
//			System.out.println(ss);;
//			
//		}
		
		System.out.println("저장된 요소의 개수 : "+ h.size());
		
		Set<String> set = h.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(h.get(it.next()));
		}
		
//		for(String key : h.keySet())
//			System.out.println(h.get(key));
		
//		System.out.print("학생 이름 >> ");
//		String key = scan.next();
//		Iterator<Student5> it= a.iterator();
//		while(it.hasNext()) {
//			Student5 ssss= it.next();
//			if(ssss.getName().equals(key))
//				System.out.println(ssss);
//		}
		
//		while(true) {
//			System.out.print("학생 이름 >> ");
//			String key = scan.next();
//			if(key.equals("그만")) {System.out.println("종료합니다.."); break;}
//			for(Student5 sss : a) {
//				if(sss.getName().trim().equals(key))
//					System.out.println(sss);
//			}
//		}
		
	}

}
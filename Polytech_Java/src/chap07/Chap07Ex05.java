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
		
		System.out.println("�л��̸�, �а�, �й�, ��������� �޸��� �����Ͽ� �Է��ϼ���.");
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
		
		System.out.println("����� ����� ���� : "+ h.size());
		
		Set<String> set = h.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(h.get(it.next()));
		}
		
//		for(String key : h.keySet())
//			System.out.println(h.get(key));
		
//		System.out.print("�л� �̸� >> ");
//		String key = scan.next();
//		Iterator<Student5> it= a.iterator();
//		while(it.hasNext()) {
//			Student5 ssss= it.next();
//			if(ssss.getName().equals(key))
//				System.out.println(ssss);
//		}
		
//		while(true) {
//			System.out.print("�л� �̸� >> ");
//			String key = scan.next();
//			if(key.equals("�׸�")) {System.out.println("�����մϴ�.."); break;}
//			for(Student5 sss : a) {
//				if(sss.getName().trim().equals(key))
//					System.out.println(sss);
//			}
//		}
		
	}

}
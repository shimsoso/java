package chap07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Chap07Ex071 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Double> b = new HashMap<String, Double>();
		
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		
		for(int i=0; i<5; i++) {
			System.out.print("�̸��� ����>> ");
			String name = scan.next();
			double score = scan.nextDouble();
			b.put(name, score);
		}
		
//		System.out.print("���л� ���� ���� ���� �Է� >> ");
//		double goodscore = scan.nextDouble();
//		for(String sss: b.keySet())
//			if(b.get(sss) >= goodscore) System.out.println(sss);
		
		
		
//		System.out.print("���л� ���� ���� ���� �Է� >> ");
//		double goodscore = scan.nextDouble();
//		Set<String> key = b.keySet();
//		Iterator<String> it = key.iterator();
//		System.out.print("���л� ��� : ");
//		while(it.hasNext()) {
//			String name = it.next();
//			if(goodscore < b.get(name)) {
//				System.out.print(name + " "); 
//			}
//		}
		
		Collection<Double> c = b.values();
		Iterator<Double> it = c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
		
}

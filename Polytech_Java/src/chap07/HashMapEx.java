package chap07;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("apple", "���");
		dic.put("lemon", "����");
		dic.put("orange", "������");
		dic.put("grape", "����");
		dic.put("melon", "�޷�");
		
		
		while(true) {
			System.out.print(dic.get("ã����� �ܾ� : "));
			String key = scan.next();
			if(key.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			}
			System.out.println(dic.get(key));
		}
		
	}

}

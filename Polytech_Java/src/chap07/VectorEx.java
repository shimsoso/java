package chap07;

import java.util.Vector;

public class VectorEx {

	public void printVector(Vector<Integer> v) {
		for(Integer i : v) System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(20);
		VectorEx ex = new VectorEx();
		v.add(5);	//int���� �����Ͱ� Integer�� �ڵ��ڽ̵Ǹ鼭 ��
		v.add(4);
		v.add(-1);
		v.add(6);
		v.add(2, 7);
		
		System.out.println("���� ��ü�� ��� ���� : " + v.size());
		System.out.println("������ ���� �뷮 : " + v.capacity());
		
		ex.printVector(v);
		
//		for(int i=0; i<v.size(); i++)
//			System.out.println("��� : " + v.get(i));
		
		int sum = 0;
		for(Integer i : v) sum += i;
		System.out.println("sum : " + sum);
		
	}

}

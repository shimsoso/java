package miniproject_db;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop{
	
	// ��� ����� ���� �迭
	User[] users = new User[2];
	// ��� ��ǰ ���� �迭
	Product[] products = new Product[4];
	// ��ǰ ������ �߰��� �� �ִ� ��ٱ���
	ArrayList<Product> cart = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);

	/* todo : �߰������� �ʿ��� �ʵ�
	-------------------------------------- */
	String title;		//���θ� �̸�
	int sel_user;		//���õ� ����� �ε���
	int sum=0; 			//��ٱ��� ���� �հ�
	
	/* setTitle : ���θ��� ���� �ޱ�
	 *====================================== */
	@Override
	public void setTitle(String title) {this.title = title;}
	
	/* genUser : ����������� ����ϱ�
	 *====================================== */
	@Override
	public void genUser() {
		User user = new User("ȫ�浿", PayType.CARD);
		users[0] = user;
		user = new User("�ɼҿ�", PayType.CASH);
		users[1] = user;
	}
	
	/* genUser : ��ǰ������ ����ϱ�
	 *====================================== */
	@Override
	public void getProduct() {
		// CellPhone ���
		CellPhone cell = new CellPhone("������S23", 1500000, "SKT");
		products[0] = cell;
		cell = new CellPhone("���þ�����14", 1000000, "KT");		
		products[1] = cell;
		// Smart TV ���
		SmartTV tv = new SmartTV("�Ｚ3D SmartTV", 3000000, "4K");
		products[2] = tv;
		tv = new SmartTV("LG SmartTV", 2000000, "FullHD");
		products[3] = tv;
	}
	/* start : ���θ��� ����ȭ���� ���� ���
	 *====================================== */
	@Override
	public void start() {	
		System.out.println(title + ": ���� ȭ�� - ���� ���� >>");
		System.out.println("=".repeat(30));
		//1. ����� ���� ��� 
		int index = 0;
		for(User u : users) {
			System.out.print("[" + index++ + "] ");
			System.out.println(u.toString());
		}		
		System.out.println("[x] ���� ");  // System.exit(0) ȣ�� - ���α׷� ����
		System.out.println("���� : ");
		
		String select = scan.next(); //���� : h, c, ��ǰindex
		switch(select) {
		case "x" : System.exit(0); break;  	//����ȭ������
		default : 
			//1. select ���� int ������ �ٲٰ�
			sel_user = Integer.parseInt(select);
			productList();
		}	
	}
	
	/* productList : ��ǰ���� ����ϱ�
	 *====================================== */
	public void productList() {
		System.out.println(title + ": ��ǰ ��� - ��ǰ ���� >>");
		System.out.println("======================================");
		int index = 0;
		for(Product p : products) {
			System.out.print("[" + index++ + "] ");
			p.printDefault();
		}		
		System.out.println("[h] ����ȭ�� ");	//start �޼ҵ�
		System.out.println("[c] üũ�ƿ� ");	//checkOut �޼ҵ�
		System.out.println("���� : ");
		
		String select = scan.next();	//���� : h, c, ��ǰ index
		switch(select) {
		case "h" : start(); break;
		case "c" : checkOut(); break;
		default : 
			//1. select ���� int ������ �ٲٰ�
			//2. int�� �ٲ� select ���� �ε���-psel�� ���� products ������
			//3. cart�� add ��Ų��.
			cart.add(products[Integer.parseInt(select)]);
			productList();
		}
	}
	
	/* checkOut : üũ�ƿ� �� �����ϱ�
	 *====================================== */
	public void checkOut() {
		System.out.println("=".repeat(30));
		System.out.println(title + ": üũ �ƿ� �ϱ�>>");
		System.out.println("=".repeat(30));
		
		int index = 0;
		for(Product p : cart) {
			System.out.print("[" + index++ + "] ");
			System.out.println(p.toString());
			System.out.println();
			sum += p.getPrice();
		}	
		
		// ����ڸ�, �������, ���ݾ� ���
		System.out.println("=".repeat(30));
		System.out.println("����ڸ� : " + users[sel_user].getName());
		System.out.println("����ڸ� : " + users[sel_user].getPaytype());
		System.out.println("=".repeat(30));
		System.out.println("���ݾ� : " + sum);
		System.out.println("[p] ����, [q] ���� �Ϸ�);");
		System.out.println("���� : ");
		
		// 
		String select = scan.next();	//���� : h, c, ��ǰ index
		switch(select) {
		case "p" : productList(); break;
		case "q" : 
			System.out.println("���θ� ���α׷��� ����˴ϴ�.");
			System.exit(0);
			break;
		default : 
			checkOut();
		}
	}
	
	// ���α׷��� �ó������� ���� �ʱ�ȭ�ϰ� �����Ѵ�.
	public void run() {
		setTitle("�ҿ��̳� ���θ�");
		genUser();
		getProduct();
		start();
		
	}
	
	public static void main(String args[]) {
		MyShop shop = new MyShop();
		shop.run();
	}
	
	
	
}

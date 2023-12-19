package miniproject;

public abstract class Product {
	String pname;
	int price;
	
	public void printDefault() {
		System.out.print("상품명 : " + pname + ", ");
		System.out.print("상품가격 : " + price + ", ");
		printExtra();
	}
	
	@Override
	public String toString() {
		return pname + "(" + price + ")";
	}
	
	
	public int getPrice() {
		return price;
	}

	public abstract void printExtra();
}
 
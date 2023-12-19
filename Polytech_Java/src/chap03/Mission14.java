package chap03;

public class Mission14 {

	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}

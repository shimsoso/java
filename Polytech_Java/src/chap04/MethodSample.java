package chap04;

public class MethodSample {
	
	
	//메소드 오버로딩
			int getSum(int x, int y) {return x+y;}
			int getSum(int x, int y, int z) {return x+y+z;}
			double getSum(double x, double y) {return (double)(x+y);}
			
			

	public static void main(String[] args) {
		
		MethodSample sample = new MethodSample(); //static을 사용하지 않기 위해 객체명을 달아주기
		System.out.println(sample.getSum(1,2));
		System.out.println(sample.getSum(1,2,3));
		System.out.println(sample.getSum(2.0,3.0));
		
		
	}

}

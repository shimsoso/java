package chap05;

class CPoint {
	private int a, b;
	
	void set(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void showPoint() {
		System.out.println("(" + a + "," + b + ")");
	}
	
}
class ColorPoint extends CPoint{
	
	
	private String color;
	void setColor(String color){
		this.color = color;
	}
	void showColorPoint() {
		System.out.println(this.color);
		showPoint();
	}
}


public class ColorPointEx {
	

	public static void main(String[] args) {
		CPoint p = new CPoint();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}


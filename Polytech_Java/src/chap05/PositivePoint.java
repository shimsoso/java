package chap04;

//Point를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를 작성하라.
//다음 main()메소드를 포함하고 실행결과와 같이 출력되게 하라.



class PositivePoint extends Point{
	public PositivePoint() {
		super(0,0);
	}
	
	public PositivePoint(int x, int y) {
		super(x,y);
		if (x<0 || y<0) {
			super.move(0,0);
		}
		
	}
	
	protected void move(int x, int y) {
		if (x>0 && y>0) {
			super.move(x, y);
		}
	}
	
	
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 점";
	}
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10,10);
        System.out.println(p.toString() + "입니다.");
        
        p.move(-5,5); //객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString() + "입니다.");
        
        PositivePoint p2 = new PositivePoint(-10,-10);
        System.out.println(p2.toString() + "입니다.");
    }

}

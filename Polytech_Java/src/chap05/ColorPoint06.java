package chap04;

//Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.
//다음 main()메소드를 포함하고 실행결과와 같이 출력되게 하라.



class ColorPoint06 extends Point{
	String color;
    public ColorPoint06(){
        super(0, 0);
        this.color = "BLACK";
    }
    public ColorPoint06(int x, int y) {
        super(x, y);
        this.color = "BLACK";
    }
    void setXY(int x, int y){
        move(x,y);
    }

    void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return color + "색의 (" + getX() + "," + getY() + ") 의 점";
    }



    public static void main(String[] args) {
        ColorPoint06 zeroPoint = new ColorPoint06(); //(0,0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString() + "입니다.");
        
        ColorPoint06 cp = new ColorPoint06(10,10); //(10,10) 위치의 BLACK 색 점
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다. ");
    }

}

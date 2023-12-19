package chap04;

//Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.
//다음 main()메소드를 포함하고 실행결과와 같이 출력되게 하라.

class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x =x; this.y = y; }
}

class ColorPoint05 extends Point{
    String color;
    public ColorPoint05(int x, int y, String color) {
        super(x, y);
        this.color = color;
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
        ColorPoint05 cp = new ColorPoint05(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str+"입니다. ");
    }

}

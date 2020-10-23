//p.384 #2

public class Circle1 {
    private int x;
    private int y;
    private int radius;
    public Circle1(int x, int y, int radius){
        this.x=x; this.y=y; this.radius=radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    boolean equals(Circle1 k){
        if ((x == k.getX()) && (y==k.getY())) return true;
        else return false;
    }

    public String toString(){
        return "Circle("+x+","+y+")반지름"+radius;
    }

    public static void main(String[] args) {
        Circle1 a = new Circle1(2,3,5);
        Circle1 b = new Circle1(2,3,30);
        System.out.println("원 a : "+a);
        System.out.println("원 b : "+b);
        if (a.equals(b))
            System.out.println("같은 원");
        else System.out.println("서로 다른 원");
    }
}

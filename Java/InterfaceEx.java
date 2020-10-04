
interface Shape{
    final double PI=3.14;
    void draw();                        //abstract method
    double getArea();                   //abstract method
    default public void redraw(){       //default method
        System.out.print("---다시 그립니다.");
        draw();
    }
}

class Circle implements Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void draw(){
        System.out.println(" 반지름이 "+radius+"인 원입니다.");
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public void redraw() {
        System.out.print("---다시 그립니다.");
        draw();
    }
}
class Triangle implements Shape{
    private int height;
    private int width;

    public Triangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println(" 높이:"+height+", 밑변:"+width+"의 삼각형입니다.");
    }

    @Override
    public double getArea() {
        return width*height/2;
    }

    @Override
    public void redraw() {
        System.out.print("---다시 그립니다.");
        draw();
    }
}

class Rect implements Shape{
    private int width2;
    private int height2;

    public Rect(int width2, int height2){
        this.width2 = width2;
        this.height2 = height2;
    }

    @Override
    public void draw() {
        System.out.println(" "+width2+"x"+height2+"크기의 사각형 입니다.");
    }

    @Override
    public double getArea() {
        return width2*height2;
    }

    @Override
    public void redraw() {
        System.out.print("---다시 그립니다.");
        draw();
    }
}





public class InterfaceEx {
    public static void main(String[] args) {
        Shape [] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Triangle(20,30);
        list[2] = new Rect(10,40);
        for (int i=0; i<list.length; i++) list[i].redraw();
        for (int i=0; i<list.length; i++)
            System.out.println("면적은 "+list[i].getArea());
        // 가장 면적이 큰 도형 구하기

        double big=0.0;
        for (int i=0; i<list.length; i++){
            if (list[i].getArea()>big)
                big = list[i].getArea();
        }
        System.out.println("-- 가장 큰 면적은 "+big+"입니다.");
    }
}

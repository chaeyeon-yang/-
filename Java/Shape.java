package Problem28;

class Shape {
    public Shape next;
    public Shape(){next = null;}

    public void draw(){
        System.out.println("Shape");
    }
}

class Line extends Shape{
    @Override
    public void draw(){
        System.out.println("Line");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

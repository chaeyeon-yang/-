
class Box {
    private int width = 10;
    private int length = 10;
    private int height = 10;
    private int volume;
    static int boxes = 0;

    public Box() { }

    public Box(int width, int length, int height) {
        boxes += 1;
        setWidth(width);
        setLength(length);
        setHeight(height);
        setVolume(width, length, height);
    }

    static int getBoxes() {
        return boxes;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int width, int length, int height) {
        this.volume = width * length * height;
    }

    public static void main(String[] args) {

    }
}
package shapes;

public class Rectangle {
    protected long length;
    protected long width;

    public Rectangle(long newLength, long newWidth) {
        this.length = newLength;
        this.width = newWidth;
    }

    public long getArea() {
        return this.length * this.width;
    }

    public long getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }


}

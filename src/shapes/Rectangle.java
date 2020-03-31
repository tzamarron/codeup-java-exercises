package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(long newLength, long newWidth) {
        super(newLength, newWidth);
    }

    @Override
    public long setLength(long length) {
        return this.length = length;
    }

    @Override
    public long setWidth(long width) {
        return this.width = width;
    }

    @Override
    public long getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public long getArea() {
        return length * width;
    }

    //    protected long length;
//    protected long width;
//
//    public Rectangle(long newLength, long newWidth) {
//        this.length = newLength;
//        this.width = newWidth;
//    }
//
//    public long getArea() {
//        return length * width;
//    }
//
//    public long getPerimeter() {
//        return (length * 2) + (width * 2);
//    }
}

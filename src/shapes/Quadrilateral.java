package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected long length;
    protected long width;

    // Constructor for Quadrilateral
    public Quadrilateral(long newLength, long newWidth){
        length = newLength;
        width = newWidth;
    }

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }

    public abstract long setLength(long length);

    public abstract long setWidth(long width);
}

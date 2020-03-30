package shapes;

public class Square extends Quadrilateral {

//    // Constructor for Square using parent constructor
//    public Square(long side) {
//        super(side, side);
//    }
//
//    @Override
//    public long getArea() {
//        long side = this.width;
//        return (long)Math.pow(side,2);
//    }
//
//    @Override
//    public long getPerimeter() {
//        long side = this.length;
//        return 4 * side;
//    }


    public Square(long side) {
        super(side, side);
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
        return length * 4;
    }

    @Override
    public long getArea() {
        return (long) Math.pow(width,2);
    }
}

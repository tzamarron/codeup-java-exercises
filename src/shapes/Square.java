package shapes;

public class Square extends Rectangle {
    // Constructor for Square using parent constructor
    public Square(long side) {
        super(side, side);
    }

    @Override
    public long getArea() {
        long side = this.width;
        return (long)Math.pow(side,2);
    }

    @Override
    public long getPerimeter() {
        long side = this.length;
        return 4 * side;
    }

}

package twu.mathematician;

public class Rectangle {

    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }


    public int calculateArea() {
        return length*width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }


    public static Rectangle square(int side) {

        return new Rectangle(side,side);
    }


    public boolean isSquare() {
        return this.length==this.width;
    }
}

package twu.mathematician;

//Job: Understands the shape with four straight sides
//     with 90 degree corners geometrically

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

    public String drawWithAsterisks() {
        StringBuffer drawing=new StringBuffer();
        for(int i=0;i<width;i++)
        {
            for (int j=0;j<length;j++)
            {
                drawing.append("*");
            }
            drawing.append("\n");
        }
        return drawing.toString();
    }
}

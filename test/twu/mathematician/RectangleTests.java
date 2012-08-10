package twu.mathematician;

import org.junit.Assert;
import org.junit.Test;

//Job: Tests the behaviour of Rectangle

public class RectangleTests {

    @Test
    public void shouldReturnLength(){
        Rectangle r = new Rectangle(2,2) ;
        int  length = r.getLength() ;
        Assert.assertEquals(2,length);
    }


    @Test
    public void shouldReturnWidth(){
        Rectangle r = new Rectangle(2,2) ;
        int  width = r.getWidth() ;
        Assert.assertEquals(2,width);
    }

    @Test
    public void shouldReturnArea() {
        Rectangle rectangle = new Rectangle(2,2);
        int area = rectangle.calculateArea() ;
        Assert.assertEquals(4, area);
    }

    @Test
    public void shouldReturnPerimeter() {
        Rectangle rectangle = new Rectangle(2,2);
        int perimeter = rectangle.calculatePerimeter();
        Assert.assertEquals(8, perimeter);
    }

    @Test
    public void shouldReturnASquare(){
        Rectangle square=Rectangle.square(5);
        Assert.assertTrue(square.isSquare());
    }

}

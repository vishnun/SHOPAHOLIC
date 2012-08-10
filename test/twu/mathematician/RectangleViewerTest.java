package twu.mathematician;

import org.junit.Assert;
import org.junit.Test;

//Job: Tests the behaviour of RectangleViewer

public class RectangleViewerTest{
    @Test
    public void shouldDrawRectangleWithAsterisks(){
        Rectangle rectangle=new Rectangle(3,2);
        RectangleViewer rectangleViewer=new RectangleViewer();
        String expectedString ="***\n***\n";
        String actualString = rectangleViewer.drawWithAsterisks(rectangle);
        Assert.assertEquals(expectedString, actualString);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateArea() {
        float a = 1;
        float b = 2;
        Rectangle rectangle = new Rectangle(a, b);
        assertEquals(rectangle.calculateArea(), a * b);
    }
}
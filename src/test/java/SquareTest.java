import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateArea() {
        float a = 1;
        Square square = new Square(a);
        assertEquals(square.calculateArea(), a * a);
    }
}
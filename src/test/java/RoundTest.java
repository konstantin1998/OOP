import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundTest {

    @Test
    void calculateArea() {
        float radius = 1;

        Round round = new Round(radius);
        assertEquals(round.calculateArea(), (float)Math.PI * radius * radius);
    }
}
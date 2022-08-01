import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle(10,10,15);
    @Test
    void calculatePerimeter() {
        assertEquals(35, triangle.calculatePerimeter(), 0);
    }

    @Test
    void calculateHalfPerimeter() {
        assertEquals(17.5, triangle.calculateHalfPerimeter(), 0);
    }

    @Test
    void calculateGeronArea() {
        assertEquals(49.607837082461074, triangle.calculateGeronArea(), 0);
    }

    @Test
    void isIsosceles() {
        assertTrue(triangle.isIsosceles());
    }

    @Test
    void isEquilateral() {
        assertFalse(triangle.isEquilateral());
    }
}
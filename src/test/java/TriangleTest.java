import org.example.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testIsValidTriangle_ValidTriangle() {
        assertTrue(Triangle.isValidTriangle(3, 4, 5));
    }

    @Test
    public void testIsValidTriangle_InvalidTriangle() {
        assertFalse(Triangle.isValidTriangle(1, 1, 3));
    }

    @Test
    public void testCalculateArea() {
        double area = Triangle.calculateArea(3, 4, 5);
        assertEquals(6.0, area, 0.0001); // Tham số thứ ba là sai số cho phép
    }
}

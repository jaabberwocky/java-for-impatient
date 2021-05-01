import com.tobias.corejava.exercises.ch02.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test1 {

    private Point point;

    @Test
    void testOrigin(){
        Point p = new Point();
        assertTrue(p.getX() == 0 && p.getY() == 0);
    }

    @Test
    void testGetX(){
        Point p = new Point(4,5);
        assertEquals(p.getX(), 4);
    }

    @Test
    void testGetY() {
        Point p = new Point(4,5);
        assertEquals(p.getY(), 5);
    }
}

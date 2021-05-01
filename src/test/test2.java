import com.tobias.corejava.exercises.ch02.Point;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("MoveFieldAssignmentToInitializer")
public class test2 {

    protected Point p;

    @BeforeAll
    static void initAll() {

    }

    @BeforeEach
    void setUp() {
        p = new Point(4,5);
    }

    @Test
    void testScale() {
        Point res = p.scale(0.5);
        assertTrue(res.getX() == 2.0 && res.getY() == 2.5);
    }

    @Test
    void testTranslate() {
        Point res = p.translate(1, 5);
        assertTrue(res.getX() == 5 && res.getY() == 10);
    }
}

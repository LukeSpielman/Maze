import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Spacetest {

    @Test
    public void testAdjacent() {
        Space a = new Space("O", 1, 1, 8);
        Space b = new Space("O", 1, 2, 8);
        assertTrue(a.isAdjacentTo(b));
    }
}

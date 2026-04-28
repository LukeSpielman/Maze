import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Spacetest {

    @Test
    public void testAdjacent() {
        Space a = new Space("O", 1, 1, 8);
        Space b = new Space("O", 1, 2, 8);
        assertTrue(a.isAdjacentTo(b));
    }

    @Test
    public void testNotAdjacentFarAway() {
        Space a = new Space("O", 0, 0, 8);
        Space b = new Space("O", 3, 3, 8);
        assertFalse(a.isAdjacentTo(b));
    }

    @Test
    public void testAdjacentVertical() {
        Space a = new Space("O", 1, 1, 8);
        Space b = new Space("O", 2, 1, 8);
        assertTrue(a.isAdjacentTo(b));
    }

    @Test
    public void testNotAdjacentDiagonal() {
        Space a = new Space("O", 1, 1, 8);
        Space b = new Space("O", 2, 2, 8);
        assertFalse(a.isAdjacentTo(b));
    }

    @Test
    public void testAdjacentToBlocked() {
        Space a = new Space("O", 1, 1, 8);
        Space b = new Space("X", 1, 2, 8);
        assertFalse(a.isAdjacentTo(b));
    }

    @Test
    public void testAdjacentToNull() {
        Space a = new Space("O", 1, 1, 8);
        assertFalse(a.isAdjacentTo(null));
    }

    @Test
    public void testOnPath() {
        Space a = new Space("O", 1, 1, 8);
        assertFalse(a.isOnPath());
        a.setOnPath(true);
        assertTrue(a.isOnPath());
    }

    @Test
    public void testVisited() {
        Space a = new Space("O", 1, 1, 8);
        assertFalse(a.isVisited());
        a.setVisited(true);
        assertTrue(a.isVisited());
    }
}
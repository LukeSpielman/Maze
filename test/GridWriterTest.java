import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridWriterTest {

    @Test
     void testSpaceTypesAreCorrect() {

        Space start = new Space("S", 0, 0, 2);
        Space end = new Space("E", 0, 1, 2);
        Space wall = new Space("X", 1, 0, 2);
        Space open = new Space("O", 1, 1, 2);

        assertTrue(start.isStart());
        assertTrue(end.isEnd());
        assertTrue(wall.isBlocked());
        assertFalse(open.isBlocked());
    }
    @Test
     void testPathMarking() {

        Space s = new Space("O", 0, 0, 2);

        assertFalse(s.isOnPath());

        s.setOnPath(true);

        assertTrue(s.isOnPath());
    }
}
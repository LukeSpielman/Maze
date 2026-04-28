import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Mazetest {

    @Test
    public void testStartAndEnd() {

        int numCols = 2;

        Space s0 = new Space("S", 0, 0, numCols);
        Space s1 = new Space(".", 0, 1, numCols);
        Space s2 = new Space(".", 1, 0, numCols);
        Space s3 = new Space("E", 1, 1, numCols);

        Space[] spaces = {s0, s1, s2, s3};

        Maze maze = new Maze(spaces, spaces.length);
        assertEquals("0", maze.getStart().getSpaceId());
        assertEquals("3", maze.getEnd().getSpaceId());
    }
}